export class ServerConfig {
  public  tomcatApplicationUrl:String;
  public  tomcatUserName:String;
  public  tomcatPassword:String;
  public  excelFolderUrl:String;

  constructor(tomcatApplicationUrl: String, tomcatUserName: String, tomcatPassword: String, excelFolderUrl: String) {
    this.tomcatApplicationUrl = tomcatApplicationUrl;
    this.tomcatUserName = tomcatUserName;
    this.tomcatPassword = tomcatPassword;
    this.excelFolderUrl = excelFolderUrl;
  }

  static isValid(serverConfig:ServerConfig):boolean {
    return serverConfig.tomcatApplicationUrl.length>0 &&
      serverConfig.tomcatUserName.length>0 &&
      serverConfig.tomcatPassword.length>0 &&
      serverConfig.excelFolderUrl.length>0  ;
  }


}
