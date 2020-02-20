package com.mr.kal;

import com.mr.kal.service.SpringMavenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalApplication {
    public static void main(String[] args) {
        SpringApplication.run(KalApplication.class, args);
        System.out.println("Test");

    }

}
