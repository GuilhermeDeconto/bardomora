package uinterface;

import business.ControleRelatorio;
import utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Month;
import java.util.HashMap;
import java.util.Vector;

public class Relatorio extends JFrame {

	private JPanel contentPane;
	private ControleRelatorio controle;

	public Relatorio() {
		controle = new ControleRelatorio();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		setBounds(100, 100, 400, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int distanciaDoPrimeiro = 75;
		int distancia = 20;
		
		JLabel labelDia01 = new JLabel("");
		labelDia01.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia01);
		distancia += 20;
		
		JLabel labelDia02 = new JLabel("");
		labelDia02.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia02);
		distancia += 20;
		
		JLabel labelDia03 = new JLabel("");
		labelDia03.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia03);
		distancia += 20;
		
		JLabel labelDia04 = new JLabel("");
		labelDia04.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia04);
		distancia += 20;
		
		JLabel labelDia05 = new JLabel("");
		labelDia05.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia05);
		distancia += 20;
		
		JLabel labelDia06 = new JLabel("");
		labelDia06.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia06);
		distancia += 20;
		
		JLabel labelDia07 = new JLabel("");
		labelDia07.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia07);
		distancia += 20;
		
		JLabel labelDia08 = new JLabel("");
		labelDia08.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia08);
		distancia += 20;
		
		JLabel labelDia09 = new JLabel("");
		labelDia09.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia09);
		distancia += 20;
		
		JLabel labelDia10 = new JLabel("");
		labelDia10.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia10);
		distancia += 20;
		
		JLabel labelDia11 = new JLabel("");
		labelDia11.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia11);
		distancia += 20;
		
		JLabel labelDia12 = new JLabel("");
		labelDia12.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia12);
		distancia += 20;
		
		JLabel labelDia13 = new JLabel("");
		labelDia13.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia13);
		distancia += 20;
		
		JLabel labelDia14 = new JLabel("");
		labelDia14.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia14);
		distancia += 20;
		
		JLabel labelDia15 = new JLabel("");
		labelDia15.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia15);
		distancia += 20;
		
		JLabel labelDia16 = new JLabel("");
		labelDia16.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia16);
		distancia += 20;
		
		JLabel labelDia17 = new JLabel("");
		labelDia17.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia17);
		distancia += 20;
		
		JLabel labelDia18 = new JLabel("");
		labelDia18.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia18);
		distancia += 20;
		
		JLabel labelDia19 = new JLabel("");
		labelDia19.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia19);
		distancia += 20;
		
		JLabel labelDia20 = new JLabel("");
		labelDia20.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia20);
		distancia += 20;
		
		JLabel labelDia21 = new JLabel("");
		labelDia21.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia21);
		distancia += 20;
		
		JLabel labelDia22 = new JLabel("");
		labelDia22.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia22);
		distancia += 20;
		
		JLabel labelDia23 = new JLabel("");
		labelDia23.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia23);
		distancia += 20;
		
		JLabel labelDia24 = new JLabel("");
		labelDia24.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia24);
		distancia += 20;
		
		JLabel labelDia25 = new JLabel("");
		labelDia25.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia25);
		distancia += 20;
		
		JLabel labelDia26 = new JLabel("");
		labelDia26.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia26);
		distancia += 20;
		
		JLabel labelDia27 = new JLabel("");
		labelDia27.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia27);
		distancia += 20;
		
		JLabel labelDia28 = new JLabel("");
		labelDia28.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia28);
		distancia += 20;
		
		JLabel labelDia29 = new JLabel("");
		labelDia29.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia29);
		distancia += 20;
		
		JLabel labelDia30 = new JLabel("");
		labelDia30.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia30);
		distancia += 20;
		
		JLabel labelDia31 = new JLabel("");
		labelDia31.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia31);
		
		JComboBox comboBoxMes = new JComboBox(Month.values());
		comboBoxMes.setBounds(76, 13, 168, 20);
		contentPane.add(comboBoxMes);
		
		JComboBox comboBoxAno = new JComboBox(contador(2017, 2099));
		comboBoxAno.setBounds(256, 13, 86, 20);
		contentPane.add(comboBoxAno);
		
		JButton btnGerarRelatrio = new JButton("Gerar Relat\u00F3rio");
		btnGerarRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Month mes = (Month) comboBoxMes.getSelectedItem();
				int ano = (int) comboBoxAno.getSelectedItem();
				HashMap<Integer, Integer> relatorio = controle.criaRelatorio(mes, ano);
				if(relatorio != null && relatorio.size() != 0){
					labelDia01.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(1))));
					labelDia02.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(2))));
					labelDia03.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(3))));
					labelDia04.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(4))));
					labelDia05.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(5))));
					labelDia06.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(6))));
					labelDia07.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(7))));
					labelDia08.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(8))));
					labelDia09.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(9))));
					labelDia10.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(10))));
					labelDia11.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(11))));
					labelDia12.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(12))));
					labelDia13.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(13))));
					labelDia14.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(14))));
					labelDia15.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(15))));
					labelDia16.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(16))));
					labelDia17.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(17))));
					labelDia18.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(18))));
					labelDia19.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(19))));
					labelDia20.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(20))));
					labelDia21.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(21))));
					labelDia22.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(22))));
					labelDia23.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(23))));
					labelDia24.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(24))));
					labelDia25.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(25))));
					labelDia26.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(26))));
					labelDia27.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(27))));
					labelDia28.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(28))));
					labelDia29.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(29))));
					labelDia30.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(30))));
					labelDia31.setText(Utils.formataRelatorio(String.valueOf(relatorio.get(31))));
					btnGerarRelatrio.setEnabled(false);
				}
			}
		});
		btnGerarRelatrio.setBounds(86, 46, 125, 25);
		contentPane.add(btnGerarRelatrio);
		
		
		
		
		JButton btnFechar = new JButton("Fechar Janela");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnFechar.setBounds(223, 46, 119, 25);
		contentPane.add(btnFechar);
		
		criaLabelDiaFixo();
		criaLabelRelatorioDias();
		
	}

	private void criaLabelRelatorioDias() {
		int distanciaDoPrimeiro = 75;
		int distancia = 20;
		
		JLabel labelDia01 = new JLabel("");
		labelDia01.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia01);
		distancia++;
		
		JLabel labelDia02 = new JLabel("");
		labelDia02.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia02);
		distancia++;
		
		JLabel labelDia03 = new JLabel("");
		labelDia03.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia03);
		distancia++;
		
		JLabel labelDia04 = new JLabel("");
		labelDia04.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia04);
		distancia++;
		
		JLabel labelDia05 = new JLabel("");
		labelDia05.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia05);
		distancia++;
		
		JLabel labelDia06 = new JLabel("");
		labelDia06.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia06);
		distancia++;
		
		JLabel labelDia07 = new JLabel("");
		labelDia07.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia07);
		distancia++;
		
		JLabel labelDia08 = new JLabel("");
		labelDia08.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia08);
		distancia++;
		
		JLabel labelDia09 = new JLabel("");
		labelDia09.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia09);
		distancia++;
		
		JLabel labelDia10 = new JLabel("");
		labelDia10.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia10);
		distancia++;
		
		JLabel labelDia11 = new JLabel("");
		labelDia11.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia11);
		distancia++;
		
		JLabel labelDia12 = new JLabel("");
		labelDia12.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia12);
		distancia++;
		
		JLabel labelDia13 = new JLabel("");
		labelDia13.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia13);
		distancia++;
		
		JLabel labelDia14 = new JLabel("");
		labelDia14.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia14);
		distancia++;
		
		JLabel labelDia15 = new JLabel("");
		labelDia15.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia15);
		distancia++;
		
		JLabel labelDia16 = new JLabel("");
		labelDia16.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia16);
		distancia++;
		
		JLabel labelDia17 = new JLabel("");
		labelDia17.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia17);
		distancia++;
		
		JLabel labelDia18 = new JLabel("");
		labelDia18.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia18);
		distancia++;
		
		JLabel labelDia19 = new JLabel("");
		labelDia19.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia19);
		distancia++;
		
		JLabel labelDia20 = new JLabel("");
		labelDia20.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia20);
		distancia++;
		
		JLabel labelDia21 = new JLabel("");
		labelDia21.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia21);
		distancia++;
		
		JLabel labelDia22 = new JLabel("");
		labelDia22.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia22);
		distancia++;
		
		JLabel labelDia23 = new JLabel("");
		labelDia23.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia23);
		distancia++;
		
		JLabel labelDia24 = new JLabel("");
		labelDia24.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia24);
		distancia++;
		
		JLabel labelDia25 = new JLabel("");
		labelDia25.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia25);
		distancia++;
		
		JLabel labelDia26 = new JLabel("");
		labelDia26.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia26);
		distancia++;
		
		JLabel labelDia27 = new JLabel("");
		labelDia27.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia27);
		distancia++;
		
		JLabel labelDia28 = new JLabel("");
		labelDia28.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia28);
		distancia++;
		
		JLabel labelDia29 = new JLabel("");
		labelDia29.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia29);
		distancia++;
		
		JLabel labelDia30 = new JLabel("");
		labelDia30.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia30);
		distancia++;
		
		JLabel labelDia31 = new JLabel("");
		labelDia31.setBounds(35, (distanciaDoPrimeiro + distancia), 250, 16);	
		contentPane.add(labelDia31);
	}

	private Vector<Integer> contador(int contadorIncial, int contadorFinal) {
		int contador = contadorIncial;
		int contadorF = contadorFinal;
		Vector<Integer> vetor = new Vector<Integer>();
		while (contador <= contadorF){
			vetor.add(contador);
			contador++;
		}
		return vetor;
	}

	private void criaLabelDiaFixo() {
		int numero = 1;
		int distanciaDoPrimeiro = 75;
		int distancia = 20;
		for (int i = 1; i <= 31; i++) {
			JLabel label = new JLabel(String.valueOf(numero++ + " - "));
			label.setBounds(12, (distanciaDoPrimeiro + distancia), 25, 16);
			contentPane.add(label);
			distancia += 20;
		}
	}
}
