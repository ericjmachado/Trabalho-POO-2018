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

import br.com.ufg.trabalhoFinal.model.Produto;
import br.com.ufg.trabalhoFinal.model.Venda;

public class UtilArquivo {

	private static String urlFuncionario = "src/br/com/ufg/dados/funcionarios.txt";
	
	private static String urlVendas = "src/br/com/ufg/dados/vendas.txt";
	
	private static String urlProdutos = "src/br/com/ufg/dados/produtos.txt";
	
	public static void salvarVenda(Venda item) {
		
		File file = new File(urlVendas);
		
		ArrayList<Venda> vendas = null;
		
		if(file.length() == 0) {
			
			vendas = new ArrayList<>();
			
		} else {
			
			vendas = getVendas();
			
		}
		
		vendas.add(item);
		
		ObjectOutputStream output = null;
		
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(vendas);
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Venda> getVendas(){
		
		ArrayList<Venda> vendas = null;
		
		File file = new File(urlVendas);
	
		ObjectInputStream reader = null;
		
		try {
			reader = new ObjectInputStream(new FileInputStream(file));
			vendas = (ArrayList<Venda>) reader.readObject();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
		return vendas;
		
	}
	
	public static void salvarFuncionario(Funcionario funcionario) {
		
		File file = new File(urlFuncionario);
		
		ArrayList<Funcionario> funcionarios = null;
		
		if(file.length() == 0) {
			
			funcionarios = new ArrayList<>();
			
		} else {
			
			funcionarios = getFuncionarios();
			
		}
		
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
	
	public static ArrayList<Funcionario> getFuncionarios(){
		
		ArrayList<Funcionario> funcionarios = null;
		
		File file = new File(urlFuncionario);
	
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
	
	public static void salvarProduto(Produto produto) {
		
		File file = new File(urlProdutos);
		
		ArrayList<Produto> produtos = null;
		
		if(file.length() == 0) {
			
			produtos = new ArrayList<>();
			
		} else {
			
			produtos = getProdutos();
			
		}
		
		produtos.add(produto);
		
		ObjectOutputStream output = null;
		
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(produtos);
			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Produto> getProdutos(){
		
		ArrayList<Produto> produtos = null;
		
		File file = new File(urlProdutos);
	
		ObjectInputStream reader = null;
		
		try {
			reader = new ObjectInputStream(new FileInputStream(file));
			produtos = (ArrayList<Produto>) reader.readObject();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
		return produtos;
		
	}
	
}
