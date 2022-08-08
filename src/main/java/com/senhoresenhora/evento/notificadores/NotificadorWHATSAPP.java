package com.senhoresenhora.evento.notificadores;

import com.senhoresenhora.evento.clientes.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("rapido")
@Component
public class NotificadorWHATSAPP implements Notificador{

    @Override
    public void notificarCliente(Cliente cliente, String mensagem) {
        System.out.println("NOTIFICADOR VIA WHATSAPP:"+ mensagem + cliente.getNome());
    }
}
