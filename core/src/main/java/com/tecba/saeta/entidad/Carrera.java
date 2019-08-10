package com.tecba.saeta.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter

public class Carrera {
	@NotNull(message = "introdusca id de carrera es requerido")
	private String idCarrera;
	
	@NotNull(message = "nombres de carreara es requerido")
	private String nombreCarrera;
	
	@NotNull(message = "nombre del responsable es requerido")
	private String responsable;
	
	@NotNull(message = "Elija que Facultad")
    private String facultad;


}