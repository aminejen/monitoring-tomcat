/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoring.model;

import java.io.Serializable;

/**
 *
 * @author Amine Jendoubi
 */
public class DataCapture implements Serializable {

    private static final long serialVersionUID = 1L;
    Long dateTime;
    Long memoryUsage;
    Long numberOfThreads;
    Long numberOfSessions;

    public Long getDateTime() {
        return dateTime;
    }

    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }

    public Long getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Long memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public Long getNumberOfThreads() {
        return numberOfThreads;
    }

    public void setNumberOfThreads(Long numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    public Long getNumberOfSessions() {
        return numberOfSessions;
    }

    public void setNumberOfSessions(Long numberOfSessions) {
        this.numberOfSessions = numberOfSessions;
    }

    public DataCapture(Long dateTime, Long memoryUsage, Long numberOfThreads, Long numberOfSessions) {
        this.dateTime = dateTime;
        this.memoryUsage = memoryUsage;
        this.numberOfThreads = numberOfThreads;
        this.numberOfSessions = numberOfSessions;
    }

    public DataCapture(Long dateTime, Long memoryUsage, Long numberOfThreads) {
        this.dateTime = dateTime;
        this.memoryUsage = memoryUsage;
        this.numberOfThreads = numberOfThreads;
    }

    public DataCapture() {
        this.dateTime = 0l;
        this.memoryUsage = 0l;
        this.numberOfThreads = 0l;
        this.numberOfSessions = 0l;
    }

    @Override
    public String toString() {
        return "DataCapture{" + "dateTime=" + dateTime + ", memoryUsage=" + memoryUsage + ", numberOfThreads=" + numberOfThreads + ", numberOfSessions=" + numberOfSessions + '}';
    }

}
