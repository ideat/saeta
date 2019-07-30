package com.tecba.saeta.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter

public class Aula {
	
	private UUID idAula;
	
	private String nombreAula;
	
	private int cupoEstudiantes;
	
	public Facultad(UUID idFacultad, String nombre, int cupoEstudiante){
		this.idAula=idAula;
		this.nombreAula=nombreAula;
		this.cupoEstudiantes;
	}
	
}
