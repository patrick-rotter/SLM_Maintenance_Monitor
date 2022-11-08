package fhtw.Maintenance.Monitor.controller;

import fhtw.Maintenance.Monitor.service.MaintenanceMonitorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {
    private final MaintenanceMonitorService service;

    public MaintenanceMonitorController(MaintenanceMonitorService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public String getMessage() {
        return service.getMessage();
    }
}
