package uinterface;

import business.Bar;
import persistence.Cliente;
import utils.Mensagem;
import utils.Utils;
import utils.Validador;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelControle extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCPF;
	private Bar controle;

	public PainelControle() {
		controle = new Bar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		setBounds(200, 200, 500, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLiberarSada = new JButton("Liberar Sa\u00EDda");
		btnLiberarSada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LiberacaoSaida frame = new LiberacaoSaida(controle);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLiberarSada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLiberarSada.setBounds(104, 13, 189, 25);
		contentPane.add(btnLiberarSada);
		
		JButton btnLiberarEntrada = new JButton("Liberar Entrada");
		btnLiberarEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LiberacaoEntrada frame = new LiberacaoEntrada(controle);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLiberarEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLiberarEntrada.setBounds(104, 51, 189, 25);
		contentPane.add(btnLiberarEntrada);
		
		JLabel lblQuantidadeDeClientes = new JLabel("Quantidade de cliente da casa:");
		lblQuantidadeDeClientes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantidadeDeClientes.setBounds(32, 96, 231, 16);
		contentPane.add(lblQuantidadeDeClientes);
		
		JLabel labelMostraQuantidade = new JLabel("0");
		labelMostraQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMostraQuantidade.setBounds(270, 97, 56, 16);
		contentPane.add(labelMostraQuantidade);
		
		JProgressBar progressBarMasculino = new JProgressBar();
		progressBarMasculino.setBounds(203, 125, 146, 14);
		progressBarMasculino.setStringPainted(true);
		contentPane.add(progressBarMasculino);
		
		JProgressBar progressBarFemino = new JProgressBar();
		progressBarFemino.setBounds(203, 157, 146, 14);
		progressBarFemino.setStringPainted(true);
		contentPane.add(progressBarFemino);
		
		JLabel lblPercentualMaculino = new JLabel("Percentual masculino");
		lblPercentualMaculino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentualMaculino.setBounds(32, 125, 159, 16);
		contentPane.add(lblPercentualMaculino);
		
		JLabel lblPercentualFeminino = new JLabel("Percentual feminino");
		lblPercentualFeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentualFeminino.setBounds(32, 157, 159, 16);
		contentPane.add(lblPercentualFeminino);
		
		JLabel labelPercentualSocios = new JLabel("Percentual de s\u00F3cios");
		labelPercentualSocios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelPercentualSocios.setBounds(32, 186, 159, 16);
		contentPane.add(labelPercentualSocios);
		
		JProgressBar progressBarSocios = new JProgressBar();
		progressBarSocios.setBounds(203, 188, 146, 14);
		progressBarSocios.setStringPainted(true);
		contentPane.add(progressBarSocios);
		
		MaskFormatter maskCpf = Utils.formatadorCPF();
		
		textFieldCPF = new JFormattedTextField(maskCpf);
		textFieldCPF.setBounds(75, 226, 116, 22);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(32, 228, 39, 16);
		contentPane.add(lblCpf);
		
		JButton btnConsultarCpf = new JButton("Consultar CPF");
		btnConsultarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente c = controle.buscaClienteNaCasa(Validador.retiraSinaisCPF(textFieldCPF.getText()));
				if (c != null){
					Mensagem.avisoClienteEncontradoNaCasa();
				} else {
					Mensagem.avisoClienteNaoEncontradoNaCasa();
				}
			}
		});
		btnConsultarCpf.setBounds(203, 225, 150, 25);
		contentPane.add(btnConsultarCpf);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelMostraQuantidade.setText(String.valueOf(controle.getClientesNaCasa().size()));
				int totalPublicoNaCasa = controle.getClientesNaCasa().size();
				int totalPublicoMasculino = controle.qtdClientesMasc();
				int totalPublicoFemino = totalPublicoNaCasa - totalPublicoMasculino;
				int totalSociosNaCasa = controle.qtdClientesSocios();
				if (totalPublicoNaCasa != 0){
					progressBarFemino.setValue(Utils.verificaPorcentagem(totalPublicoNaCasa, totalPublicoFemino));
					progressBarMasculino.setValue(Utils.verificaPorcentagem(totalPublicoNaCasa, totalPublicoMasculino));
					progressBarSocios.setValue(Utils.verificaPorcentagem(totalPublicoNaCasa, totalSociosNaCasa));
				} else {
					Mensagem.mostraMensagemNaoContemNinguem();
				}
				progressBarFemino.setStringPainted(true);
			}
		});
		btnAtualizar.setBounds(275, 255, 100, 25);
		contentPane.add(btnAtualizar);
		
		JButton btnRelatorio = new JButton("Visualizar Relatório");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorio frame = new Relatorio();
				frame.setVisible(true);
			}
		});
		btnRelatorio.setBounds(230, 285, 145, 25);
		contentPane.add(btnRelatorio);
		
		JButton btnFechar = new JButton("Encerrar dia");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.encerraEspediente();
				System.exit(0);
			}
		});
		btnFechar.setBounds(230, 315, 145, 25);
		contentPane.add(btnFechar);
	}
}
