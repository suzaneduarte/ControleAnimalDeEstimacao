package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import enumerate.Especie;
import modelo.AnimalDeEstimacao;
import modelo.Dados;
import modelo.Usuario;
import modelo.Vacina;
import view.TelaCadastroAnimal.TelaCadAnimal;
import view.TelaLogin.PrimeiraTela;
import view.TelaPrincipal.MeusPets;
import view.TelaVacinas.TelaCadVacina;

public class ControleDetalhesDoPet {
	private JFrame janela;
	private Dados dados;
	private AnimalDeEstimacao animal;
	
	public ControleDetalhesDoPet (JFrame janela, Dados dados, AnimalDeEstimacao animal) {
		this.janela = janela;
		this.dados = dados;
		this.animal = animal;
	}

	public String[] BuscarVacinas() {
		List<Vacina> vacinas = dados.getVacinas();
		List<String> nomeVacinas = new ArrayList<String>();
		nomeVacinas.add("Adicionar uma nova vacina");
		
		for(Vacina vacina : vacinas) {
			nomeVacinas.add(vacina.getNomeDaVacina());
		}
		
		return nomeVacinas.toArray(new String[0]);
	}

	public void adicionarVacina(int selectedIndex) {
		if(selectedIndex == 0) {
			new TelaCadVacina(dados, animal);
			janela.dispose();
		} else {
			List<Vacina> vacinas = dados.getVacinas();
			Vacina vacina = vacinas.get(selectedIndex - 1);
			animal.AddVacina(vacina);
		}
	}

	public void removeVacina(int selectedRow) {
		List<Vacina> vacinas = animal.getVacinas();
		Vacina vacina = vacinas.get(selectedRow);
		
		
		animal.DeleteVacina(vacina);
	}

	public void editarVacina(int selectedRow) {
		List<Vacina> vacinas = animal.getVacinas();
		Vacina vacina = vacinas.get(selectedRow);
		
		new TelaCadVacina(dados, animal, vacina);
		janela.dispose();
	}

	public void editarAnimal() {
		new TelaCadAnimal(dados, animal);
		janela.dispose();
	}

	public void deletarAnimal() {
		Usuario usuario = this.dados.getUsuarioConectado();
		usuario.DeleteAnimal(animal);
		
		voltar();
	}

	public void voltar() {
		new MeusPets(dados);
		janela.dispose();
	}
	
}
