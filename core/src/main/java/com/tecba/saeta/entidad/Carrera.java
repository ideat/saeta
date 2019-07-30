package com.tecba.saeta.entidad;

import lombok.Getter;
@Getter
@Setter

public class Carrera {
	@NotNull(message = "introdusca id de carrera es requerido")
	public String idCarrera;
	
	@NotNull(message = "nombres de carreara es requerido")
	public String nombreCarrera;
	
	@NotNull(message = "nombre del responsable es requerido")
	public String responsable;
	
	@NotNull(message = "Elija que Facultad")
    public String facultad;
    
	
    public String getNombreCarrera();
    {
        return NombreCarrera + " " + responsable + " " + facultad " ";
    }