package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev") 
class ConfigureJSFContextParameters implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        servletContext.setInitParameter("javax.faces.DEFAULT_SUFFIX",".xhtml");
        servletContext.setInitParameter("javax.faces.PARTIAL_STATE_SAVING_METHOD", "true");
        servletContext.setInitParameter("javax.faces.PROJECT_STAGE","Development");
        servletContext.setInitParameter("facelets.DEVELOPMENT", "true");
        servletContext.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "1");

    }
}