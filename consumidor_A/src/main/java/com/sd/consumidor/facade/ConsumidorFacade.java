package com.sd.consumidor.facade;

import org.springframework.stereotype.Service;

@Service
public class ConsumidorFacade {

    public String save(byte[] imageByte) {
        
        return "Imagem salva";
    }
}