import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';


@Injectable()
export class DataServiceService {
  url;

  constructor(private http:Http){
    this.url="/data"
  }


  getData() {
      return this.http.get(this.url);
  }

}
