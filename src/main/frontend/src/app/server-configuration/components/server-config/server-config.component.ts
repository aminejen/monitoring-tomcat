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
  isValid:boolean;
  constructor(private serverConfigurationDataService:ServerConfigurationDataService){
    this.isValid=false;
    this.serverConfig = new ServerConfig('','','','');
  }

  saveServerConfig(){
    if (ServerConfig.isValid(this.serverConfig)){
      this.isValid=true;
      this.serverConfigurationDataService.setServerConfig(this.serverConfig);
    }else{
      this.isValid=false;
    }
  }

  ngOnInit() {
    this.serverConfigurationDataService.getServerConfig().subscribe(
      (data) => this.serverConfig=data.json()
    )
  }

}
