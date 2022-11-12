package fhtw.Maintenance.Monitor.dto;

public class Status {
    private String statusMessage;
    //TODO clarify if "last update" message is when the status message was last updated or just the refresh of the frontend; maybe new attribute for datetime

    public Status() {
        this.statusMessage = "";
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        if(statusMessage != null){
            this.statusMessage = statusMessage;
        }
    }
}
