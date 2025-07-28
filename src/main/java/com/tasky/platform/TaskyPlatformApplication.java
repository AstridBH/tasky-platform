package com.tasky.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TaskyPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskyPlatformApplication.class, args);
    }

}
