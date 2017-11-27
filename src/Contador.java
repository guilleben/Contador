import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Contador {
	
	ContadorCircular ccPorDefecto;
	ContadorCircular ccCincoEnCinco;

	@Before
	public void setUp() throws Exception {
		ccPorDefecto = new ContadorCircular(1);
		ccCincoEnCinco = new ContadorCircular(5, 5); 
		
	}
	
	@Test
	public void testLimiteNoSuperadoContadorPorDefecto(){
		boolean b = this.ccPorDefecto.incrementa();
		assertFalse(b); 
	}

	@Test
	public void testVerValorDelContadorPorDefecto(){
		assertEquals(0, ccPorDefecto.getValor());
	}
	
	@Test
	public void testVerValorDelContadorConValorInicial5(){
		assertEquals(5, ccCincoEnCinco.getValor());
	}
	
	@Test
	public void testIncrementarContadorPorDefecto() {
		ccPorDefecto.incrementa();
		assertEquals(1, ccPorDefecto.getValor());
	}
	
	@Test
	public void testIncrementarContadorDe5A10(){
		ccCincoEnCinco.incrementa();
		assertEquals(10, ccCincoEnCinco.getValor());
	}
}

   