package com.sd.demo_backend_api.producer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


@Component
public class ImageProducer {

    @Autowired private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.queue.name}") 
    private String queueName; 
    
    public void sendImage(byte[] imageBytes) {
        
        rabbitTemplate.convertAndSend(
            "",                      
            queueName,  
            imageBytes               
        );
    }


}
