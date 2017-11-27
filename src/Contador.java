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

}
