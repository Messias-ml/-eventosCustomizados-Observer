package com.senhoresenhora.evento.clientes;

import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private boolean ativo = false;

    public Cliente(String nome) {
        this.nome = nome;
    }
}
