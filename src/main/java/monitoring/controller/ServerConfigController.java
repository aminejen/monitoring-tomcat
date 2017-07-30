/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoring.controller;

import javax.servlet.http.HttpServletResponse;

import monitoring.model.ServerConfig;
import monitoring.service.ServerConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Amine Jendoubi
 */
@RestController
public class ServerConfigController {
    
    @Autowired
    private ServerConfigService serverConfigService;
    
    @RequestMapping(method = RequestMethod.POST, value = "/serverConfig")
    public void serverConfig(@RequestBody ServerConfig serverConfig) {
        System.out.println("done");
        serverConfigService.setServerConfig(serverConfig);
    }
    
      @RequestMapping("/serverConfig")
    public ServerConfig serverConfig(HttpServletResponse  response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return serverConfigService.getServerConfig();
    }
}
