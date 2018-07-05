
package br.com.ufg.trabalhoFinal;

import javax.swing.JOptionPane;

public class RemoveFuncionario {
    
    public static void remove(String codigo){
        
        UtilValidacao.validaCodigoExclusaoFuncionario(codigo);
        JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso");
        
    }
    
}
