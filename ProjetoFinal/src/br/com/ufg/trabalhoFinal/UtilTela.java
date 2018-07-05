package br.com.ufg.trabalhoFinal.services;

import br.com.ufg.trabalhoFinal.telas.*;

import java.awt.EventQueue;

public class UtilTela {
    
    public static void ativaTelaPrincipal(){
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
    }
        
    public static void ativaTelaCadastroFuncionario(){
    
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
        
    }

    
    public static void ativaTelaListarFuncionario(){
    
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarFuncionario().setVisible(true);
            }
        });
        
    }
    
    public static void ativaTelaRemoverFuncionario(){
    
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoverFuncionario().setVisible(true);
            }
        });
        
    }
    
   
}
