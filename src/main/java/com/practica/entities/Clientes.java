package com.practica.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "personas", schema = "public")

public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfichero", nullable = false)
    private long id;
    @Column(name = "fecha_importacion", nullable = false, length = 255)
    private int fechaImportacion;
    @Column(name = "nombre", nullable = false, length = 255)
    private int nombre;
    @Column(name = "cant_lect", nullable = false, length = 255)
    private int cantLect;
    @Column(name = "pfactura", nullable = false, length = 255)
    private int pFactura;
    @Column(name = "estado", nullable = false, length = 255)
    private int estado;
    @Column(name = "empresa", nullable = false, length = 255)
    private int empresa;
    @Column(name = "usuario", nullable = false, length = 255)
    private int usuario;
    @Column(name = "idsuministro", nullable = false, length = 255)
    private int idSuministro;

}
