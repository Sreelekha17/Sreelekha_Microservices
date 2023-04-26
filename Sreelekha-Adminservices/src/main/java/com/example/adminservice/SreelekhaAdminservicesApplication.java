package com.example.adminservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication



































@EnableEurekaClient
@ComponentScan(basePackages="com.example")
public class SreelekhaAdminservicesApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SreelekhaAdminservicesApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8761"));
        app.setDefaultProperties(Collections.singletonMap("spring.datasource.url", "jdbc:mysql://localhost:3306/bank"));
        app.setDefaultProperties(Collections.singletonMap("spring.datasource.driver-class-name", "com.mysql.cj.jdbc.Driver"));
        app.setDefaultProperties(Collections.singletonMap("spring.datasource.username", "root"));
        app.setDefaultProperties(Collections.singletonMap("spring.datasource.password", "Rps@12345"));
        app.setDefaultProperties(Collections.singletonMap("spring.jpa.hibernate.ddl-auto", "update"));
        app.run(args);
}
}
