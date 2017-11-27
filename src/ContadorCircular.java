
public class ContadorCircular {
	
	int valor;
	int incremento;
	int limite;
	
	public ContadorCircular (int valor,  int incremento) {
		this.valor = valor;
		this.incremento = incremento;
		
	}
	
	public ContadorCircular (int valor, int incremento, int limite) {
		this.valor = valor;
		this.incremento = incremento;
		this.limite = limite; 
	}
	
	
	
	public ContadorCircular(int limite){
		this(0, 1, limite);
		
	}


	public Object getValor() {
		
		return this.valor;
	}

	public boolean incrementa() {
		this.valor+=this.incremento;
		return this.valor > this.limite;
		
	}

}
