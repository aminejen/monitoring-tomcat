import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import{DataServiceService} from './services/data-service.service';

@NgModule({
  imports: [
    CommonModule
  ],
  exports:[
    DashboardComponent
  ],
  providers: [DataServiceService],
  declarations: [DashboardComponent]
})
export class DashboardModule { }
