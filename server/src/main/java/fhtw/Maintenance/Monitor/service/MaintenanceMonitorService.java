package fhtw.Maintenance.Monitor.service;

import fhtw.Maintenance.Monitor.dto.Status;
import org.springframework.stereotype.Service;


@Service
public class MaintenanceMonitorService {
    private final Status status;

    public MaintenanceMonitorService(Status status) {
        this.status = status;
    }

    public MaintenanceMonitorService() {
        this.status = new Status();
    }

    public String getMessage() {
        return status.getStatusMessage();
    }

    public void setMessage(String msg) {
        status.setStatusMessage(msg);
    }

    public void postMessage(String message){
        status.setStatusMessage(message);
    }
}
