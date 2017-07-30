import { Component, OnInit } from '@angular/core';
import { ServerConfigurationDataService } from '../../services/server-configuration-data.service';
import {ServerConfig} from "../../../model/server-config";
@Component({
  selector: 'app-server-config',
  templateUrl: './server-config.component.html',
  styleUrls: ['./server-config.component.css']
})
export class ServerConfigComponent implements OnInit {
  serverConfig : ServerConfig;
  constructor(private serverConfigurationDataService:ServerConfigurationDataService){
    this.serverConfig = new ServerConfig('','','','');
  }

  saveServerConfig(){
    if (this.serverConfig.isValid()){
      this.serverConfigurationDataService.setServerConfig(this.serverConfig);
    }
  }

  ngOnInit() {
  }

}
