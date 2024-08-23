package Entidade;

public class Retangulo extends Forma {
	
	public Retangulo(double base, double altura) {
		super(base, 0, altura);
		
	}


	public double calcularArea(double base, double Altura) {
		return (base * Altura);
	}
	
	}

