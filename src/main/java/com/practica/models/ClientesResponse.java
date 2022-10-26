package com.practica.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class ClientesResponse {

    private int id;
    private int fechaImportacion;
    private int nombre;
    private int cantlect;
    private int pFactura;
    private int estado;
    private int empresa;
    private int usuario;
    private int idSuministro;
}
