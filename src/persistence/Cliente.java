package persistence;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	private String genero;

	public Cliente(String nome, String cpf, int idade, String genero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cliente: nome= " + nome + ", cpf= " + cpf + ", idade= " + idade + ", genero= " + genero;
	}

}
