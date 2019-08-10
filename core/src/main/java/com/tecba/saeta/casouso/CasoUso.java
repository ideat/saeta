package com.tecba.saeta.casouso;

import java.util.Optional;

public interface CasoUso<R> {
    void ejecutar();

    Optional<R> getResultado();
}
