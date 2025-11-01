package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.example.config.WebAppInitializer;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Spring Server...");
        
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getHost().setAppBase(".");
        
        try {
            // Create a context for our web application
            Context context = tomcat.addWebapp("", new File(".").getAbsolutePath());
            
            // Add our web application initializer
            context.addApplicationListener(WebAppInitializer.class.getName());
            
            tomcat.start();
            
            System.out.println("=================================");
            System.out.println("Spring Server started successfully!");
            System.out.println("Server running on: http://localhost:8080");
            System.out.println("API endpoints:");
            System.out.println("  - GET  /api/health");
            System.out.println("  - GET  /api/welcome");
            System.out.println("  - GET  /api/users");
            System.out.println("  - GET  /api/users/{id}");
            System.out.println("  - POST /api/users");
            System.out.println("  - PUT  /api/users/{id}");
            System.out.println("  - DELETE /api/users/{id}");
            System.out.println("  - GET  /api/users/search?name={name}");
            System.out.println("=================================");
            
            tomcat.getServer().await();
            
        } catch (LifecycleException e) {
            System.err.println("Failed to start the server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}