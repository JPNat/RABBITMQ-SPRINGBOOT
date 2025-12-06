package com.sd.demo_backend_api.facade;

import java.io.IOException;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.sd.demo_backend_api.producer.ImageProducer;

@Service
public class ImageFacade {

    @Autowired private ImageProducer imageProducer; 


    public String processImageUpload(MultipartFile file) throws IOException {

        byte[] imageBytes = file.getBytes();
        
        imageProducer.sendImage(imageBytes);

        return "Imagem recebida e enviada para a fila de conversão.";
    }

}
