package com.github.dumars.message.receiver;

import com.github.dumars.commons.config.SwaggerConfig;
import com.github.dumars.commons.config.WebApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableFeignClients
@Import({WebApplicationConfig.class, SwaggerConfig.class})
public class MessageReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageReceiverApplication.class, args);
    }

}
