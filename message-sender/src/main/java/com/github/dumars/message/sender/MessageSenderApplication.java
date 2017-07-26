package com.github.dumars.message.sender;

import com.github.dumars.commons.config.SwaggerConfig;
import com.github.dumars.commons.config.WebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableFeignClients
@Import({WebApplication.class, SwaggerConfig.class})
public class MessageSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageSenderApplication.class, args);
    }

}
