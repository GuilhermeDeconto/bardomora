package persistence;

import utils.DateUtils;
import utils.EntradaSaida;
import utils.Genero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Month;
import java.util.HashMap;
import java.util.Scanner;

public class ConexaoRelatorio {
	
	public HashMap<String, HistoricoClienteDTO> carregaArquivoDadosTabelaHistoricoClienteMesDe(Month mes, int ano){
		HashMap<String, HistoricoClienteDTO> cadastros = carregaArquivoDadosTabelaHistoricoCliente();
		HashMap<String, HistoricoClienteDTO> cadastrosFiltrados = new HashMap<>();
		for (HistoricoClienteDTO cliente : cadastros.values()) {
			if (cliente.getData().getMonth().equals(mes) && cliente.getData().getYear() == ano){
				cadastrosFiltrados.put(cliente.getCpf(), cliente);
			}
		}
		return cadastrosFiltrados;
	}
	
	@SuppressWarnings("resource")
	public HashMap<String, HistoricoClienteDTO> carregaArquivoDadosTabelaHistoricoCliente(){
		Scanner scanner = null;
		HashMap<String, HistoricoClienteDTO> clientesCadastrados = new HashMap<>();
		try {
			FileReader fileReader = new FileReader("ArquivosDeDados\\TabelaHistoricoCliente.txt");
			scanner = new Scanner(fileReader).useDelimiter("\\s*#####\\s*");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			if (scanner.hasNext()) {
				HistoricoClienteDTO cliente = new HistoricoClienteDTO();
				cliente.setNome(scanner.next());
				cliente.setCpf(scanner.next());
				cliente.setIdade(Integer.parseInt(scanner.next()));
				cliente.setGenero(Genero.masculinoOuFeminino(scanner.next()));
				cliente.setNrSocio(Integer.parseInt(scanner.next()));
				cliente.setData(DateUtils.formataStringParaLocalDateTime(scanner.next()));
				cliente.setEntradaSaida(EntradaSaida.isEntradaOuSaida(scanner.next()));
				if(cliente.getEntradaSaida() == EntradaSaida.E){
					clientesCadastrados.put(cliente.getCpf(), cliente);
				}
			} else {
				break;
			}
		}
		return clientesCadastrados;
	}
}
