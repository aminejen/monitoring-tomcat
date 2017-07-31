export class Data {
  public dateTime;
  public memoryUsage;
  public numberOfThreads;
  public numberOfSessions;

  constructor(dateTime, memoryUsage, numberOfThreads, numberOfSessions) {
    this.dateTime = dateTime;
    this.memoryUsage = memoryUsage;
    this.numberOfThreads = numberOfThreads;
    this.numberOfSessions = numberOfSessions;
  }
}
