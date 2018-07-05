package br.com.ufg.trabalhoFinal;

import javax.swing.JOptionPane;

import br.com.ufg.trabalhoFinal.exceptions.IdadeException;
import br.com.ufg.trabalhoFinal.model.Funcionario;
import br.com.ufg.trabalhoFinal.services.UtilTela;

public class CadastraFuncionario {

	public static void cadastrar(String nome, String idadeSTR, char sexo, Double salario) {
	
            Integer idade = campoIdade(idadeSTR);
            
            Integer codigo = UtilValidacao.gerarFuncionarioCodigoValido();
            
            Funcionario funcionario = new Funcionario(nome, codigo, idade, sexo, salario);
            
            UtilArquivo.salvarFuncionario(funcionario);
            
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            
            UtilTela.ativaTelaPrincipal();
            
	}
	
	private static Integer campoIdade(String idade) {
		
		try {
			
                    UtilValidacao.validaIdade(idade);
			
		}catch (IdadeException e) {
			
                    e.printStackTrace();
                    System.out.println(e.getMessage());
			
                    UtilTela.ativaTelaCadastroFuncionario();
			
		}
		
            return Integer.parseInt(idade);
		
	}
	
}
