package com.sd.consumidor.facade;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.consumidor.processor.ImageProcessor;
import com.sd.consumidor.producer.ConsumidorProducer;

@Service
public class ConsumidorFacade {

    @Autowired private ConsumidorProducer consumidorProducer; 

    public String sendImage(byte[] imageByte) throws IOException {
        
        byte[] grayImage = ImageProcessor.convertToGrayscale(imageByte);
        consumidorProducer.sendImage(grayImage);

        return "Imagem recebida e enviada para a fila de conversão.";
    }

}
