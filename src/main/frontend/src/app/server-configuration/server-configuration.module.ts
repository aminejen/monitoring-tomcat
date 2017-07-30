import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { ServerConfigurationDataService } from './services/server-configuration-data.service';
import { ServerConfigComponent } from './components/server-config/server-config.component'


@NgModule({
  imports: [
    CommonModule,
    HttpModule,
    FormsModule
  ],
  exports: [
    ServerConfigComponent
  ],
  providers: [ServerConfigurationDataService],
  declarations: [ServerConfigComponent]
})
export class ServerConfigurationModule {


}
