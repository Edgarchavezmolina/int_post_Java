package com.practica.models;

import com.practica.models.ClientesResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @SuperBuilder
    public class ClientesDTO implements Serializable {
        private static final long serialVersionUID = 8799656478674716638L;
        private List<ClientesResponse> clientesResponse;
    }

