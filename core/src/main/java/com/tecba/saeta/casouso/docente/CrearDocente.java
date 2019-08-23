package com.tecba.saeta.casouso.docente;

import com.tecba.saeta.casouso.CasoUso;
import com.tecba.saeta.casouso.CasoUsoBase;
import com.tecba.saeta.entidad.Docente;
import com.tecba.saeta.servicio.data.docente.RepositorioDocente;


import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class CrearDocente extends CasoUsoBase<Docente> implements CasoUso<Docente> {

    private RepositorioDocente repositorio;

    private Docente registro;

    private Optional<Docente> resultado = Optional.empty();

    private CrearDocente(){}

    public static CrearDocente crear(RepositorioDocente repositorio, Docente registro){
        CrearDocente casoUso = new CrearDocente();
        casoUso.repositorio = Objects.requireNonNull(repositorio, "'Repositorio docente' no puede ser omitido");
        casoUso.registro = Objects.requireNonNull(registro, "'Registro docente' no puede ser omitido");

        casoUso.validateBean(registro);
        return casoUso;
    }

    @Override
    public void ejecutar(){
        super.ejecutar();

        boolean esNuevo = !this.searchById.isPresent();
        Optional<Docente> buscarPorCarnet = repositorio.obtenerPorCarnet(this.registro.getCarnet(), this.registro.getExtension());

        if(esNuevo){
            this.registro.setId(UUID.randomUUID());
            repositorio.insertar(this.registro);
            resultado = Optional.of(this.registro);
        }
    }

    @Override
    protected Optional<Docente> getById() {
        return repositorio.obtenerPorId(this.registro.getId());
    }

    @Override
    protected Optional<Docente> getByNaturalKey() {
        return repositorio.obtenerPorCarnet(this.registro.getCarnet(),this.registro.getExtension());
    }

    @Override
    protected String getMessageError() {
        return null;
    }

    @Override
    public Optional<Docente> getResultado() {
        return resultado;
    }
}
