package persistence;

import utils.EntradaSaida;
import utils.Genero;

import java.time.LocalDateTime;

public class HistoricoClienteDTO extends Cliente{
	LocalDateTime data;
	EntradaSaida entradaSaida;
	

	public HistoricoClienteDTO(String nome, String cpf, int idade, Genero sexo, int id, LocalDateTime data,
                               EntradaSaida entradaSaida) {
		super(nome, cpf, idade, sexo, id);
		this.data = data;
		this.entradaSaida = entradaSaida;
	}
	
	public HistoricoClienteDTO(){}
	
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public EntradaSaida getEntradaSaida() {
		return entradaSaida;
	}
	public void setEntradaSaida(EntradaSaida entradaSaida) {
		this.entradaSaida = entradaSaida;
	}
	
}
