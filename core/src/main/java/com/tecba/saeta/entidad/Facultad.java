package com.tecba.saeta.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter

	public class Facultad {
		private UUID idFacultad;
		
		private String nombre;
		
		
		public Facultad(UUID idFacultad, String nombre){
			this.idFacultad=idFacultad;
			this.nombre=nombre;
		}


		}



