package modelo;

import java.util.*;

import enumerate.Sexo;
import enumerate.Especie;
import enumerate.Intervalo;


public class Dados {
	private List<Vacina> vacinas = new ArrayList<Vacina>();
	private List<AnimalDeEstimacao> animais = new ArrayList<AnimalDeEstimacao>();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private Usuario usuarioConectado;
	
	public Dados() {
		cadastrosProntos();
	}
	
	public void cadastrosProntos() {
		// Usuario 1
		Usuario usuario0 = new Usuario("felipeosorio@gmail.com", "052.859.111-22", "617777-8888", "Felipe Osório de Oliveira", "07/02/1996", Sexo.MASCULINO, "123456");
		Raca raca0 = new Raca ("Vira Lata", "Pelo enrolado", true, 15.50, "Extrovertido");
		Vacina vacina0 = new Vacina("V12", "14/01/2023", "01", "Farmaceutica Canina", true, 10, Intervalo.ANO);
		AnimalDeEstimacao animal0 = new AnimalDeEstimacao(Especie.CANINO, raca0, "Juca", "10/08/2021", Sexo.MASCULINO);			
		
		
		//Adicionando no Usuario 1
		animal0.AddVacina(vacina0);
		usuario0.AddAnimal(animal0);
		usuarios.add(usuario0);
		animais.add(animal0);
		vacinas.add(vacina0);
		
		
		// Usuario 2
		Usuario usuario1 = new Usuario("ssuzane9@hotmail.com", "000.859.111-22", "617777-5555", "Suzane Alves Duarte", "09/02/2000", Sexo.FEMININO, "123456");
		AnimalDeEstimacao animal1 = new AnimalDeEstimacao(Especie.CANINO, raca0, "Zeca", "10/06/2022", Sexo.MASCULINO);			
		
		//Adicionando no Usuario 2 -> mesma vacina e raca
		animal1.AddVacina(vacina0);
		usuario1.AddAnimal(animal1);
		usuario1.AddAnimal(animal0);
		usuarios.add(usuario1);
		animais.add(animal1);	
		usuarioConectado = usuario1;
	}
	
	public void setUsuarioConectado(Usuario usuario) {
		usuarioConectado = usuario;
	}
	
	public Usuario getUsuarioConectado() {
		return usuarioConectado;
	}
	
	public List<AnimalDeEstimacao> getAnimaisDeUsuario() {
		return usuarioConectado.getAnimaisDeEstimacao();
	}
	
	public Usuario procuraUsuario(String email, String senha) {
		Usuario usuarioEncontrado = null;
		for(Usuario usuario : usuarios) {
			if (email.compareTo(usuario.getEmail()) == 0 && senha.compareTo(usuario.getSenha()) == 0) {
				usuarioEncontrado = usuario;
				break;
			}
		}
		
		return usuarioEncontrado;
	}
}

