package view.TelaCadastro;

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

	public class FormularioCadastro implements ActionListener {
		JFrame janela;
		
		private int bordaX = 50;
		private int bordaY = 24;

		public FormularioCadastro(JFrame janela) {
			this.janela = janela;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public void construir() {
			construirCaixaDeTexto(janela);
			construirCaixaDeTextoDeSenha(janela);
			construirCaixaDeTextoDeConfirmarSenha(janela);
			construirCaixaDoCpf(janela);
			construirCaixaDoTelefone(janela);
			construirCaixaDoDataNasc(janela);	
			construirCaixaDeSexo(janela);
			
		}
		
		private void construirCaixaDeTexto(JFrame janela) {
			JLabel email = new JLabel("E-mail:"); //rótulo só com texto
			email.setBounds(bordaX, bordaY + 100, 160, 30);
			email.setFont(new Font("Arial", Font.BOLD, 14));
			JTextField caixaDeTexto = new JTextField(20); //cria campo de texto com largura de 10 colunas 
			caixaDeTexto.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTexto.setBounds(bordaX + 150, bordaY + 105, 180, 20);
			caixaDeTexto.addActionListener(this);
			
			janela.add(caixaDeTexto);
			janela.add(email);
		}
		
		private void construirCaixaDeTextoDeSenha(JFrame janela) {
			JLabel senha = new JLabel("Sua senha:"); //rótulo só com texto
			senha.setBounds(bordaX, bordaY + 144, 160, 20);
			senha.setFont(new Font("Arial", Font.BOLD, 14));
			JTextField caixaDeTextoSenha = new JPasswordField(30);
			caixaDeTextoSenha.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTextoSenha.setBounds(bordaX + 150, bordaY + 144, 180, 20);
			
			janela.add(caixaDeTextoSenha);
			janela.add(senha);
		}
		
		private void construirCaixaDeTextoDeConfirmarSenha(JFrame janela) {
			JLabel confirmarsenha = new JLabel("Confirme a senha:"); //rótulo só com texto
			confirmarsenha.setBounds(bordaX, bordaY + 183, 160, 20);
			confirmarsenha.setFont(new Font("Arial", Font.BOLD, 14));
			JTextField caixaDeTextoConfirmarSenha = new JPasswordField(30);
			caixaDeTextoConfirmarSenha.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTextoConfirmarSenha.setBounds(bordaX + 150, bordaY + 183, 180, 20);
			
			janela.add(caixaDeTextoConfirmarSenha);
			janela.add(confirmarsenha);
		}
		
		private void construirCaixaDoCpf (JFrame janela) {
			JLabel cpf = new JLabel ("CPF:"); //rótulo só com texto
			cpf.setBounds(bordaX, bordaY + 261, 160, 20);
			cpf.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarCpf = new JTextField(11);
			digitarCpf.setBounds(bordaX + 150, bordaY + 261, 180, 20);
			
			janela.add(cpf);
			janela.add(digitarCpf);
			
		}
		
		private void construirCaixaDoTelefone (JFrame janela) {
			JLabel telefone = new JLabel ("Telefone:"); //rótulo só com texto
			telefone.setBounds(bordaX, bordaY + 300, 160, 20);
			telefone.setFont(new Font("Arial", Font.BOLD, 14));
			
			JTextField digitarTelefone = new JTextField(11);
			digitarTelefone.setBounds(bordaX + 150, bordaY + 300, 180, 20);
			
			janela.add(telefone);
			janela.add(digitarTelefone);
			
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
			JLabel sexo = new JLabel ("Sexo:"); //rótulo só com texto
			sexo.setBounds(bordaX, bordaY + 222, 160, 20);
			sexo.setFont(new Font("Arial", Font.BOLD, 14));
			String[] sexosStrings = {"Masculino", "Feminino", "Outro"}; //opções de sexo
			JComboBox<Object> caixaSelecionarSexo = new JComboBox<Object>(sexosStrings);
			caixaSelecionarSexo.setBounds(bordaX + 150, bordaY + 222, 180, 20);
			
			janela.add(sexo);
			janela.add(caixaSelecionarSexo);
		}
	}