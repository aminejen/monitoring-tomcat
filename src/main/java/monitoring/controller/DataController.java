package monitoring.controller;


import javax.servlet.http.HttpServletResponse;
import monitoring.model.DataCapture;
import monitoring.service.MonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Amine Jendoubi
 */
@RestController
public class DataController {

    @Autowired
    private MonitoringService monitoringService;



    @RequestMapping("/data")
    public DataCapture data(HttpServletResponse  response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return monitoringService.getInstantMonitoringDataCapture();
    }


}
