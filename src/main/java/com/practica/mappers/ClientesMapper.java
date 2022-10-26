package com.practica.mappers;

import com.practica.models.ClientesProjection;
import com.practica.models.ClientesResponse;

public class ClientesMapper {
        public static ClientesResponse getClientesResponse(ClientesProjection clientesProjection) {
            return ClientesResponse
                    .builder()
                    .id(clientesProjection.getId())
                    .fechaImportacion(clientesProjection.getFechaImportacion())
                    .nombre(clientesProjection.getNombre())
                    .cantlect(clientesProjection.getCantLect())
                    .pFactura(clientesProjection.getPFactura())
                    .estado(clientesProjection.getEstado())
                    .empresa(clientesProjection.getEmpresa())
                    .usuario(clientesProjection.getUsuario())
                    .idSuministro(clientesProjection.getIdSuministro())
                    .build();
        }

    }

