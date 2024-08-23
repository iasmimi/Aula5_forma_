package Principal;
import java.util.Scanner;
import Entidade.Classe_base_forma;
import Entidade.Retangulo;
import Entidade.Triangulo;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Escolha uma opçaõ:");
		int opcao = scn.nextInt(); 
		if (opcao == 1) {
			System.out.println("Digite a base:");
			double base = scn.nextDouble();
			System.out.println("Digite a altura:");
			double altura = scn.nextDouble();
			Triangulo t = new Triangulo (base, 0, altura);
			Classe_base_forma a = new Classe_base_forma(base, altura, 0);
			System.out.println("Area:" +  t.calcularArea(altura, base) + " Info: " + a.mostrarInfo());	
		}
		if (opcao == 2) {
			System.out.println("Digite a altura:");
			double altura = scn.nextDouble();
			System.out.println("Digite a largura:");
			double largura = scn.nextDouble();
			Retangulo r = new Retangulo (largura, altura);
			Classe_base_forma a = new Classe_base_forma(0, largura, altura);
			System.out.println("Area:" +  r.calcularArea(largura, altura) + " Info: " + a.mostrarInfo2());
			
			
		}
		
    }
		
		
    }
		


