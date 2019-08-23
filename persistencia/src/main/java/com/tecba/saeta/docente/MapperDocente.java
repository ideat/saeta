package com.tecba.saeta.docente;

import com.tecba.saeta.entidad.Docente;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Mapper
public interface MapperDocente {

    void insertar(Docente docente);

    void actualizar(Docente docente);

    Docente obtenerPorCarnet(@Param("carnet") String carnet, @Param("extension") String extension);

    Docente obtenerPorId(@Param("id") UUID id);

    List<Docente> obtenerTodos();
}
