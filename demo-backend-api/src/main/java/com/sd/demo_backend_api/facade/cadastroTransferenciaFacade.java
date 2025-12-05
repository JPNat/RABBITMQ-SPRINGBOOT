package com.sd.demo_backend_api.facade;

import org.springframework.stereotype.Service;

import com.sd.demo_backend_api.dto.cadastroDTO;
import com.sd.demo_backend_api.dto.transferenciaDTO;

@Service
public class cadastroTransferenciaFacade {

    public String cadastro(cadastroDTO request){
        return "Cadastro sendo confirmado";
    }

    public String transferencia(transferenciaDTO request){
        return "Transferencia sendo confirmada";
    }

}
