package ru.volkov.integration.channel.direct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.MessageChannel;

@Configuration
public class CustomInputChannel {

    @Bean
    public MessageChannel inputChannel() {
        return new DirectChannel();
    }
}
