package com.mr.kal;

import com.mr.kal.service.SpringMavenService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    SpringMavenService springMavenService;
    public static void main(String[] args) {
        SpringMavenService springMavenService = new SpringMavenService();
        springMavenService.exec();
    }
}
