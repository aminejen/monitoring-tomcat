import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ServerConfigurationModule } from './server-configuration/server-configuration.module'
import { DashboardModule } from './dashboard/dashboard.module';
import {RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/components/dashboard/dashboard.component';
import { ServerConfigComponent } from './server-configuration/components/server-config/server-config.component';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    ServerConfigurationModule,
    DashboardModule,
    RouterModule.forRoot([
      {
        path: 'dashboard',
        component: DashboardComponent
      },
      {
        path: 'config',
        component: ServerConfigComponent
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
