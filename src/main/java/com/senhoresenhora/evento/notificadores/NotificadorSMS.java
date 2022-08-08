package com.senhoresenhora.evento.notificadores;

import com.senhoresenhora.evento.clientes.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Qualifier("devagar")
@Component
public class NotificadorSMS implements Notificador{

    @Override
    public void notificarCliente(Cliente cliente, String mensagem) {
        System.out.println("NOTIFICADOR VIA SMS:"+ mensagem + cliente.getNome());
    }
}
