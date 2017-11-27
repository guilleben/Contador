
public class ContadorCircular {
	
	int valor;
	int incremento;
	int limite;
	
	
	
	public ContadorCircular (int valor, int incremento) {
		this.valor = valor;
		this.incremento = incremento;
	}
	
	public ContadorCircular() {
		this(0, 1);
	}
	
	public ContadorCircular(int limite){
		this(0, 1);
		this.limite = limite;
	}


	public Object getValor() {
		
		return this.valor;
	}

	public boolean incrementa() {
		this.valor+=this.incremento;
		return this.valor > this.limite;
		
	}

}
