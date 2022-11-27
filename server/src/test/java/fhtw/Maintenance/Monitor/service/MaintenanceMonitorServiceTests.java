package fhtw.Maintenance.Monitor.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorServiceTests {
    private final MaintenanceMonitorService service = new MaintenanceMonitorService();

    @Test
    void testDefaultState() {
        assertEquals("", service.getMessage());
    }

    @Test
    void testCustomMessage() {
        service.setMessage("hallo");
        assertEquals("hallo", service.getMessage());
    }

    @Test
    void postMessage() {
        service.setMessage("");
        assertEquals("", service.getMessage());
        service.setMessage("test");
        assertEquals("test", service.getMessage());
        service.setMessage("Hello world");
        assertEquals("Hello world", service.getMessage());
        service.setMessage("");
        assertEquals("", service.getMessage());
    }

}
