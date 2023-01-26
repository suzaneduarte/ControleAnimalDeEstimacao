package view.TelaVacinas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JCheckBox;

	public class FormularioCadVacina implements ActionListener {
		JFrame janela;
		
		private int bordaX = 50;
		private int bordaY = 24;

		public FormularioCadVacina(JFrame janela) {
			this.janela = janela;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public void construir() {
			construirCaixaDoNome(janela);
			construirCaixaDaRaca(janela);
			construirCaixaLote(janela);	
			construirCaixaLaboratorio(janela);
			construirCheckBoxRevacina(janela);
		}
		
		private void construirCaixaDoNome(JFrame janela) {
			JLabel nome = new JLabel("Nome da vacina:"); 
			nome.setBounds(bordaX, bordaY + 170, 160, 30);
			nome.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField caixaDeTexto = new JTextField(20); 
			caixaDeTexto.setActionCommand("myTF");
			caixaDeTexto.setBounds(bordaX + 150, bordaY + 172, 180, 20);
			caixaDeTexto.addActionListener(this);
			
			janela.add(caixaDeTexto);
			janela.add(nome);
		}
		
		private void construirCaixaDaRaca(JFrame janela) {
			JLabel data = new JLabel ("Data:"); 
			data.setBounds(bordaX, bordaY + 261, 160, 20);
			data.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarData = new JTextField(11);
			digitarData.setBounds(bordaX + 150, bordaY + 261, 180, 20);
			
			janela.add(data);
			janela.add(digitarData);
			
		}
		
		private void construirCaixaLote(JFrame janela) {
			JLabel lote = new JLabel ("Lote:"); //rótulo só com texto
			lote.setBounds(bordaX, bordaY + 339, 160, 20);
			lote.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarLote = new JTextField(10);
			digitarLote.setBounds(bordaX + 150, bordaY + 339, 180, 20);
			
			janela.add(lote);
			janela.add(digitarLote);		
		}
		
		private void construirCaixaLaboratorio (JFrame janela) {
			JLabel lab = new JLabel ("Laboratório:");
			lab.setBounds(bordaX, bordaY + 222, 160, 20);
			lab.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField caixaDeTextoLab = new JTextField(20); 
			caixaDeTextoLab.setBounds(bordaX + + 240, bordaY + 220, 180, 20);
			caixaDeTextoLab.addActionListener(this);
			
			janela.add(lab);
			janela.add(caixaDeTextoLab);
		}
		
		private void construirCheckBoxRevacina(JFrame janela) {
			JLabel revacina = new JLabel("Necessidade de Revacina?");
			revacina.setBounds(bordaX, bordaY + 295, 190, 30);
			revacina.setFont(new Font("Arial", Font.BOLD, 14));
			
			JCheckBox checkbox = new JCheckBox("Sim");
			checkbox.setBounds(bordaX + 240, bordaY + 295, 250, 30);
			checkbox.setOpaque(false);
			janela.add(revacina);
			janela.add(checkbox);
			
			
		}

	}

