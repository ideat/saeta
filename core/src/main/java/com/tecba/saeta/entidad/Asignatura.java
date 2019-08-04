package com.tecba.saeta.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@Getter
@Setter
public class Asignatura {
	private UUID idAsignatura;

	private String codigoInterno;

    @NotNull(message = "Primer nombre es requerido")
    private String nombreAsignatura;
    
    private String estado;

    private String nivel;


}


