package com.practica.repositories;

import com.practica.entities.Clientes;
import com.practica.models.ClientesProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {


    List<ClientesProjection> findByFechaimportacion(int fechaImportacion);

}