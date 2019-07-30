package com.tecba.saeta.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter

public class Estudiante {
    private UUID idE;

    @NotNull(message = "Primer nombres es requerido")
    private String primerNombre;

    private String segundoNombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    @NotNull(message = "Carnet es requerido")
    private String carnet;

    private String extension;
    @Email
    private String email;

    private String direccion;

    private String tutor;

    @NotNull(message = "Numero celular requerido")
    private String celular;

    private String telfDomicilio;

    private LocalDate fechaInscripcion;

    public String getNommbreCompleto(){
        return primerNombre + " " + segundoNombre + " " + apellidoPaterno;
    }

    public String getCarnetCompleto(){
        return carnet + extension;
    }
}
