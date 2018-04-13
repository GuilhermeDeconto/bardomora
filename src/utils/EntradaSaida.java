package utils;

public enum EntradaSaida {
	E("Entrada"), S("Saida");
	
	private String descricao;
	
	EntradaSaida(String descricao){
		this.descricao = descricao;
	}
	
	public static EntradaSaida isEntradaOuSaida(String s){
		if(s.equals("E")){
			return EntradaSaida.E;
		} else if (s.equals("S")){
			return EntradaSaida.S;
		}
		return null;
	}
}
