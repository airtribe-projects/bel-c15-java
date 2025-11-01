package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    private UserController userController;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
        userController = new UserController(userService);
    }

    @Test
    void testHealthEndpoint() {
        ResponseEntity<Map<String, String>> response = userController.health();
        
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertEquals("OK", response.getBody().get("status"));
        assertEquals("Spring Server is running", response.getBody().get("message"));
    }

    @Test
    void testGetAllUsers() {
        ResponseEntity<List<User>> response = userController.getAllUsers();
        
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertEquals(3, response.getBody().size()); // Initial sample data
    }

    @Test
    void testCreateUser() {
        User newUser = new User(null, "Test User", "test@example.com", 25);
        ResponseEntity<User> response = userController.createUser(newUser);
        
        assertEquals(201, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertNotNull(response.getBody().getId());
        assertEquals("Test User", response.getBody().getName());
    }

    @Test
    void testGetUserById() {
        // Get existing user (ID 1 should exist from sample data)
        ResponseEntity<User> response = userController.getUserById(1L);
        
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertEquals(1L, response.getBody().getId());
    }

    @Test
    void testGetUserByIdNotFound() {
        ResponseEntity<User> response = userController.getUserById(999L);
        
        assertEquals(404, response.getStatusCode().value());
    }

    @Test
    void testWelcomeEndpoint() {
        ResponseEntity<Map<String, String>> response = userController.welcome();
        
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertEquals("Welcome to Spring Server API", response.getBody().get("message"));
        assertEquals("1.0.0", response.getBody().get("version"));
    }
}