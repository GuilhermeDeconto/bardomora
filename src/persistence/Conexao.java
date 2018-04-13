package persistence;

import utils.EntradaSaida;
import utils.Genero;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class Conexao {
	@SuppressWarnings("resource")
	public HashMap<String,Cliente> carregaArquivoDadosTabelaCliente(){
		Scanner scanner = null;
		HashMap<String, Cliente> clientesCadastrados = new HashMap<>();
		try {
			FileReader fileReader = new FileReader("ArquivosDeDados\\TabelaCliente.txt");
			scanner = new Scanner(fileReader).useDelimiter("\\s*#####\\s*");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			if (scanner.hasNext()) {
				String nome = scanner.next();
				String cpf = scanner.next();
				int idade = Integer.parseInt(scanner.next());
				Genero sexo = Genero.masculinoOuFeminino(scanner.next());
				int id = Integer.parseInt(scanner.next());
				Cliente cliente = new Cliente(nome, cpf, idade, sexo, id);
				clientesCadastrados.put(cpf, cliente);
			} else {
				break;
			}
		}
		return clientesCadastrados;
	}
	
	public boolean salvaDadosTabelaCliente(Cliente cliente){
		PrintWriter gravar = null;
		try {
			FileWriter fileReader = new FileWriter("ArquivosDeDados\\TabelaCliente.txt", true);
			gravar = new PrintWriter(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(cliente.getNome());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getCpf());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getIdade());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getGenero());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getNrSocio());
		stringBuilder.append("#####");
		
		gravar.println(stringBuilder);
		gravar.close();
		return false;
	}
	
	public boolean salvaDadosTabelaHistoricoClienteEntrada(Cliente cliente){
		PrintWriter gravar = null;
		try {
//			Scanner scanner = new Scanner(System.in);
			FileWriter fileReader = new FileWriter("ArquivosDeDados\\TabelaHistoricoCliente.txt", true);
			gravar = new PrintWriter(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(cliente.getNome());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getCpf());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getIdade());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getGenero());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getNrSocio());
		stringBuilder.append("#####");
		
		stringBuilder.append(LocalDateTime.now().toString());
		stringBuilder.append("#####");
		
		stringBuilder.append(EntradaSaida.E.toString());
		stringBuilder.append("#####");
		
		gravar.println(stringBuilder);
		gravar.close();
		return true;
	}
	
	public boolean salvaDadosTabelaHistoricoClienteSaida(Cliente cliente){
		PrintWriter gravar = null;
		try {
//			Scanner scanner = new Scanner(System.in);
			FileWriter fileReader = new FileWriter("ArquivosDeDados\\TabelaHistoricoCliente.txt", true);
			gravar = new PrintWriter(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(cliente.getNome());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getCpf());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getIdade());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getGenero());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getNrSocio());
		stringBuilder.append("#####");
		
		stringBuilder.append(LocalDateTime.now().toString());
		stringBuilder.append("#####");
		
		stringBuilder.append(EntradaSaida.S.toString());
		stringBuilder.append("#####");
		
		gravar.println(stringBuilder);
		gravar.close();
		return true;
	}
	
	public void encerraEspediente(HashMap<String, Cliente> clientesNaCasa){
		for (Cliente cliente : clientesNaCasa.values()) {
			salvaDadosTabelaHistoricoClienteSaida(cliente);
		}
	}
}
