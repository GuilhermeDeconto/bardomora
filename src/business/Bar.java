package business;

import persistence.Cliente;
import persistence.Conexao;
import utils.Genero;
import utils.Mensagem;
import java.util.HashMap;

public class Bar {

	private HashMap<String, Cliente> clientesCadastrados;
	private HashMap<String, Cliente> clientesNaCasa;
	private Conexao conexao = new Conexao();


	public void cadastraCliente(Cliente cliente){
		if (buscaClienteCadastrado(cliente.getCpf()) == null){
			getClientesCadastrados().put(cliente.getCpf(), cliente);
			conexao.salvaDadosTabelaCliente(cliente);
		}
		liberaAcessoCliente(cliente);
	}

	public HashMap<String, Cliente> getClientesCadastrados() {
		return clientesCadastrados;
	}

	public HashMap<String, Cliente> getClientesNaCasa() {
		return clientesNaCasa;
	}
	public Bar(){
		setClientesCadastrados(new HashMap<>());
		clientesNaCasa = new HashMap<>();
	}

	public void liberaSaidaCliente(String cpf){

		Cliente c = clientesNaCasa.remove(cpf);
		if (c == null){
			Mensagem.avisoMensagemCPFNaoEncontradoEmClientesNaCasa();
		} else {
			conexao.salvaDadosTabelaHistoricoClienteSaida(c);
		}
	}

	public void liberaAcessoCliente(Cliente cliente) {
		if(buscaClienteNaCasa(cliente.getCpf()) == null){
			clientesNaCasa.put(cliente.getCpf(), cliente);
			conexao.salvaDadosTabelaHistoricoClienteEntrada(cliente);
		} else {
			Mensagem.avisoClienteEncontradoNaCasa();
		}
	}

	public Cliente buscaClienteCadastrado(String cpf){
		return getClientesCadastrados().get(cpf);
	}

	public Cliente buscaClienteNaCasa(String cpf){
		return getClientesNaCasa().get(cpf);
	}

	public int qtdClientesMasc() {
		int cont = 0;
		for (Cliente clienteDTO : clientesNaCasa.values()) {
			if(clienteDTO.getGenero().equals(Genero.M)){
				cont++;
			}
		}
		return cont;
	}

	public int qtdClientesSocios() {
		int cont = 0;
		for (Cliente clienteDTO : clientesNaCasa.values()) {
			if(getClientesCadastrados().containsKey(clienteDTO.getCpf())){
				cont++;
			}
		}
		return cont;
	}

	public void setClientesCadastrados(HashMap<String, Cliente> clientesCadastrados) {
		this.clientesCadastrados = conexao.carregaArquivoDadosTabelaCliente();
	}

	public void encerraEspediente(){
		conexao.encerraEspediente(clientesNaCasa);
	}

}
