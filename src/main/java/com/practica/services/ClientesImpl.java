package com.practica.services;

import com.practica.entities.Clientes;
import com.practica.mappers.ClientesMapper;
import com.practica.models.ClientesDTO;
import com.practica.models.ClientesProjection;
import com.practica.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientesImpl implements ClientesService{

    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public List<Clientes> mostrar() {
        return clientesRepository.findAll();
    }
    @Override
    public Clientes insertar(Clientes personas){
        return clientesRepository.save(personas);
    }




    @Override
    public ClientesDTO getClientes() {
        List<ClientesProjection> listarPersonas = clientesRepository.findByFechaimportacion(4555);

        return ClientesDTO
                .builder()
                .clientesResponse(
                        listarPersonas
                                .parallelStream()
                                .map(ClientesMapper::getClientesResponse)
                                .collect(Collectors.toList())
                )
                .build();
    }
}
