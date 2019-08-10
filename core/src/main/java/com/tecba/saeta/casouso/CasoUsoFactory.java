package com.tecba.saeta.casouso;

public interface CasoUsoFactory {
    CasoUso create(String useCase, Object input);
}
