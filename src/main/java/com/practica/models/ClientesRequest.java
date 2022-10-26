package com.practica.models;

import lombok.Data;

@Data
public class ClientesRequest {
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
