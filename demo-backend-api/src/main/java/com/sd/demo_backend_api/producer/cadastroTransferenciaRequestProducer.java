package com.sd.demo_backend_api.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import com.sd.demo_backend_api.dto.cadastroDTO;

import tools.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;


@Component
public class cadastroTransferenciaRequestProducer {

    @Autowired private AmqpTemplate amqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void cadastrar(cadastroDTO cadastro){

        amqpTemplate.convertAndSend(
            "cadastroTransferencia-request-exchange",
            "cadastroTransferencia-request-rout-key",
            objectMapper.writeValueAsString(cadastro)
        );
    }


}
