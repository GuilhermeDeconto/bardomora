package uinterface;

import business.Bar;
import persistence.Cliente;
import utils.Genero;
import utils.Mensagem;
import utils.Utils;
import utils.Validador;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class LiberacaoEntrada extends JFrame {

	private JPanel contentPane;
	private JTextField textNmSocio;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;

	/**
	 * Create the frame.
	 * @param
	 * @param
	 */
	public LiberacaoEntrada(Bar c) {
		Bar controle = c;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setUndecorated(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmSocio = new JLabel("N\u00FAmero de s\u00F3cio");
		lblNmSocio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNmSocio.setBounds(25, 13, 137, 16);
		contentPane.add(lblNmSocio);
		
		textNmSocio = new JTextField();
		textNmSocio.setBounds(174, 11, 116, 22);
		contentPane.add(textNmSocio);
		textNmSocio.setColumns(10);
		textNmSocio.setEditable(false);
		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(25, 42, 56, 16);
		contentPane.add(lblNome);
		
		MaskFormatter maskNome = Utils.formatadorNome();
		
		textFieldNome = new JFormattedTextField(maskNome);
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldNome.setBounds(93, 40, 327, 22);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(25, 71, 69, 16);
		contentPane.add(lblCpf);
		
		MaskFormatter maskCpf = Utils.formatadorCPF();
		
		textFieldCPF = new JFormattedTextField(maskCpf);
		textFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCPF.setBounds(93, 69, 116, 22);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(221, 71, 56, 16);
		contentPane.add(lblIdade);
		
		JComboBox<Integer> comboBoxIdade = new JComboBox<Integer>(iniciarComboBoxIdade());
		comboBoxIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxIdade.setBounds(269, 69, 56, 22);
		contentPane.add(comboBoxIdade);
		
		JLabel lblGenero = new JLabel("S:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setBounds(330, 71, 56, 16);
		contentPane.add(lblGenero);
		
		JComboBox<String> comboGenero = new JComboBox<String>();
		comboGenero.addItem("Masculino");
		comboGenero.addItem("Feminino");
		comboGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboGenero.setBounds(350, 69, 76, 22);
		contentPane.add(comboGenero);
		
		JButton btnLiberarEntrada = new JButton("Liberar Entrada");
		btnLiberarEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textFieldNome.getText();
				String cpf = Validador.retiraSinaisCPF(textFieldCPF.getText());
				int idade = comboBoxIdade.getSelectedIndex();
				Genero g = Genero.masculinoOuFeminino((String) comboGenero.getSelectedItem()) ;
				Cliente cliente = new Cliente(nome, cpf, idade, g, controle.getClientesCadastrados().size());
				controle.liberaAcessoCliente(cliente);
				dispose();
			}
		});
		btnLiberarEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLiberarEntrada.setBounds(115, 104, 218, 57);
		contentPane.add(btnLiberarEntrada);
		
		JButton btnCadastrarScioE = new JButton("Cadastrar s\u00F3cio e Liberar Entrada");
		btnCadastrarScioE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textFieldNome.getText().trim();
				String cpf = Validador.retiraSinaisCPF(textFieldCPF.getText());
				int idade = comboBoxIdade.getSelectedIndex();
				Genero g = Genero.masculinoOuFeminino((String) comboGenero.getSelectedItem());
				int id = 0;
				if(textNmSocio.getText().equals("")) {
					id = Validador.geraNrSocio(controle.getClientesCadastrados().size());
				} else {
					id = Integer.parseInt(textNmSocio.getText());
				}
				Cliente cliente = new Cliente(nome, cpf, idade, g, id);
				controle.cadastraCliente(cliente);
				Mensagem.avisoClienteCadastradoComSucesso(cliente.getNrSocio());
				dispose();
			}
		});
		btnCadastrarScioE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCadastrarScioE.setBounds(25, 172, 395, 57);
		contentPane.add(btnCadastrarScioE);

		JButton btnBuscarScio = new JButton("Buscar s\u00F3cio");
		btnBuscarScio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente c = controle.buscaClienteCadastrado(Validador.retiraSinaisCPF(textFieldCPF.getText()));
				if (c != null){
					textFieldCPF.setText(c.getCpf());
					textFieldNome.setText(c.getNome());
					textNmSocio.setText(String.valueOf(c.getNrSocio()));
					comboBoxIdade.setSelectedItem(c.getIdade());
					comboGenero.setSelectedIndex(c.getGenero() == Genero.M ? 0 : 1);
				} else {
					Mensagem.avisoMensagemCPFNaoEncontrado();
				}
			}
		});
		btnBuscarScio.setBounds(302, 10, 118, 25);
		contentPane.add(btnBuscarScio);
		
	}

	private Vector<Integer> iniciarComboBoxIdade() {
		int idade = 0;
		Vector<Integer> vetor = new Vector<Integer>();
		while (idade <= 100){
			vetor.add(idade);
			idade++;
		}
		return vetor;
	}
}
