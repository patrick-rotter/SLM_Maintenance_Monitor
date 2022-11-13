package fhtw.Maintenance.Monitor.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorServiceTests {
    private final MaintenanceMonitorService service = new MaintenanceMonitorService();

    @Test
    void testDefaultState() {
        assertEquals("test", service.getMessage());
    }

    @Test
    void testCustomMessage() {
        service.setMessage("hallo");
        assertEquals("hallo", service.getMessage());
    }

}
