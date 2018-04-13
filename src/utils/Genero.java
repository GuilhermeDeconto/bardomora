package utils;

public enum Genero {
	
	M("M", "Masculino"), F("F", "Feminino");
	
	private String nome;
	private String descricao;
	
	Genero(String nome, String descricao){
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public static Genero masculinoOuFeminino(String descricao){
		if (descricao.equals("Masculino") || descricao.equals("M")){
			return Genero.M;
		} else if (descricao.equals("Feminino") || descricao.equals("F")){
			return Genero.F;
		}
		return null;
	}
}
