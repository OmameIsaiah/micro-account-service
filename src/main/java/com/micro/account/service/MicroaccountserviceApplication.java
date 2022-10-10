package com.micro.account.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//@PropertySource(value = "file:/opt/appdocs/jenkins/accountmicroservice/application.yml", ignoreResourceNotFound = true)
@PropertySource(value = "file:/opt/appdocs/jenkins/accountmicroservice/application.properties", ignoreResourceNotFound = true)
//@PropertySource(value = "file:C:\\SwipeTech\\Projects\\MICROSERVICES_GIT\\APPLICATION-PROPERTIES\\account-micro-service\\application.yml", ignoreResourceNotFound = true)

//@Configuration
@EnableEurekaClient
@EnableCaching
@SpringBootApplication
public class MicroaccountserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroaccountserviceApplication.class, args);
    }

    /*
    @Configuration
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll()
                    .and().csrf().disable();
        }
    }

     */
}
