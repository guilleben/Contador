
public class ContadorCircular {
	
	int valor;
	int incremento;
	
	
	
	public ContadorCircular (int valor, int incremento) {
		this.valor = valor;
		this.incremento = incremento;
	}
	
	public ContadorCircular() {
		this(0, 1);
	}
	


	public Object getValor() {
		
		return this.valor;
	}

	public void incrementa() {
		this.valor+=this.incremento;
		
	}

}
