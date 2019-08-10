package com.tecba.saeta.excepcion;

public class CasoUsoExcepcion extends RuntimeException{

    private static final long serialVersionUID = -369764083952373334L;

    public CasoUsoExcepcion(String message){
        super(message);
    }

    public CasoUsoExcepcion(Exception e) {
        super(e.getMessage(),e);
    }

    public CasoUsoExcepcion(String message, Exception e){
        super(message,e);
    }
}
