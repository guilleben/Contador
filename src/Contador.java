import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Contador {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testVerValorDelContadorPorDefecto(){
		ContadorCircular cc = new ContadorCircular();
		
		assertEquals(0, cc.getValor());
	}
	
	@Test
	public void testVerValorDelContadorConValorInicial5(){
		ContadorCircular cc = new ContadorCircular(5);
		
		assertEquals(5, cc.getValor());
	}
	
	@Test
	public void testIncrementarContadorPorDefecto() {
		ContadorCircular cc = new ContadorCircular();
		
		cc.incrementa();
		assertEquals(1, cc.getValor());
	}
	
	@Test
	public void testIncrementarContadorDe5A10(){
		ContadorCircular cc = new ContadorCircular(5, 5);
		
		cc.incrementa();
		assertEquals(10, cc.getValor());
	}
}

   