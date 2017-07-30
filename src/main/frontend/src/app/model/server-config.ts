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

  isValid():boolean {
    return this.tomcatApplicationUrl.length>0 &&
      this.tomcatUserName.length>0 &&
      this.tomcatPassword.length>0 &&
      this.excelFolderUrl.length>0  ;
  }


}
