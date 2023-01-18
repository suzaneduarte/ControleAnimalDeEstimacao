//package teste;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import controle.ControleCadastro;
//
//public class TesteUnitario {
//	
//		void testeCpf() {
//			
//			String valorCPFErrado = "123.456.789-00";
//			String valorCPFCorreto = "12345678900";
//			assertTrue(ControleCadastro.testeCpf(valorCPFCorreto));
//			assertFalse(ControleCadastro.testeCpf(valorCPFErrado));
//			
//		}
//		
//		
//		void testeTelefone() {
//			
//				String valorTelErrado = "(61) 9 9999-9999";
//				String valorTelCorreto = "61999999999";
//				assertTrue(ControleCadastro.testeTelefone(valorTelCorreto));
//				assertFalse(ControleCadastro.testeTelefone(valorTelErrado));
//				
//		}
//		
//		void testeEmail () {
//			
//				String valorEmailErrado = "gabrielgmailcom";
//				String valorEmailCorreto = "gabriel@gmail.com";
//				assertTrue(ControleCadastro.testeEmail(valorEmailCorreto));
//				assertFalse(ControleCadastro.testeEmail(valorEmailErrado));
//				
//		}
//		
//}
