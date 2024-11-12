package com.example.JenkinsPipeline.controller;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Unit test for WelcomeController.
 * Tests the /welcome endpoint to ensure it returns the expected response.
 */
@WebMvcTest(WelcomeController.class)
public class TestWelcomeController {

    // MockMvc is used to perform HTTP requests in the test without starting a real server.
    @Autowired
    private MockMvc mockMvc;

    /**
     * Tests the /welcome endpoint of WelcomeController.
     * This test verifies that the endpoint returns a 200 OK status
     * and the correct welcome message.
     */
    @Test
    public void testWelcomeEndpoint() throws Exception {
        // Perform a GET request to the /welcome endpoint.
        mockMvc.perform(get("/welcome"))
                // Check if the HTTP status is 200 OK.
                .andExpect(status().isOk())
                // Check if the response body contains the expected message.
                .andExpect(content().string("Welcome to Jenkins Pipeline"));
    }
}
