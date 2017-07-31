import { Component, OnInit } from '@angular/core';
import {DataServiceService } from '../../services/data-service.service'
import {Data} from '../../../model/data';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  dataCapture: Data;


  constructor(private dataServiceService: DataServiceService) {
  }

  ngOnInit() {
    this.updateData();
    }

    updateData(){
      this.dataServiceService.getData()
        .subscribe(
          (data) => {
            this.dataCapture = data.json()
          }
        )
      setTimeout(() => {this.updateData()},1000)
    }



}




