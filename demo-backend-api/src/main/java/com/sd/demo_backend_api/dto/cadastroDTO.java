package com.sd.demo_backend_api.dto; 

public class cadastroDTO{

    private String cpf;
    private String nome;

    public cadastroDTO() {
    }

    public cadastroDTO(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}