package com.zpq.config;


import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;

@Configuration
public class AuthFeignConfiguration {

    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor(){
        return new BasicAuthorizationInterceptor("admin","admin123");
    }


}
