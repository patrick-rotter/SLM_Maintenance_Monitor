package fhtw.Maintenance.Monitor.service;

import fhtw.Maintenance.Monitor.dto.Status;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorServiceTest {
    private final Status status = new Status();
    private final MaintenanceMonitorService service = new MaintenanceMonitorService(status);

    @Test
    void postMessage() {
        assertEquals("", status.getStatusMessage());
        service.postMessage("test");
        assertEquals("test", status.getStatusMessage());
        service.postMessage("");
    }
}