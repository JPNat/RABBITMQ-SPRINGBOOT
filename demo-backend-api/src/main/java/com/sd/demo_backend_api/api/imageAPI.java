package com.sd.demo_backend_api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sd.demo_backend_api.facade.cadastroTransferenciaFacade;

@RestController
@RequestMapping("/image")
public class imageAPI {

    @Autowired private cadastroTransferenciaFacade cadastroTransferenciaFacade;

    @PostMapping("/send")
    public String uploadImage(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return "O arquivo de imagem está vazio";
        }

        try {
            
            return cadastroTransferenciaFacade.Upload(file);

        } catch (Exception e) {
            return "Erro ao processar a imagem: " + e.getMessage();
        }
    }

}
