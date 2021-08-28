package com.jacky.grocerylist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jacky
 * @project grocery-list
 * @description
 * @date Aug-27-2021 16:04
 */

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}