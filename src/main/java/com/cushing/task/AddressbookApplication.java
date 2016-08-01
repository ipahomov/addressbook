package com.cushing.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackages = "com.cushing.task.model")
@EnableJpaRepositories(basePackages = "com.cushing.task.repository")
public class AddressbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressbookApplication.class, args);
    }
}
