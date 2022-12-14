

import java.text.ParseException;
import java.text.SimpleDateFormat;

import enumerate.Especie;
import enumerate.Sexo;
import modelo.AnimalDeEstimacao;
import modelo.Raca;
import modelo.Usuario;

public class Teste {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat diaMesAno = new SimpleDateFormat("dd/MM/yyyy");
		
		Usuario usuario = new Usuario("jose_duarte@gmail.com", "04658596874", "61985348755", "Jose Duarte", diaMesAno.parse("01/03/1976"), Sexo.MASCULINO);
        Raca raca = new Raca("Pastor Alemao", "Ondulado", true, 12.0, "Calmo");
        AnimalDeEstimacao animalDeEstimacao = new AnimalDeEstimacao(Especie.CANINO, raca, "Juca", diaMesAno.parse("10/08/2021"), Sexo.MASCULINO);

        System.out.println(usuario);
		System.out.println(animalDeEstimacao);

	}

}