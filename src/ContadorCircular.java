
public class ContadorCircular {
	
	int valor;
	int incremento;
	
	
	
	public ContadorCircular (int i) {
		this.valor = i;
		this.incremento = 1;
	}
	
	public ContadorCircular() {
		this(0);
	}
	
	public ContadorCircular(int i, int j){
		this(i);
		this.incremento = j;
	}

	public Object getValor() {
		
		return this.valor;
	}

	public void incrementa() {
		this.valor+=this.incremento;
		
	}

}
