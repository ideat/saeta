package com.tecba.saeta.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter

public class Horarios {
    private UUID id;

    @NotNull(message = "ID de horario es requerido")
    private int idHorarios;

    @NotNull(message = "Hora inicio es requerido")
    private int horaInicio;


    @NotNull(message = "Hora fin es requerida")
    private int horaFin;

    public String getHorario(){
        return idHorarios + " " + horaInicio + " " + horaFin;
    }


}
