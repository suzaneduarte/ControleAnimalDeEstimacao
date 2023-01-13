package view.TelaCadastroAnimal;

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

	public class FormularioCadAnimal implements ActionListener {
		JFrame janela;
		
		private int bordaX = 50;
		private int bordaY = 24;

		public FormularioCadAnimal(JFrame janela) {
			this.janela = janela;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public void construir() {
			construirCaixaDoNome(janela);
			construirCaixaDaRaca(janela);
			construirCaixaDoDataNasc(janela);	
			construirCaixaDeSexo(janela);
			construirCaixaDaEspecie(janela);
			
		}
		
		private void construirCaixaDoNome(JFrame janela) {
			JLabel nome = new JLabel("Nome:"); 
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
			JLabel raça = new JLabel ("Raça:"); 
			raça.setBounds(bordaX, bordaY + 261, 160, 20);
			raça.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarRaça = new JTextField(11);
			digitarRaça.setBounds(bordaX + 150, bordaY + 261, 180, 20);
			
			janela.add(raça);
			janela.add(digitarRaça);
			
		}
		
		private void construirCaixaDoDataNasc(JFrame janela) {
			JLabel datanasc = new JLabel ("Data Nascimento:"); //rótulo só com texto
			datanasc.setBounds(bordaX, bordaY + 339, 160, 20);
			datanasc.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarDatanasc = new JTextField(10);
			digitarDatanasc.setBounds(bordaX + 150, bordaY + 339, 180, 20);
			
			janela.add(datanasc);
			janela.add(digitarDatanasc);		
		}
		
		private void construirCaixaDeSexo (JFrame janela) {
			JLabel sexo = new JLabel ("Sexo:");
			sexo.setBounds(bordaX, bordaY + 222, 160, 20);
			sexo.setFont(new Font("Arial", Font.BOLD, 14));
			String[] sexosStrings = {"Masculino", "Feminino", "Outro"}; //opções de sexo
			JComboBox<Object> caixaSelecionarSexo = new JComboBox<Object>(sexosStrings);
			caixaSelecionarSexo.setBounds(bordaX + 150, bordaY + 222, 180, 20);
			
			janela.add(sexo);
			janela.add(caixaSelecionarSexo);
		}
		
		private void construirCaixaDaEspecie(JFrame janela) {
			JLabel datanasc = new JLabel ("Especie:");
			datanasc.setBounds(bordaX, bordaY + 300, 160, 20);
			datanasc.setFont(new Font("Arial", Font.BOLD, 14));
			
//			utilizar enum: 
//			jCBEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(this.clienteController.getDescricao().getEstadoCivil().values()));
			
			janela.add(datanasc);	
		}
	}