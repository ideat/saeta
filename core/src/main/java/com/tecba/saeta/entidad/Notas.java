package com.tecba.saeta.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter 

public class Notas {
    private UUID id;

    @NotNull(message = "ID de notas es requerido")
    private int idNotas;

    @NotNull(message = "Nombre completo es requerido")
    private String nombreAlumno;


    @NotNull(message = "Nota es requerida")
    private int nota;

    private boolean estado;

    public String getNotas(){
        return idNotas + " " + nombreAlumno + " " + nota + " " + estado;
    }


}
