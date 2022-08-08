package com.senhoresenhora.evento.notificadores;

import com.senhoresenhora.evento.clientes.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificadorService {

    @Qualifier("rapido")
    @Autowired
    private Notificador notificador;

    @EventListener
    public void notificarCliente(Cliente cliente){
        if (cliente.isAtivo()){
        notificador.notificarCliente(cliente, "Foi notificado o(a) cliente ");
        }else{
            System.out.println("cliente não foi notificado");
        }
    }
}
