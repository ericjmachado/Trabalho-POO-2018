package br.com.ufg.trabalhoFinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import br.com.ufg.trabalhoFinal.model.Funcionario;

public class UtilArquivo {

	private static String urlFuncionario = "src/br/com/ufg/dados/funcionarios.txt";
	
	public static void salvarFuncionario(Funcionario funcionario) {
		
		File file = new File(urlFuncionario);
		
		ArrayList<Funcionario> funcionarios = null;
		
                funcionarios = getFuncionarios();
                        
		funcionarios.add(funcionario);
		
		ObjectOutputStream output = null;
		
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(funcionarios);
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
        
        public static void salvarFuncionarios(ArrayList<Funcionario> funcionario) {
		
		File file = new File(urlFuncionario);
                
		ObjectOutputStream output = null;
		
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(funcionario);
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
        
        
        
	
	public static ArrayList<Funcionario> getFuncionarios(){
		
		ArrayList<Funcionario> funcionarios = null;
	   
		File file = new File(urlFuncionario);
                
                
                if(file.length() == 0){
                    
                    return new ArrayList<>();
                  
                }
	
		ObjectInputStream reader = null;
		
		try {
			reader = new ObjectInputStream(new FileInputStream(file));
			funcionarios = (ArrayList<Funcionario>) reader.readObject();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
		return funcionarios;
		
	}
        
    public static Double totalSalario(){
        
        Double total = 0.0;
        
        ArrayList<Funcionario> funcionario = UtilArquivo.getFuncionarios();
        
        if(funcionario.size() != 0){
            
            for(Funcionario f: funcionario){
                
                total += f.getSalario();
                
            }
            
        }
        
        return total;
  
    }
	
}
