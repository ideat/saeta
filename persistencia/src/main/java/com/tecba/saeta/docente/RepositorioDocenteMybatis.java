package com.tecba.saeta.docente;

import com.tecba.saeta.entidad.Docente;
import com.tecba.saeta.servicio.data.docente.RepositorioDocente;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RepositorioDocenteMybatis implements RepositorioDocente
{
    @Override
    public void insertar(Docente docente) {

    }

    @Override
    public void actualizar(Docente docente) {

    }

    @Override
    public Optional<Docente> obtenerPorCarnet(String carnet, String extension) {
        return Optional.empty();
    }

    @Override
    public Optional<Docente> obtenerPorId(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Docente> obtenerTodos() {
        return null;
    }
}
