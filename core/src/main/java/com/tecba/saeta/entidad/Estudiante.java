package com.tecba.saeta.entidad;


import com.tecba.saeta.enumerado.Extension;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Getter
@Setter

public class Estudiante {
    private UUID id;

    @NotNull(message = "Primer nombres es requerido")
    private String primerNombre;

    private String segundoNombre;

    private String apellidoPaterno;

    private String apellidoMaterno;

    @NotNull(message = "Carnet es requerido")
    @Pattern(regexp="\\d{5,10}(-[a-zA-Z_0-9]*)*",message = "'cedulaIdentidad' debe ser una secuencia de entre 5 y 10 dígitos, opcionalmente un caracter seguido de hasta 3 digitos " )
    private String carnet;

    private Extension extension;
    @Email
    private String email;

    private String direccion;

    private String tutor;

    @NotNull(message = "Numero celular requerido")
    private String celular;

    private String telfDomicilio;

    private LocalDate fechaInscripcion;

    public String getNommbreCompleto(){
        return primerNombre + " " + Optional.ofNullable(segundoNombre).orElse("") + " " + apellidoPaterno;
    }

    public String getCarnetCompleto(){
        return carnet + extension;
    }
}
