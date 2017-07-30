import { TestBed, inject } from '@angular/core/testing';

import { ServerConfigurationDataService } from './server-configuration-data.service';

describe('ServerConfigurationDataService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ServerConfigurationDataService]
    });
  });

  it('should be created', inject([ServerConfigurationDataService], (service: ServerConfigurationDataService) => {
    expect(service).toBeTruthy();
  }));
});
