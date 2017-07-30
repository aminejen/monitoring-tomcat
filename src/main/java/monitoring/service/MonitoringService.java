/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoring.service;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;
import monitoring.model.DataCapture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 *
 * @author Amine Jendoubi
 */
@Service
public class MonitoringService {

    @Autowired
    private Environment env;
    
    @Autowired
    private ServerConfigService serverConfigService;


    public DataCapture getInstantMonitoringDataCapture() {
        String urlThread = serverConfigService.getServerConfig().getTomcatApplicationUrl()+"/manager/status";
        String urlSessions = serverConfigService.getServerConfig().getTomcatApplicationUrl()+"/manager/html/list";
        FileWriter writer = null;
        try {

            DataCapture dataCapture = getFormatedMemoryThreadString(getHtmlFromUrl(urlThread));
            String sessions = getFormatedSessionString(getHtmlFromUrl(urlSessions));
            dataCapture.setNumberOfSessions(Long.valueOf(sessions));
            return dataCapture;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new DataCapture();
    }

    private String getHtmlFromUrl(String url) {
        String content = null;
        URLConnection connection = null;
        try {
            String username = serverConfigService.getServerConfig().getTomcatUserName();
            String password = serverConfigService.getServerConfig().getTomcatPassword();
            connection = new URL(url).openConnection();
            String userpass = username + ":" + password;
            String basicAuth = "Basic " + new String(Base64.encode(userpass.getBytes()));
            connection.setRequestProperty("Authorization", basicAuth);
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return content;
    }

    private String getFormatedSessionString(String data) {
        String sessions = data.split("/manager/html/sessions")[1]
                .split(">")[1].split("<")[0];
        return sessions;
    }

    private DataCapture getFormatedMemoryThreadString(String data) {
        String usedMemory = data.split("</td></tr><tr><td>G1 Survivor Space")[0].split("Heap memory")[2].split("</td><td>")[4].split("\\.")[0];
        String busyThreads = data.split("Current thread busy: ")[1].split(" ")[0].split("</br>")[0];
        return new DataCapture(new Date().getTime(), Long.valueOf(usedMemory), Long.valueOf(busyThreads));
    }
}
