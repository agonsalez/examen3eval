package base;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testSolicitarPermiso() {
		Principal principal = new Principal();
		int numero1=20, numero2=90;
		boolean comprobar = principal.solicitarPermiso(numero1);
		boolean comprobar2 = principal.solicitarPermiso(numero2);
		assertTrue(comprobar); //,false
		assertTrue(comprobar2); //,true
		
	}

}
