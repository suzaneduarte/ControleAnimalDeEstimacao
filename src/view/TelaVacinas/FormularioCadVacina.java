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

import enumerate.Intervalo;

import javax.swing.JCheckBox;

	public class FormularioCadVacina implements ActionListener {
		JFrame janela;
		
		private int bordaX = 20;
		private int bordaY = 24;

		public FormularioCadVacina(JFrame janela) {
			this.janela = janela;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public void construir() {
			construirCaixaDoNome(janela);
			construirCaixaDaData(janela);
			construirCaixaLote(janela);	
			construirCaixaLaboratorio(janela);
			construirCheckBoxRevacina(janela);
			construirCaixaPeriodo(janela);
			construirComboBoxIntervalo(janela);
		}
		
		private void construirCaixaDoNome(JFrame janela) {
			JLabel nome = new JLabel("Nome da vacina:"); 
			nome.setBounds(bordaX, bordaY + 170, 160, 30);
			nome.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField caixaDeTexto = new JTextField(20); 
			caixaDeTexto.setActionCommand("myTF");
			caixaDeTexto.setBounds(bordaX  + 220, bordaY + 170, 180, 20);
			caixaDeTexto.addActionListener(this);
			
			janela.add(caixaDeTexto);
			janela.add(nome);
		}
		
		private void construirCaixaDaData(JFrame janela) {
			JLabel data = new JLabel ("Data:"); 
			data.setBounds(bordaX, bordaY + 270, 160, 20);
			data.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarData = new JTextField(11);
			digitarData.setBounds(bordaX  + 220, bordaY + 270, 180, 20);
			
			janela.add(data);
			janela.add(digitarData);
			
		}
		
		private void construirCaixaLote(JFrame janela) {
			JLabel lote = new JLabel ("Lote:"); //rótulo só com texto
			lote.setBounds(bordaX, bordaY + 320, 160, 20);
			lote.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarLote = new JTextField(10);
			digitarLote.setBounds(bordaX  + 220, bordaY + 320, 180, 20);
			
			janela.add(lote);
			janela.add(digitarLote);		
		}
		
		private void construirCaixaLaboratorio (JFrame janela) {
			JLabel lab = new JLabel ("Laboratório:");
			lab.setBounds(bordaX, bordaY + 220, 160, 20);
			lab.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField caixaDeTextoLab = new JTextField(20); 
			caixaDeTextoLab.setBounds(bordaX + 220, bordaY + 220, 180, 20);
			caixaDeTextoLab.addActionListener(this);
			
			janela.add(lab);
			janela.add(caixaDeTextoLab);
		}
		
		private void construirCheckBoxRevacina(JFrame janela) {
			JLabel revacina = new JLabel("Necessidade de Revacina?");
			revacina.setBounds(bordaX, bordaY + 370, 250, 30);
			revacina.setFont(new Font("Arial", Font.BOLD, 14));
			
			JCheckBox checkbox = new JCheckBox("Sim");
			checkbox.setBounds(bordaX + 220, bordaY + 370, 250, 20);
			checkbox.setOpaque(false);
			janela.add(revacina);
			janela.add(checkbox);
		}
		
		private void construirCaixaPeriodo (JFrame janela) {
			JLabel periodo = new JLabel ("A cada:");
			periodo.setBounds(bordaX, bordaY + 420, 160, 20);
			periodo.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField caixaDeTextoPer = new JTextField(20); 
			caixaDeTextoPer.setBounds(bordaX + 220, bordaY + 420, 180, 20);
			caixaDeTextoPer.addActionListener(this);
			
			janela.add(periodo);
			janela.add(caixaDeTextoPer);
		}
		
		private void construirComboBoxIntervalo(JFrame janela) {
			JLabel intervalo = new JLabel("Intervalo:");
			intervalo.setBounds(bordaX, bordaY + 470, 250, 30);
			intervalo.setFont(new Font("Arial", Font.BOLD, 14));
			
			JComboBox comboboxIntervalo = new JComboBox(Intervalo.values());
			comboboxIntervalo.setBounds(bordaX + 220, bordaY + 470, 180, 20);
			comboboxIntervalo.setOpaque(false);
			janela.add(intervalo);
			janela.add(comboboxIntervalo);
	}
}