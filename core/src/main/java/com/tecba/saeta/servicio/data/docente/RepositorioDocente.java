package com.tecba.saeta.servicio.data.docente;

import com.tecba.saeta.entidad.Docente;

import java.util.List;
import java.util.Optional;

public interface RepositorioDocente {

    void insertar(Docente docente);

    void actualizar(Docente docente);

    Optional<Docente> obtenerPorCarnet(String carnet, String extension);

    List<Docente> obtenerTodos();

}
