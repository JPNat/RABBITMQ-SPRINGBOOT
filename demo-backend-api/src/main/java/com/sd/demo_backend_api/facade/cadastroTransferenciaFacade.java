package com.sd.demo_backend_api.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.demo_backend_api.dto.cadastroDTO;
import com.sd.demo_backend_api.dto.transferenciaDTO;
import com.sd.demo_backend_api.producer.cadastroTransferenciaRequestProducer;

@Service
public class cadastroTransferenciaFacade {

    @Autowired private cadastroTransferenciaRequestProducer producer;

    public String cadastro(cadastroDTO request){

        try{
            producer.cadastrar(request);

        } catch(Exception e){

            return "Ocorreu um erro ao solicitar o pagamento" + e.getMessage();
        }

        return "Cadastro sendo confirmado";
    } 

    public String transferencia(transferenciaDTO request){
        return "Transferencia sendo confirmada";
    }

}
