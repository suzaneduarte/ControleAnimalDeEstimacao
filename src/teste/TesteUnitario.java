package teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import controle.ControleCadastro;

/**
 * Classe de testes unitarios
 * @author Gabriel Evaristo e Suzane Alves
 * @since 2023
 * @version 1.0
 */

public class TesteUnitario {

		@Test
		
		void testeCpf() {
			String valorCPFErrado = "123.456.789-00";
			String valorCPFCorreto = "12345678900";
			ControleCadastro c = new ControleCadastro(); 
			assertTrue(c.testeCpf(valorCPFCorreto));
			assertFalse(c.testeCpf(valorCPFErrado));	
		}
		
		@Test
				
		void testeTelefone() {
			String valorTelErrado = "(61) 9 9999-9999";
			String valorTelCorreto = "61999999999";
			ControleCadastro c = new ControleCadastro(); 
			assertTrue(c.testeTelefone(valorTelCorreto));
			assertFalse(c.testeTelefone(valorTelErrado));
		}
		
		@Test
				
		void testeNome () {
			String nomeNomeErrado = "ABC999";
			String nomeNomeCorreto = "ABCDEFG";
			ControleCadastro c = new ControleCadastro(); 
			assertTrue(c.testeNome(nomeNomeCorreto, nomeNomeCorreto));		
			assertFalse(c.testeNome(nomeNomeErrado, nomeNomeCorreto));		
		}
		
}

