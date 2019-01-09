package com;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ServerPickApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServerPickApplication.class, args);
	}

	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        return new ServletRegistrationBean(servlet, "*.xhtml");
    }
	
	@Override
	public void run(String... arg0) throws Exception {
			
	}
}
