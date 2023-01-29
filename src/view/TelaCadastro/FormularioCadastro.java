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

import enumerate.Sexo;

	public class FormularioCadastro implements ActionListener {
		JFrame janela;
		
		private int bordaX = 50;
		private int bordaY = 24;
		
		private JTextField caixaDeTextoEmail;
		private JTextField caixaDeTextoSenha;
		private JTextField caixaDeTextoConfirmarSenha;
		private JTextField digitarCpf;
		private JTextField digitarTelefone;
		private JTextField digitarDatanasc;
		private JComboBox<String> caixaSelecionarSexo;
		

		public FormularioCadastro(JFrame janela) {
			this.janela = janela;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public String getEmail() {
			return this.caixaDeTextoEmail.getText();
		}
		
		public String getSenha() {
			return this.caixaDeTextoSenha.getText();
		}
		
		public String getConfirmarSenha() {
			return this.caixaDeTextoConfirmarSenha.getText();
		}
		
		public String getCpf() {
			return this.digitarCpf.getText();
		}
		
		public String getTelefone() {
			return this.digitarTelefone.getText();
		}
		
		public String getDatanasc() {
			return this.digitarDatanasc.getText();
		}
		
		public Sexo getSexo() {
			String sexo = this.caixaSelecionarSexo.getSelectedItem().toString();
			return Sexo.valueOf(sexo);
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
			caixaDeTextoEmail = new JTextField(20); //cria campo de texto com largura de 10 colunas 
			caixaDeTextoEmail.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTextoEmail.setBounds(bordaX + 150, bordaY + 105, 180, 20);
			caixaDeTextoEmail.addActionListener(this);
			
			janela.add(caixaDeTextoEmail);
			janela.add(email);
		}
		
		private void construirCaixaDeTextoDeSenha(JFrame janela) {
			JLabel senha = new JLabel("Sua senha:"); //rótulo só com texto
			senha.setBounds(bordaX, bordaY + 144, 160, 20);
			senha.setFont(new Font("Arial", Font.BOLD, 14));
			caixaDeTextoSenha = new JPasswordField(30);
			caixaDeTextoSenha.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTextoSenha.setBounds(bordaX + 150, bordaY + 144, 180, 20);
			
			janela.add(caixaDeTextoSenha);
			janela.add(senha);
		}
		
		private void construirCaixaDeTextoDeConfirmarSenha(JFrame janela) {
			JLabel confirmarsenha = new JLabel("Confirme a senha:"); //rótulo só com texto
			confirmarsenha.setBounds(bordaX, bordaY + 183, 160, 20);
			confirmarsenha.setFont(new Font("Arial", Font.BOLD, 14));
			caixaDeTextoConfirmarSenha = new JPasswordField(30);
			caixaDeTextoConfirmarSenha.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTextoConfirmarSenha.setBounds(bordaX + 150, bordaY + 183, 180, 20);
			
			janela.add(caixaDeTextoConfirmarSenha);
			janela.add(confirmarsenha);
		}
		
		private void construirCaixaDoCpf (JFrame janela) {
			JLabel cpf = new JLabel ("CPF:"); //rótulo só com texto
			cpf.setBounds(bordaX, bordaY + 261, 160, 20);
			cpf.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarCpf = new JTextField(11);
			digitarCpf.setBounds(bordaX + 150, bordaY + 261, 180, 20);
			
			janela.add(cpf);
			janela.add(digitarCpf);
			
		}
		
		private void construirCaixaDoTelefone (JFrame janela) {
			JLabel telefone = new JLabel ("Telefone:"); //rótulo só com texto
			telefone.setBounds(bordaX, bordaY + 300, 160, 20);
			telefone.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarTelefone = new JTextField(11);
			digitarTelefone.setBounds(bordaX + 150, bordaY + 300, 180, 20);
			
			janela.add(telefone);
			janela.add(digitarTelefone);
			
		}
		
		private void construirCaixaDoDataNasc(JFrame janela) {
			JLabel datanasc = new JLabel ("Data Nascimento:"); //rótulo só com texto
			datanasc.setBounds(bordaX, bordaY + 339, 160, 20);
			datanasc.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarDatanasc = new JTextField(10);
			digitarDatanasc.setBounds(bordaX + 150, bordaY + 339, 180, 20);
			
			janela.add(datanasc);
			janela.add(digitarDatanasc);		
		}
		
		private void construirCaixaDeSexo (JFrame janela) {
			JLabel sexo = new JLabel ("Sexo:"); //rótulo só com texto
			sexo.setBounds(bordaX, bordaY + 222, 160, 20);
			sexo.setFont(new Font("Arial", Font.BOLD, 14));
			String[] sexosStrings = {"MASCULINO", "FEMININO", "OUTRO"}; //opções de sexo
			caixaSelecionarSexo = new JComboBox<String>(sexosStrings);
			caixaSelecionarSexo.setBounds(bordaX + 150, bordaY + 222, 180, 20);
			
			janela.add(sexo);
			janela.add(caixaSelecionarSexo);
		}
	}