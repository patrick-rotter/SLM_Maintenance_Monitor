package fhtw.Maintenance.Monitor.dto;

import java.util.Date;

public class Status {
    private String statusMessage;
    private Date lastUpdateTime;
    //TODO clarify if "last update" message is when the status message was last updated or just the refresh of the frontend; maybe new attribute for datetime

    public Status() {
        setStatusMessage("test");
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        if(statusMessage != null){
            this.statusMessage = statusMessage;
            this.lastUpdateTime = new Date();
        }
    }
    @Override
    public String toString() {
        return String.format("%d=%s", this.lastUpdateTime.getTime(), this.getStatusMessage());
    }
}
