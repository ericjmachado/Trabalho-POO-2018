package br.com.ufg.trabalhoFinal.exceptions;

public class CodigoException extends Exception {

	public CodigoException(String msg) {
		
		super(msg);
		
	}
	
	public CodigoException(String msg, Throwable cause) {
		
		super(msg, cause);
		
	}
	
}
