package com.practica.controllers;

import com.practica.entities.Clientes;
import com.practica.models.ClientesDTO;
import com.practica.services.ClientesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/clientes")
public class Personas {
    @Autowired
    ClientesService clientesService;

    @GetMapping("/listar/v1")
    ClientesDTO all() {
        return clientesService.getClientes();
    }

    @GetMapping("/listar/v3")
    public List<Clientes> listar(){
        log.info("Se ejecutó el método listar()");
        return clientesService.mostrar();
    }

    @PostMapping("/clientes")
    public Clientes registrarPersona(@RequestBody Clientes personas){
        log.info("Se ejecutó el método registrarcliente()");
        return clientesService.insertar(personas);
    }
}
