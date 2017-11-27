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

}

   