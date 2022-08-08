package com.senhoresenhora.evento.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private AtivarClienteService service;

    @GetMapping("/cliente")
    public void ativarCliente(){
        Cliente cliente = new Cliente("Messias");
        service.ativarCliente(cliente);
    }
}
