package view.TelaCadastro;

	import java.awt.Color;
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
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import enumerate.Sexo;

/**
 *  Classe FormularioCadastro cria o formulario cadastro
 *  @author Gabriel Evaristo e Suzane Alves
 *  @since 2023
 *  @version 1.0
 */

	public class FormularioCadastro implements ActionListener {
		JFrame janela;
		
		private int bordaX = 50;
		private int bordaY = 24;
		
		private JTextField caixaDeTextoNome;
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
		
		public String getNome() {
			return this.caixaDeTextoNome.getText();
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
		
		/**
		 * constroi as caixas do formulario
		 */
		public void construir() {
			construirCaixaDeTextoNome(janela);
			construirCaixaDeTexto(janela);
			construirCaixaDeTextoDeSenha(janela);
			construirCaixaDeTextoDeConfirmarSenha(janela);
			construirCaixaDoCpf(janela);
			construirCaixaDoTelefone(janela);
			construirCaixaDoDataNasc(janela);	
			construirCaixaDeSexo(janela);
		}
		
		/**
		 * constroi a caixa de texto do nome
		 * @param janela
		 */
		
		private void construirCaixaDeTextoNome(JFrame janela) {
			JLabel nome = new JLabel("Nome:"); //rótulo só com texto
			nome.setBounds(bordaX, bordaY + 61, 160, 30);
			nome.setFont(new Font("Arial", Font.BOLD, 14));
			caixaDeTextoNome = new JTextField(20); //cria campo de texto com largura de 10 colunas 
			caixaDeTextoNome.setActionCommand("myTF"); //define os comandos de ação de campo do texto
			caixaDeTextoNome.setBounds(bordaX + 150, bordaY + 66, 180, 20);
			caixaDeTextoNome.addActionListener(this);
			
			janela.add(caixaDeTextoNome);
			janela.add(nome);
		}
		/**
		 * constroi a caixa de texto do emmail
		 * @param janela
		 */
		
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
		
		/**
		 * constroi a caixa de texto da senha
		 * @param janela
		 */
		
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
		
		/**
		 * constroi a caixa de texto da confirmação da senha
		 * @param janela
		 */
		
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
		
		/**
		 * constroi a caixa de cpf
		 * @param janela
		 */
		
		private void construirCaixaDoCpf (JFrame janela) {
			JLabel cpf = new JLabel ("CPF:"); //rótulo só com texto
			cpf.setBounds(bordaX, bordaY + 261, 160, 20);
			cpf.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarCpf = new JTextField(11);
			digitarCpf.setBounds(bordaX + 150, bordaY + 261, 180, 20);
			
			janela.add(cpf);
			janela.add(digitarCpf);
			
		}
		
		/**
		 * constroi a caixa do telefone
		 * @param janela
		 */
		
		private void construirCaixaDoTelefone (JFrame janela) {
			JLabel telefone = new JLabel ("Telefone:"); //rótulo só com texto
			telefone.setBounds(bordaX, bordaY + 300, 160, 20);
			telefone.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarTelefone = new JTextField(11);
			digitarTelefone.setBounds(bordaX + 150, bordaY + 300, 180, 20);
			
			janela.add(telefone);
			janela.add(digitarTelefone);
			
		}
		
		/**
		 * constroi a caixa da data de nascimento
		 * @param janela
		 */
		
		private void construirCaixaDoDataNasc(JFrame janela) {
			JLabel datanasc = new JLabel ("Data Nascimento:"); //rótulo só com texto
			datanasc.setBounds(bordaX, bordaY + 339, 160, 20);
			datanasc.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarDatanasc = new JTextField(10);
			digitarDatanasc.setBounds(bordaX + 150, bordaY + 339, 180, 20);
			
			janela.add(datanasc);
			janela.add(digitarDatanasc);		
		}
		
		/**
		 * constroi a caixa do sexo (3 opçoes)
		 * @param janela
		 */
		
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
		
		/**
		 * mostra erro caso digite senha errada
		 */

		public void mostrarErro() {
			caixaDeTextoSenha.setBorder(new LineBorder(Color.RED,2));
			caixaDeTextoConfirmarSenha.setBorder(new LineBorder(Color.RED,2));
		}
	}