package com.rest.ws.primaryApp;

import com.rest.ws.primaryApp.security.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PrimaryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimaryAppApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SpringApplicationContext springApplicationContext(){

        return new SpringApplicationContext();
    }

    @Bean("ApplicationProperties")
    public ApplicationProperties getAppProperties(){

        return new ApplicationProperties();
    }


}
