package fhtw.Maintenance.Monitor.dto;

public class Status {
    private String statusMessage;

    public Status() {
        setStatusMessage("");
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
