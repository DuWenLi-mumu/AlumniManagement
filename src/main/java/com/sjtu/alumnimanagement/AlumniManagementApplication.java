package com.sjtu.alumnimanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan("com.sjtu.alumnimanagement")
public class AlumniManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlumniManagementApplication.class, args);
    }

}
