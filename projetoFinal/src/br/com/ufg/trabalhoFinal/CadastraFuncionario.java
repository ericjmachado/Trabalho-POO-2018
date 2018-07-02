package br.com.ufg.trabalhoFinal;

import javax.swing.JOptionPane;

import br.com.ufg.trabalhoFinal.exceptions.SexoException;

public class CadastraFuncionario {

	public static void cadastrar() {
	
		//String nome = campoNome();
		//Integer codigo = campoCodigo();
		int idade;
		char sexo = campoSexo();
		
		

	}
	
	private static char campoSexo() {
		
		String sexo = (JOptionPane.showInputDialog(null, "Informe o sexo do funcionário", "Cadastro Sexo", JOptionPane.INFORMATION_MESSAGE).toUpperCase());
		
		try {
			
			UtilValidacao.validaSexo(sexo);
			
		}catch (SexoException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			JOptionPane.showMessageDialog(null, "Informe Apenas M ou F");
			
			campoSexo();
			
		}
		
		
		return sexo.charAt(0);
		
	}
	
	
	private static String campoNome() {
		
		String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário", "Cadastro nome", JOptionPane.INFORMATION_MESSAGE);
		
		return nome;
		
	}
	
	private static Integer campoCodigo() {
		
		String codigo = JOptionPane.showInputDialog(null, "Informe o sexo do funcionário", "Cadastro Sexo", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		return 5;
		
	}
}
