package com.sd.consumidor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Classe para criar automaticamente filas e exchanges
    // sem configurar no Broker


    @Value("${rabbitmq.exchange.fanout.name}") 
    private String fanoutExchangeName;

    @Value("${rabbitmq.queue.storage.a}") 
    private String storageQueueAName;

    @Value("${rabbitmq.queue.storage.b}") 
    private String storageQueueBName;
}
