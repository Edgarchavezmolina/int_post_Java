package com.practica.services;

import com.practica.entities.Clientes;
import com.practica.models.ClientesDTO;

import java.util.List;

public interface ClientesService {

    ClientesDTO getClientes();

    List<Clientes> mostrar();

    Clientes insertar(Clientes personas);



}
