import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ServerConfigurationModule } from './server-configuration/server-configuration.module'

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    ServerConfigurationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
