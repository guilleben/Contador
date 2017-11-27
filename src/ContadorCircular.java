
public class ContadorCircular {
	
	int valor;
	int incremento;
	int limite;
	int inicial;
	
	public ContadorCircular (int valor,  int incremento) {
		this.valor = valor;
		this.incremento = incremento;
		
	}
	
	public ContadorCircular (int valor, int incremento, int limite) {
		this.inicial = valor;
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
		boolean b = this.valor > this.limite;
		if (b) {
			this.resetea();
		}
		return b;
		
	}

	public void resetea() {
		this.valor = this.inicial; 
		
	}

}
