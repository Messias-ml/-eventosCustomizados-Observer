package com.senhoresenhora.evento.notificadores;

import com.senhoresenhora.evento.clientes.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Qualifier("normal")
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificarCliente(Cliente cliente, String mensagem){
        //Poderia ter uma implementação real de email para notificarmos clientes.
        System.out.println("NOTIFICADOR VIA EMAIL:"+ mensagem + cliente.getNome());
    }
}
