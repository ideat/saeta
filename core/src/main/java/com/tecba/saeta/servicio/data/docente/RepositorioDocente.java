package com.tecba.saeta.servicio.data.docente;

import com.tecba.saeta.entidad.Docente;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RepositorioDocente {

    void insertar(Docente docente);

    void actualizar(Docente docente);

    Optional<Docente> obtenerPorCarnet(String carnet, String extension);

    Optional<Docente> obtenerPorId(UUID id);

    List<Docente> obtenerTodos();

}
