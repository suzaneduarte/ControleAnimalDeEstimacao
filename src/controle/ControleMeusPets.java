package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import modelo.*;
import view.TelaCadastro.TelaCadastro;
import view.TelaCadastroAnimal.TelaCadAnimal;
import view.TelaLogin.PrimeiraTela;
import view.TelaPrincipal.MeusPets;
import view.TelaVacinas.TelaCadVacina;

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
	
	public String[] GerarListaDePets(String filtro) {
		List<AnimalDeEstimacao> animais = dados.getAnimaisDeUsuario();
		ArrayList<String> nomes = new ArrayList<String>();
		for(AnimalDeEstimacao animal : animais) {
			if(animal.getNome().toLowerCase().contains(filtro.toLowerCase())) {
				nomes.add(animal.getNome());				
			}
		}
		
		return nomes.toArray(new String[0]);
	}
	
	public void Vacinas() {
		new TelaCadVacina();
	    janela.dispose();
	}
	
	public void Sair() {
		new PrimeiraTela();
	    janela.dispose();
	}
}
