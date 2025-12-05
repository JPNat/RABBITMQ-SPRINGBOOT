package com.sd.demo_backend_api.dto; 

public class transferenciaDTO{

    private String placa;
    private String novoCpf;

    // Construtor vazio (necessário para serialização/desserialização)
    public transferenciaDTO() {
    }

    // Construtor com todos os campos
    public transferenciaDTO(String placa, String novoCpf) {
        this.placa = placa;
        this.novoCpf= novoCpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNovoCpf() {
        return novoCpf;
    }

    public void setNovoCpf (String novoCpf) {
        this.novoCpf= novoCpf;
    }

}