package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import modelo.*;
import view.TelaCadastro.TelaCadastro;
import view.TelaCadastroAnimal.TelaCadAnimal;
import view.TelaPrincipal.MeusPets;

public class ControleMeusPets {
	private JFrame janela;
	private Dados dados;
	
	public ControleMeusPets (JFrame janela, Dados dados) {
		this.janela = janela;
		this.dados = dados;
	}	
	
	public void CadastrarPet() {
		new TelaCadAnimal();
	    janela.dispose();
	}
	
	public String[] GerarListaDePets() {
		List<AnimalDeEstimacao> animais = dados.getAnimaisDeUsuario();
		ArrayList<String> nomes = new ArrayList<String>();
		for(AnimalDeEstimacao animal : animais) {
			nomes.add(animal.getNome());
		}
		
		return nomes.toArray(new String[0]);
	}
}
