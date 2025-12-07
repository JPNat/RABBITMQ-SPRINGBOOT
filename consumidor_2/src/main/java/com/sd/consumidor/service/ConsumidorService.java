package com.sd.consumidor.service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.consumidor.facade.ConsumidorFacade;
import com.sd.consumidor.processor.ImageProcessor;

import java.io.IOException;

@Service
public class ConsumidorService {

    @Autowired private ConsumidorFacade facade;

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(byte[] imageReceveid) throws IOException{

        System.out.println("✅ Consumidor C2: Imagem recebida");
        
        facade.sendImage(imageReceveid);
    }
}
