package com.sd.consumidor.producer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConsumidorProducer {

    @Autowired private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange.fanout.name}") 
    private String fannoutName; 
    
    public void sendImage(byte[] imageBytes) {
        
        rabbitTemplate.convertAndSend(
            fannoutName,                      
            "",  
            imageBytes               
        );
    }


}
