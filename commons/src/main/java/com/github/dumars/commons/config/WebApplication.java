package com.github.dumars.commons.config;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrix
public class WebApplication {

    @Bean
    @LoadBalanced
    @Primary
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
