package Entidade;

public class Classe_base_forma {
	 private double base;
	    private double Largura;
	    private double Altura;
		public Classe_base_forma(double base, double largura, double altura) {
			this.base = base;
			Largura = largura;
			Altura = altura;
		}
		
		public double calcularAreaT() {
			return (base * Altura);
			
		}
		public double calcularArea() {
			return (Largura * Altura);
		}
		
		public String mostrarInfo() {
			return "Largura: " + Largura + ", Base: " + base;
		}
		public String mostrarInfo2() {
			return "Largura: " + Largura + ", Altura: " + Altura;
		}
}