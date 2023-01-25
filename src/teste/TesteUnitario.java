package teste;

import org.junit.jupiter.api.Test;

import controle.ControleCadastro;

public class TesteUnitario {

		@Test
		
		void testeCpf() {
			String valorCPFErrado = "123.456.789-00";
			String valorCPFCorreto = "12345678900";
			ControleCadastro c = new ControleCadastro(); 
			assertTrue(c.testeCpf(valorCPFCorreto));
			assertFalse(c.testeCpf(valorCPFErrado));	
		}
		
		void testeTelefone() {
			String valorTelErrado = "(61) 9 9999-9999";
			String valorTelCorreto = "61999999999";
			ControleCadastro c = new ControleCadastro(); 
			assertTrue(c.testeTelefone(valorTelCorreto));
			assertFalse(c.ControleCadastro.testeTelefone(valorTelErrado));
		}
		
		void testeEmail () {
			String valorEmailErrado = "gabrielgmailcom";
			String valorEmailCorreto = "gabriel@gmail.com";
			ControleCadastro c = new ControleCadastro(); 
			assertTrue(c.testeEmail(valorEmailCorreto));
			assertFalse(c.testeEmail(valorEmailErrado));		
		}
		
}
