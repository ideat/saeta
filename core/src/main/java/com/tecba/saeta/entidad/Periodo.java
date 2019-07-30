package com.tecba.saeta.entidad;

import lombok.Getter;
@Getter
@Setter

public class Periodo {
	@NotNull(message = "introdusca id de carrera es requerido")
	private String idCarrera;
	
	@NotNull(message = "nombres de periodo es requerido")
	private String nombrePeriodo;
    
    private localDate fechaInicio;
    
    private localDate fechaFin;


    private String get();
    {
        return nombrePeriodo + " " + fechaInicio + " " fechaFin + " ";
    }
   	
}

