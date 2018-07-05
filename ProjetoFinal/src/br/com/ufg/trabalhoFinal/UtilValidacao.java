package br.com.ufg.trabalhoFinal;


import javax.swing.JOptionPane;

import br.com.ufg.trabalhoFinal.exceptions.IdadeException;
import br.com.ufg.trabalhoFinal.model.Funcionario;
import br.com.ufg.trabalhoFinal.services.UtilTela;
import java.util.ArrayList;

public class UtilValidacao {

    protected static void validaIdade(String idade) throws IdadeException {
		
        Integer buff;
		
	try {
			
            buff = Integer.parseInt(idade);
			
            if(!(buff >= 18 && buff <= 150 )) {
				
                JOptionPane.showMessageDialog(null, "Idade inválida, insira um número entre 18 e 150");
				
                throw new IdadeException("Numero invalido");
					
            }
							
        } catch (NumberFormatException e) {
			
            JOptionPane.showMessageDialog(null, "Informe uma idade númerica");
			
            throw new IdadeException("Numero invalido");
		
	}
			
    }
    

    protected static void validaCodigoExclusaoFuncionario(String codigo){
    
       Integer buff;
       
       try {
           
           buff = Integer.parseInt(codigo);
           
           if(isCodigoFuncionarioExistente(buff)){
               
               ArrayList<Funcionario> list = UtilArquivo.getFuncionarios();
               
               for(int i = 0; i < list.size(); i++){
                   
                   if(list.get(i).getCodigo().equals(buff)){
                       
                       list.remove(i);
                       
                       UtilArquivo.salvarFuncionarios(list);
                       UtilTela.ativaTelaPrincipal();
                       return ;
                   }
                   
               }
               
               
            } else {
               
               JOptionPane.showMessageDialog(null, "Informe um código existente");
               UtilTela.ativaTelaRemoverFuncionario();
               
            }
           
       
       } catch(NumberFormatException e) {
           
           JOptionPane.showMessageDialog(null, "Informe um código númerico");
           UtilTela.ativaTelaRemoverFuncionario();
           
       }
       
       
        
    }
    
    protected static Integer gerarFuncionarioCodigoValido(){
        
        ArrayList<Funcionario> funcionarios = UtilArquivo.getFuncionarios();
        
        if(funcionarios.size() == 0){
            
            return 0;
            
        } else {
            
            return funcionarios.get(funcionarios.size() - 1).getCodigo() + 1;
            
        }
            
    }
    
    private static boolean isCodigoFuncionarioExistente(Integer cod){
        
        ArrayList<Funcionario> list = UtilArquivo.getFuncionarios();
        
        for(Funcionario f : list){
            
            if(f.getCodigo().equals(cod)){
                
                return true;
                
            }
            
        }
        
        return false;
        
    }
    
}
