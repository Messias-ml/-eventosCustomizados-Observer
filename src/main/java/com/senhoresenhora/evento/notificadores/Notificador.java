package com.senhoresenhora.evento.notificadores;

import com.senhoresenhora.evento.clientes.Cliente;

public interface Notificador {

    void notificarCliente(Cliente cliente, String mensagem);
}
