package fhtw.Maintenance.Monitor.service;

import fhtw.Maintenance.Monitor.dto.Status;
import org.springframework.stereotype.Service;


@Service
public class MaintenanceMonitorService {
    private final Status status = new Status();

    public void postMessage(String message){
        status.setStatusMessage(message);
    }
}