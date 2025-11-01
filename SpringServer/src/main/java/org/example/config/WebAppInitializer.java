package org.example.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        // Create the Spring application context
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        // Create the dispatcher servlet
        DispatcherServlet servlet = new DispatcherServlet(context);
        
        // Register and configure the dispatcher servlet
        ServletRegistration.Dynamic registration = servletContext.addServlet("mvc", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}