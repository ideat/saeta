package com.tecba.saeta.entidad;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter

public class Horarios {
    private UUID id;

    @NotNull(message = "ID de horario es requerido")
    private LocalDateTime idHorarios;

    @NotNull(message = "Hora inicio es requerido")
    private LocalDateTime horaInicio;


    @NotNull(message = "Hora fin es requerida")
    private LocalDateTime horaFin;


}
