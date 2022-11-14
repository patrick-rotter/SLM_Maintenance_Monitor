package fhtw.Maintenance.Monitor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MaintenanceMonitorApplicationTests {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertEquals("test", this.restTemplate.getForObject("http://localhost:" + port + "/message",
				String.class));
		this.restTemplate.postForLocation("http://localhost:" + port + "/reset", null);
		assertNull(this.restTemplate.getForObject("http://localhost:" + port + "/message",
				String.class));
	}

}
