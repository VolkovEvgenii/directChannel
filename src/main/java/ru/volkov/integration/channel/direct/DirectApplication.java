package ru.volkov.integration.channel.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@EnableIntegration
public class DirectApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway gateway;

    public static void main(String[] args) {
        SpringApplication.run(DirectApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 0; i < 10; i++) {
            Message<String> message = MessageBuilder.withPayload("Printing message for payload " + i).build();
            this.gateway.print(message);
        }
    }
}
