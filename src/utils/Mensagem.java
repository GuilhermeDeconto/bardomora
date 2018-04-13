package utils;

import javax.swing.*;

public class Mensagem {
	public static void avisoMensagemCPFNaoEncontradoEmClientesNaCasa(){
		JOptionPane.showMessageDialog(null, "Cliente não encontrado com este CPF na casa" ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void avisoMensagemCPFNaoEncontrado(){
		JOptionPane.showMessageDialog(null, "Cliente não encontrado com este CPF" ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void erroCampoSoRecebeLetras(){
		JOptionPane.showMessageDialog(null, "Este campo só pode conter letras." ,"Atenção!",JOptionPane.ERROR_MESSAGE);
	}

	public static void mostraMensagemNaoContemNinguem(){
		JOptionPane.showMessageDialog(null, "Não há ninguém na casa ainda." ,"",JOptionPane.INFORMATION_MESSAGE);
	}

	public static void erroCampoCPFInvalido(){
		JOptionPane.showMessageDialog(null, "O CPF informado não é válido." ,"Atenção!",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void avisoClienteCadastradoComSucesso(int id){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.\nO número do sócio é: " + id +"." ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void avisoClienteEncontradoNaCasa(){
		JOptionPane.showMessageDialog(null, "Cliente se encontra na casa." ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void avisoClienteNaoEncontradoNaCasa(){
		JOptionPane.showMessageDialog(null, "Cliente não encontra-se na casa." ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void erroCamposInvalidos(){
		JOptionPane.showMessageDialog(null, "Preencha adequadamento as informações do cliente." ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
}
