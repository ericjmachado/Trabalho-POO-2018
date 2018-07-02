package br.com.ufg.trabalhoFinal;

import br.com.ufg.trabalhoFinal.exceptions.CodigoException;
import br.com.ufg.trabalhoFinal.exceptions.SexoException;

public class UtilValidacao {

	public static void validaSexo(String sexo) throws SexoException {
		
		char buff = sexo.charAt(0);
			
		if(!(buff == 'M' || buff == 'F')) {
			
			throw new SexoException("Sexo informado Inválido");
			
		}
		
		if(sexo.length() != 1) {
			
			throw new SexoException("Informe apenas uma letra");
			
		}
	
	}
	
	public static void validaCodigo(String codigo) throws CodigoException {
		
		Integer buff;
		
		try {
			
			buff = Integer.parseInt(codigo);
			
			if(!(buff >= 0 || buff <= 9999)) {
				
				throw new CodigoException("Código inserido inválido");
				
			}
			
			
			
		} catch (NumberFormatException e) {
			
			throw new CodigoException("Informe um código númerico");
			
		}
			
	}
}
