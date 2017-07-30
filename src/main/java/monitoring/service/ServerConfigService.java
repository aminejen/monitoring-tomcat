/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoring.service;

import monitoring.model.ServerConfig;
import org.springframework.stereotype.Service;

/**
 *
 * @author Amine Jendoubi
 */
@Service
public class ServerConfigService {

    private ServerConfig serverConfig;

    public ServerConfig getServerConfig() {
        return serverConfig;
    }

    public void setServerConfig(ServerConfig serverConfig) {
        this.serverConfig = serverConfig;
        System.out.println(this.serverConfig);
    }
    
}
