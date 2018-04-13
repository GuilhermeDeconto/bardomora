package utils;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Utils {
	public static int verificaPorcentagem(int total, int qtdParaVerificar){
		if(total > 0){
			double porcentagem;
			porcentagem = (qtdParaVerificar * 100) / total;
			return (int) Math.ceil((double)porcentagem);
		}
		return 0;
	}
	public static MaskFormatter formatadorCPF(){
		MaskFormatter cpf = null;
		try {
			cpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cpf;
	}
	public static MaskFormatter formatadorNome(){
		MaskFormatter formatador = null;
		try {
			formatador = new MaskFormatter("******************************"); //30 caracteres
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		formatador.setValidCharacters("qwertyuiopasdfghjklzxcvbnm" +
	           						  "QWERTYUIOPASDFGHJKLZXCVBNM" +
	           						  "áâãôõóüç. ");
		formatador.setPlaceholderCharacter(' ');
		return formatador;
	}
	public static String formataNomeComposto(String nome){
		StringBuilder nomeCompleto = new StringBuilder();
		for (String string : nome.split(" ")) {
			if(igualALigacao(nome)){
				nomeCompleto.append(nome);
			} else {
				nomeCompleto.append(string.substring(0, 1).toUpperCase());
				nomeCompleto.append(string.substring(1, string.length()).toLowerCase());
			}
			nomeCompleto.append(" ");
		}
		return nomeCompleto.toString().trim();
	}
	
	private static boolean igualALigacao(String nome){
		String[] ligacoes = {"do", "da", "o", "dos"};
		for (String s : ligacoes) {
			if (nome.equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public static String formataRelatorio(Object o){
		if (o.equals("null")){
			return "Nenhum cliente do dia";
		} else {
			int qtd = Integer.parseInt(String.valueOf(o));
			return qtd + " cliente(s) no dia.";
		}
	}
}
