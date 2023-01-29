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

import controle.ControleCadastroPet;
import enumerate.Especie;
import enumerate.Intervalo;
import enumerate.Sexo;
import modelo.AnimalDeEstimacao;
import modelo.Raca;

	public class FormularioCadAnimal implements ActionListener {
		private JFrame janela;
		private ControleCadastroPet controle;
		
		private int bordaX = 50;
		private int bordaY = 24;
		private JTextField caixaDeTextoNome;
		private JTextField digitarRaça;
		private JTextField digitarPelagem;
		private JTextField digitarPeso;
		private JTextField digitarDatanasc;
		private JTextField digitarTemperamento;
		private JComboBox<Object> caixaSelecionarSexo;
		private JComboBox comboboxEspecie;
		private JComboBox<String> caixaSelecionarTamanhoDaPelagem;
		
		public FormularioCadAnimal(JFrame janela, ControleCadastroPet controle) {
			this.janela = janela;
			this.controle = controle;
		}
		
		//trata eventos de ação 
		public void actionPerformed(ActionEvent ae) {
			
		}
		
		public void construir() {
			construirCaixaDoNome(janela);
			construirCaixaDeSexo(janela);
			construirCaixaDaRaca(janela);
			construirCaixaDaPelagem(janela);
			construirCaixaDaEspecie(janela);
			construirCaixaDoDataNasc(janela);
			construirCaixaDoTamanhoDaPelagem(janela);
			construirCaixaDoTemperamento(janela);
			construirCaixaDoPeso(janela);
			
			if(controle.getAnimalSelecionado() != null) {
				preencherCampos(controle.getAnimalSelecionado());
			}
		}
		
		private void preencherCampos(AnimalDeEstimacao animal) {
			caixaDeTextoNome.setText(animal.getNome());
			digitarRaça.setText(animal.getRaca().getTipoDeRaca());
			digitarPelagem.setText(animal.getRaca().getPelagem());
			digitarPeso.setText(Double.toString(animal.getRaca().getPeso()));
			digitarDatanasc.setText(animal.getNascimento());
			digitarTemperamento.setText(animal.getRaca().getTemperamento());
			caixaSelecionarSexo.setSelectedItem(animal.getSexo());
			comboboxEspecie.setSelectedItem(animal.getEspecie());
			caixaSelecionarTamanhoDaPelagem.setSelectedIndex(animal.getRaca().isTamanhoDaPelagem() ? 0 : 1);
		}

		public String getNome() {
			return this.caixaDeTextoNome.getText();
		}
		
		public Sexo getSexo() {
			String sexo = this.caixaSelecionarSexo.getSelectedItem().toString();
			return Sexo.valueOf(sexo);
		}
		
		public Raca getRaca() {
			Raca raca = new Raca(
						this.digitarRaça.getText(),
						this.digitarPelagem.getText(),
						this.caixaSelecionarTamanhoDaPelagem.getSelectedIndex() == 0,
						Double.parseDouble(this.digitarPeso.getText()),
						this.digitarTemperamento.getText()
					);
			return raca;
		}
		
		public Especie getEspecie() {
			String especie = this.comboboxEspecie.getSelectedItem().toString();
			return Especie.valueOf(especie);
		}
		
		public String getDataNasc() {
			return this.digitarDatanasc.getText();
		}
		
		private void construirCaixaDoNome(JFrame janela) {
			JLabel nome = new JLabel("Nome:"); 
			nome.setBounds(bordaX, bordaY + 150, 170, 30);
			nome.setFont(new Font("Arial", Font.BOLD, 14));
			
			caixaDeTextoNome = new JTextField(20); 
			caixaDeTextoNome.setActionCommand("myTF");
			caixaDeTextoNome.setBounds(bordaX + 180, bordaY + 150, 180, 20);
			caixaDeTextoNome.addActionListener(this);
			
			janela.add(caixaDeTextoNome);
			janela.add(nome);
		}
		
		
		private void construirCaixaDeSexo (JFrame janela) {
			JLabel sexo = new JLabel ("Sexo:");
			sexo.setBounds(bordaX, bordaY + 186, 170, 20);
			sexo.setFont(new Font("Arial", Font.BOLD, 14));
			String[] sexosStrings = {"MASCULINO", "FEMININO", "OUTRO"}; //opções de sexo
			caixaSelecionarSexo = new JComboBox<Object>(sexosStrings);
			caixaSelecionarSexo.setBounds(bordaX + 180, bordaY + 186, 180, 20);
			
			janela.add(sexo);
			janela.add(caixaSelecionarSexo);
		}
		
		private void construirCaixaDaRaca(JFrame janela) {
			JLabel raça = new JLabel ("Tipo de raça:"); 
			raça.setBounds(bordaX, bordaY + 222, 170, 20);
			raça.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarRaça = new JTextField(11);
			digitarRaça.setBounds(bordaX + 180, bordaY + 222, 180, 20);
			
			janela.add(raça);
			janela.add(digitarRaça);
			
		}
		
		private void construirCaixaDaPelagem(JFrame janela) {
			JLabel pelagem = new JLabel ("Pelagem da raça:"); 
			pelagem.setBounds(bordaX, bordaY + 258, 170, 20);
			pelagem.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarPelagem = new JTextField(11);
			digitarPelagem.setBounds(bordaX + 180, bordaY + 258, 180, 20);
			
			janela.add(pelagem);
			janela.add(digitarPelagem);
		}
		
		private void construirCaixaDoTamanhoDaPelagem(JFrame janela) {
			JLabel pelagem = new JLabel ("Tamanho da pelagem:"); 
			pelagem.setBounds(bordaX, bordaY + 294, 180, 20);
			pelagem.setFont(new Font("Arial", Font.BOLD, 14));
			
			String[] tamanhosDaPelagem = {"Pelagem curta", "Pelagem média/longa"}; //opções de pelagem
			caixaSelecionarTamanhoDaPelagem = new JComboBox<String>(tamanhosDaPelagem);
			caixaSelecionarTamanhoDaPelagem.setBounds(bordaX + 180, bordaY + 294, 180, 20);
			
			janela.add(pelagem);
			janela.add(caixaSelecionarTamanhoDaPelagem);
		}
		
		private void construirCaixaDoPeso(JFrame janela) {
			JLabel peso = new JLabel ("Peso:"); 
			peso.setBounds(bordaX, bordaY + 330, 170, 20);
			peso.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarPeso = new JTextField(11);
			digitarPeso.setBounds(bordaX + 180, bordaY + 330, 180, 20);
			
			janela.add(peso);
			janela.add(digitarPeso);
		}
		
		private void construirCaixaDoTemperamento(JFrame janela) {
			JLabel temperamento = new JLabel ("Temperamento da raça:"); 
			temperamento.setBounds(bordaX, bordaY + 366, 170, 20);
			temperamento.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarTemperamento = new JTextField(11);
			digitarTemperamento.setBounds(bordaX + 180, bordaY + 366, 180, 20);
			
			janela.add(temperamento);
			janela.add(digitarTemperamento);
		}
		
		private void construirCaixaDaEspecie(JFrame janela) {
			JLabel especie = new JLabel ("Especie:");
			especie.setBounds(bordaX, bordaY + 402, 170, 20);
			especie.setFont(new Font("Arial", Font.BOLD, 14));
			
			String[] especiesStrings = {"CANINO", "FELINO", "AVE", "ROEDOR"}; //opções de sexo
			comboboxEspecie = new JComboBox(especiesStrings);
			comboboxEspecie.setBounds(bordaX + 180, bordaY + 402, 180, 20);
			comboboxEspecie.setOpaque(false);
			janela.add(comboboxEspecie);
			janela.add(especie);	
		}
		
		private void construirCaixaDoDataNasc(JFrame janela) {
			JLabel datanasc = new JLabel ("Data Nascimento:"); //rótulo só com texto
			datanasc.setBounds(bordaX, bordaY + 438, 170, 20);
			datanasc.setFont(new Font("Arial", Font.BOLD, 14));
			
			digitarDatanasc = new JTextField(10);
			digitarDatanasc.setBounds(bordaX + 180, bordaY + 438, 180, 20);
			
			janela.add(datanasc);
			janela.add(digitarDatanasc);		
		}
	}