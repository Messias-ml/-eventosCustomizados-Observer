package com.senhoresenhora.evento.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class AtivarClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativarCliente(Cliente cliente){
        cliente.setAtivo(true);
        eventPublisher.publishEvent(cliente);
    }
}
