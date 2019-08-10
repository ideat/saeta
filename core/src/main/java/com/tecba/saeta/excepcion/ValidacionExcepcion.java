package com.tecba.saeta.excepcion;

public class ValidacionExcepcion extends CasoUsoExcepcion {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3294532275146727468L;

	public ValidacionExcepcion(String message) {
		super(message);
	}

	public ValidacionExcepcion(Exception e) {
		super(e.getMessage(), e);
	}

	public ValidacionExcepcion(String message, Exception e) {
		super(message, e);
	}
}
