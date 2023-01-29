package view.TelaDetalhesDoPet;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleDetalhesDoPet;
import enumerate.Especie;
import enumerate.Sexo;
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Raca;

public class DetalhesDoPet {

	private int bordaX = 24;
	private int bordaY = 24;
	
	private AnimalDeEstimacao animal;
	private Dados dados;
	private ControleDetalhesDoPet controle;
	private JFrame janela;
	
	public DetalhesDoPet(AnimalDeEstimacao animal, ControleDetalhesDoPet controle, JFrame janela) {
		this.animal = animal;
		this.controle = controle;
		this.janela = janela;
	}
	
	public void construir() {
//		Especie especie, Raca raca, String nome, String nascimento, Sexo sexo
		construirNome();
		construirSexo();
		construirNascimento();
		construirEspecie();
		construirRaca();
	}
	
	private void construirNome() {
		JLabel nome = new JLabel("Nome: " + animal.getNome()); //rótulo só com texto
		nome.setBounds(bordaX, bordaY, 160, 30);
		nome.setFont(new Font("Arial", Font.BOLD, 14));
		
		janela.add(nome);
	}
	
	private void construirSexo() {
		JLabel sexo = new JLabel("Sexo: " + animal.getSexo()); //rótulo só com texto
		sexo.setBounds(bordaX, bordaY + 46, 160, 30);
		sexo.setFont(new Font("Arial", Font.BOLD, 14));
		
		janela.add(sexo);
	}
	
	private void construirNascimento() {
		JLabel nascimento = new JLabel("Data de nascimento: " + animal.getNascimento()); //rótulo só com texto
		nascimento.setBounds(bordaX, bordaY + 92, 300, 30);
		nascimento.setFont(new Font("Arial", Font.BOLD, 14));
		
		janela.add(nascimento);
	}
	
	private void construirEspecie() {
		JLabel especie = new JLabel("Especie: " + animal.getEspecie()); //rótulo só com texto
		especie.setBounds(bordaX, bordaY + 138, 300, 30);
		especie.setFont(new Font("Arial", Font.BOLD, 14));
		
		janela.add(especie);
	}
	
	private void construirRaca() {
		JLabel raca = new JLabel("Raca: " + animal.getRaca().getTipoDeRaca()); //rótulo só com texto
		raca.setBounds(bordaX, bordaY + 188, 300, 30);
		raca.setFont(new Font("Arial", Font.BOLD, 14));
		
		janela.add(raca);
	}
	
}
