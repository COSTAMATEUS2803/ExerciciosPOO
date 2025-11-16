package Ex3;

public class Quadrado implements FormaGeometrica {

	double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (lado * lado);
	}

	@Override
	public double calcularPerimetro() {
		return (4 * lado);
	}
	
}
