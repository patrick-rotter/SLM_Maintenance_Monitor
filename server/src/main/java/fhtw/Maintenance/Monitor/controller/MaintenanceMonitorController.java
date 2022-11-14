package fhtw.Maintenance.Monitor.controller;

import fhtw.Maintenance.Monitor.service.MaintenanceMonitorService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class MaintenanceMonitorController {
    private final MaintenanceMonitorService service;

    public MaintenanceMonitorController(MaintenanceMonitorService service) {
        this.service = service;
    }


    @GetMapping("/message")
    public String getMessage() {
        return service.getMessage();
    }

    @PostMapping("/reset")
    public void resetMsg() {
        service.setMessage("");
    }

    @PostMapping("/post/{message}")
    void setMessage(@PathVariable String message){
        service.setMessage(message);
    }
}
