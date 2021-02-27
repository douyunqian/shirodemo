package com.edu.spring;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@MapperScan(basePackages = "com.edu.spring.mapper")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

    @RequestMapping("/")
    public String home(){
        return "hello Spring boot";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostAuthorize("hasRole('')")
    @PreFilter("")//对集合的入参值进行过滤
    @PostFilter("")//对集合的返回值进行过滤
    @RequestMapping("/roleAuth")
    public String role(){
        return "admin auth";
    }
}
