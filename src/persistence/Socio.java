package persistence;
public class Socio extends Cliente {

	private int codSocio;

	public Socio(String nome, String cpf, int idade, String genero, int numSocio) {
		super(nome, cpf, idade, genero);
		this.codSocio = numSocio;
	}

	public int getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(int codSocio){
		this.codSocio=codSocio;
	}

	@Override
	public String toString() {
		return "Socio [codSocio=" + codSocio + super.toString();
	}
}
