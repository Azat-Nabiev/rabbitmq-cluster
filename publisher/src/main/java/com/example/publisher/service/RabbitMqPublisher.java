package com.example.publisher.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class RabbitMqPublisher {
    private static final String exchangeName = "my-direct-exchange";
    private static final String routingKey = "my-routing-key";

    private final RabbitTemplate rabbitTemplate;

    @Scheduled(fixedRate = 100)
    public void sendMessage() {
        String message = "Message: " + LocalDateTime.now();
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
    }
}
