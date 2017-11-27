
public class ContadorCircular {
	
	int valor;
	
	public ContadorCircular (int i) {
		this.valor = i;
	}
	
	public ContadorCircular() {
		this(0);
	}

	public Object getValor() {
		
		return this.valor;
	}

	public void incrementa() {
		this.valor++;
		
	}

}
