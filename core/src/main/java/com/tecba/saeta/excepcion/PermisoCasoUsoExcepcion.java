package com.tecba.saeta.excepcion;

public class PermisoCasoUsoExcepcion extends CasoUsoExcepcion {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3294532275146727468L;

	public PermisoCasoUsoExcepcion(String message) {
		super(message);
	}

	public PermisoCasoUsoExcepcion(Exception e) {
		super(e.getMessage(), e);
	}

	public PermisoCasoUsoExcepcion(String message, Exception e) {
		super(message, e);
	}
}
