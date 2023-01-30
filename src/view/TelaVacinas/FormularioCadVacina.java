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

import controle.ControleVacinas;
import enumerate.Intervalo;
import enumerate.Sexo;
import modelo.Vacina;

import javax.swing.JCheckBox;


/**
 *  Classe FormularioVacina cria o formulario cadastro de Vacina
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

public class FormularioCadVacina implements ActionListener {
		private JFrame janela;
		private ControleVacinas controle;
		
		private int bordaX = 20;
		private int bordaY = 24;
		
		private JTextField caixaDeTextoNome;
		private JTextField caixaDeTextoLab;
		private JTextField digitarData;
		private JTextField digitarLote;
		private JCheckBox checkboxRevacina;
		private JTextField caixaDeTextoPer;
		private JComboBox comboboxIntervalo;
		

		public FormularioCadVacina(JFrame janela, ControleVacinas controle) {
			this.janela = janela;
			this.controle = controle;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public String getNome() {
			return this.caixaDeTextoNome.getText();
		}
		
		public String getLaboratorio() {
			return this.caixaDeTextoLab.getText();
		}
		
		public String getData() {
			return this.digitarData.getText();
		}
		
		public String getLote() {
			return this.digitarLote.getText();
		}
		
		public boolean getRevacina() {
			return this.checkboxRevacina.isSelected();
		}
		
		public int getPeriodo() {
			return Integer.parseInt(this.caixaDeTextoPer.getText()); 
		}
		
		public Intervalo getIntervalo() {
			String intervalo = this.comboboxIntervalo.getSelectedItem().toString();
			return Intervalo.valueOf(intervalo);
		}

		/**
		 * consttroi os elementos
		 */
		public void construir() {
			construirCaixaDoNome(janela);
			construirCaixaDaData(janela);
			construirCaixaLote(janela);	
			construirCaixaLaboratorio(janela);
			construirCheckBoxRevacina(janela);
			construirCaixaPeriodo(janela);
			construirComboBoxIntervalo(janela);
			
			if(controle.GetVacinaSelecionada() != null) {
				preencherCampos(controle.GetVacinaSelecionada());
			}
		}
		/**
		 * preenche os campos
		 * @param vacina
		 */
		private void preencherCampos(Vacina vacina) {
			caixaDeTextoNome.setText(vacina.getNomeDaVacina());
			caixaDeTextoLab.setText(vacina.getLaboratorio());
			digitarData.setText(vacina.getData());
			digitarLote.setText(vacina.getLote());
			caixaDeTextoPer.setText(Integer.toString(vacina.getPeriodo()));
			comboboxIntervalo.setSelectedItem(vacina.getIntervalo());
			checkboxRevacina.setSelected(vacina.getRevacina());
		}

		/**
		 * nome
		 */
		private void construirCaixaDoNome(JFrame janela) {
			JLabel nome = new JLabel("Nome da vacina:"); 
			nome.setBounds(bordaX, bordaY + 170, 160, 30);
			nome.setFont(new Font("Arial", Font.BOLD, 14));
			
			caixaDeTextoNome = new JTextField(20); 
			caixaDeTextoNome.setActionCommand("myTF");
			caixaDeTextoNome.setBounds(bordaX  + 220, bordaY + 170, 180, 20);
			caixaDeTextoNome.addActionListener(this);
			
			janela.add(caixaDeTextoNome);
			janela.add(nome);
			
		}
		/**
		 * cx do laboratorio
		 * @param janela
		 */
		
		private void construirCaixaLaboratorio (JFrame janela) {
			JLabel lab = new JLabel ("Laboratório:");
			lab.setBounds(bordaX, bordaY + 220, 160, 20);
			lab.setFont(new Font("Arial", Font.BOLD, 14));
			
			caixaDeTextoLab = new JTextField(20); 
			caixaDeTextoLab.setBounds(bordaX + 220, bordaY + 220, 180, 20);
			caixaDeTextoLab.addActionListener(this);
			
			janela.add(lab);
			janela.add(caixaDeTextoLab);
		}
		/**
		 * cx da data
		 * @param janela
		 */
		
		private void construirCaixaDaData(JFrame janela) {
			JLabel data = new JLabel ("Data:"); 
			data.setBounds(bordaX, bordaY + 270, 160, 20);
			data.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarData = new JTextField(11);
			digitarData.setBounds(bordaX  + 220, bordaY + 270, 180, 20);
			
			janela.add(data);
			janela.add(digitarData);
			
		}
		/**
		 * cx do lote
		 * @param janela
		 */
		
		
		private void construirCaixaLote(JFrame janela) {
			JLabel lote = new JLabel ("Lote:"); //rótulo só com texto
			lote.setBounds(bordaX, bordaY + 320, 160, 20);
			lote.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarLote = new JTextField(10);
			digitarLote.setBounds(bordaX  + 220, bordaY + 320, 180, 20);
			
			janela.add(lote);
			janela.add(digitarLote);		
		}
		
		
		/**
		 * cx do checkbox da vacina
		 * @param janela
		 */
		
		private void construirCheckBoxRevacina(JFrame janela) {
			JLabel revacina = new JLabel("Necessidade de Revacina?");
			revacina.setBounds(bordaX, bordaY + 370, 250, 30);
			revacina.setFont(new Font("Arial", Font.BOLD, 14));
			
			checkboxRevacina = new JCheckBox("Sim");
			checkboxRevacina.setBounds(bordaX + 220, bordaY + 370, 250, 20);
			checkboxRevacina.setOpaque(false);
			janela.add(revacina);
			janela.add(checkboxRevacina);
		}
		/**
		 * cx da cx do periodo
		 * @param janela
		 */
		
		
		private void construirCaixaPeriodo (JFrame janela) {
			JLabel periodo = new JLabel ("A cada:");
			periodo.setBounds(bordaX, bordaY + 420, 160, 20);
			periodo.setFont(new Font("Arial", Font.BOLD, 14));
			
			caixaDeTextoPer = new JTextField(20); 
			caixaDeTextoPer.setBounds(bordaX + 220, bordaY + 420, 180, 20);
			caixaDeTextoPer.addActionListener(this);
			
			janela.add(periodo);
			janela.add(caixaDeTextoPer);
		}
		/**
		 * cx do combobox intervalo
		 * @param janela
		 */
		
		
		private void construirComboBoxIntervalo(JFrame janela) {
			JLabel intervalo = new JLabel("Intervalo:");
			intervalo.setBounds(bordaX, bordaY + 470, 250, 30);
			intervalo.setFont(new Font("Arial", Font.BOLD, 14));
			
			String[] periodosStrings = {"DIA", "MES", "ANO"};
			comboboxIntervalo = new JComboBox(periodosStrings);
			comboboxIntervalo.setBounds(bordaX + 220, bordaY + 470, 180, 20);
			comboboxIntervalo.setOpaque(false);
			janela.add(intervalo);
			janela.add(comboboxIntervalo);
	}
}