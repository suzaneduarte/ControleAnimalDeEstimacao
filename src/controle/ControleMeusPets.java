package controle;

import javax.swing.JFrame;

import view.TelaCadastro.TelaCadastro;
import view.TelaCadastroAnimal.TelaCadAnimal;
import view.TelaPrincipal.MeusPets;

public class ControleMeusPets {
	private JFrame janela;
	
	public ControleMeusPets (JFrame janela) {
		this.janela = janela;
	}	
	
	public void CadastrarPet() {
		new TelaCadAnimal();
	    janela.dispose();
	}
}
