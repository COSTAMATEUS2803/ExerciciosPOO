package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<FormaGeometrica> formas = new ArrayList<>();
		formas.add(new Retangulo(5,10));
		formas.add(new Quadrado(2));
		
		for(FormaGeometrica forma : formas) {
			
			double area = forma.calcularArea();
			double perimetro = forma.calcularPerimetro();
			
			if(forma instanceof Retangulo) {
				Retangulo r = (Retangulo) forma;
				System.out.println("\nLargura: " + r.getLargura() + "\nAltura: " + r.getAltura() + "\nÁrea: " + area + "\nPerímetro: " + perimetro);
			}
			
			if(forma instanceof Quadrado) {
				Quadrado q = (Quadrado) forma;
				System.out.println("\nLado: " + q.getLado() + "\nÁrea: " + area + "\nPerímetro: " + perimetro);
			}
		}
	}
}
