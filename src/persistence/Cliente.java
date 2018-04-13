package persistence;

import utils.Genero;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	private int nrSocio;
	private Genero genero;

	public Cliente(String nome, String cpf, int idade, Genero genero, int id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.nrSocio = id;
	}
	public Cliente(){}
    public int getNrSocio() {
        return nrSocio;
    }
    public void setNrSocio(int nrSocio) {
        this.nrSocio = nrSocio;
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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Cliente: nome= " + nome + ", cpf= " + cpf + ", idade= " + idade + ", genero= " + genero;
	}

}
