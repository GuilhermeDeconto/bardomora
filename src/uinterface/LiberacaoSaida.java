package uinterface;

import business.Bar;
import persistence.Cliente;
import utils.Utils;
import utils.Validador;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiberacaoSaida extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCPF;

	public LiberacaoSaida(Bar c) {
		Bar controle = c;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setUndecorated(false);
		setBounds(100, 100, 430, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255, 217, 179));
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(12, 28, 43, 16);
		contentPane.add(lblCpf);
		
		MaskFormatter maskCpf = Utils.formatadorCPF();
		
		textFieldCPF = new JFormattedTextField(maskCpf);
		textFieldCPF.setBounds(67, 26, 169, 22);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JButton btnLiberarSada = new JButton("Liberar sa\u00EDda");
		btnLiberarSada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = (Validador.retiraSinaisCPF(textFieldCPF.getText()));
				controle.liberaSaidaCliente(cpf);
			}
		});
		btnLiberarSada.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLiberarSada.setBounds(248, 25, 138, 25);
		contentPane.add(btnLiberarSada);
	}

}
