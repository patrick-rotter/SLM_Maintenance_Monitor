package fhtw.Maintenance.Monitor.controller;

import fhtw.Maintenance.Monitor.service.MaintenanceMonitorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private final MaintenanceMonitorService service;

    public MaintenanceMonitorController(MaintenanceMonitorService service) {
        this.service = service;
    }

    @PostMapping("/post/{message}")
    void setMessage(@PathVariable String message){
        service.postMessage(message);
    }
}
