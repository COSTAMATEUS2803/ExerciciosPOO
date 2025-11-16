package Ex2;

public class Principal {

	public static void main(String[] args) {
		
		//variáveis para teste
		double precoDolar = 6.00;
		double precoEuro = 6.50;
		double qtdDolar = 100;
		double qtdEuro = 200;
		
		double totalDolar = ConversorMonetario.ComprarDolar(qtdDolar, precoDolar);
		System.out.println("Valor total em dólar: " + totalDolar);
		
		double totalEuro = ConversorMonetario.ComprarEuro(qtdEuro, precoEuro);
		System.out.println("Valor total em euro: " + totalEuro);
	}

}
