package ru.volkov.integration.channel.direct;

import org.springframework.core.annotation.Order;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class UpperCasePrintService {

    @ServiceActivator(inputChannel = "inputChannel")
    @Order(2)
    public void print(Message<String> message) {
        System.out.println(message.getPayload().toUpperCase());
    }
}
