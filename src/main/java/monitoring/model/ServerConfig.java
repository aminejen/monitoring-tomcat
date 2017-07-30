/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoring.model;

/**
 *
 * @author Amine Jendoubi
 */
public class ServerConfig {

    private String tomcatApplicationUrl;
    private String tomcatUserName;
    private String tomcatPassword;
    private String excelFolderUrl;

    public String getTomcatApplicationUrl() {
        return tomcatApplicationUrl;
    }

    public void setTomcatApplicationUrl(String tomcatApplicationUrl) {
        this.tomcatApplicationUrl = tomcatApplicationUrl;
    }

    public String getTomcatUserName() {
        return tomcatUserName;
    }

    public void setTomcatUserName(String tomcatUserName) {
        this.tomcatUserName = tomcatUserName;
    }

    public String getTomcatPassword() {
        return tomcatPassword;
    }

    public void setTomcatPassword(String tomcatPassword) {
        this.tomcatPassword = tomcatPassword;
    }

    public String getExcelFolderUrl() {
        return excelFolderUrl;
    }

    public void setExcelFolderUrl(String excelFolderUrl) {
        this.excelFolderUrl = excelFolderUrl;
    }

}
