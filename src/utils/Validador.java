package utils;

public class Validador {
	public static boolean validaCliente(String nome, String cpf){
		return validaNome(nome) && validaCPF(cpf);
	}

	private static boolean validaCPF(String CPF) {
		if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
	        CPF.equals("22222222222") || CPF.equals("33333333333") ||
	        CPF.equals("44444444444") || CPF.equals("55555555555") ||
	        CPF.equals("66666666666") || CPF.equals("77777777777") ||
	        CPF.equals("88888888888") || CPF.equals("99999999999") ||
	        (CPF.length() != 11)){
			return false;
		}
		       
		return true;
	}

	private static boolean validaNome(String nome) {
		if(nome.replace(" ","").length() <= 3){
			return false;
		}
		return true;
	}

	public static int geraNrSocio(int totalClientesCadastrados) {
		int numeroGerado = (int) Math.ceil((double) Math.random() * 100000);
		return Integer.parseInt(String.valueOf(numeroGerado).concat(String.valueOf(totalClientesCadastrados)));
	}
	
	public static String retiraSinaisCPF(String cpf){
		return cpf.replace("-", "").replace(".", "");
	}
}
