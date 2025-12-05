package com.sd.demo_backend_api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sd.demo_backend_api.facade.cadastroTransferenciaFacade;
import com.sd.demo_backend_api.dto.cadastroDTO;
import com.sd.demo_backend_api.dto.transferenciaDTO;

@RestController
@RequestMapping("/cadastroTransferencia")
public class cadastroTransferenciaAPI {

    @Autowired private cadastroTransferenciaFacade cadastroTransferenciaFacade;

    @PostMapping("/cadastro")
    public String cadastro(@RequestBody cadastroDTO request){

        return cadastroTransferenciaFacade.cadastro(request); 
    }

    @PostMapping("/transferencia")
    public String transferencia(@RequestBody transferenciaDTO request){
        return cadastroTransferenciaFacade.transferencia(request);
    }

}
