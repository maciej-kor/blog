package com.maciek.projects.blog;

import org.springframework.beans.ConfigurablePropertyAccessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);
    for (String s : context.getBeanDefinitionNames()){
        System.out.println(s);
    }

    }

}
