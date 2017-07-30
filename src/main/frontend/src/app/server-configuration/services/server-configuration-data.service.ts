import { Injectable } from '@angular/core';
import { Http, Response ,Headers, RequestOptions } from '@angular/http';
import { ServerConfig } from '../../model/server-config'
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
@Injectable()
export class ServerConfigurationDataService {
  url;

  constructor(private http:Http){
    this.url="/serverConfig"
  }

  setServerConfig(serverConfig:ServerConfig) {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    this.http.post(this.url, serverConfig, options).subscribe(
    )
  }

  getServerConfig() {
    this.http.get(this.url).subscribe(
      (data)=> console.log(data.json())
    )
  }

}
