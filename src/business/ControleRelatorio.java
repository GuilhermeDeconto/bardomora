package business;

import persistence.ConexaoRelatorio;
import persistence.HistoricoClienteDTO;

import java.time.Month;
import java.util.HashMap;

public class ControleRelatorio {
	public ConexaoRelatorio conexao = new ConexaoRelatorio();
	
	public HashMap<Integer, Integer> criaRelatorio(Month mes, int ano){
		HashMap<String, HistoricoClienteDTO> clientes = carregaArquivoDadosTabelaHistoricoClienteMesDe(mes, ano);
		HashMap<Integer, Integer> relatorio = realizaContagem(clientes);
		return relatorio;
	}
	
	private HashMap<Integer, Integer> realizaContagem(HashMap<String, HistoricoClienteDTO> clientes) {
		HashMap<Integer, Integer> relatorio = new HashMap<>();
		for (HistoricoClienteDTO cliente : clientes.values()) {
			int diaDoMes = cliente.getData().getDayOfMonth();
			if(relatorio.get(diaDoMes) == null){
				relatorio.put(diaDoMes, 0);
			} 
			relatorio.put(diaDoMes, relatorio.get(diaDoMes)+1);
		}
		return relatorio;
	}

	public HashMap<String, HistoricoClienteDTO> carregaArquivoDadosTabelaHistoricoClienteMesDe(Month mes, int ano){
		return conexao.carregaArquivoDadosTabelaHistoricoClienteMesDe(mes, ano);
	}
}
