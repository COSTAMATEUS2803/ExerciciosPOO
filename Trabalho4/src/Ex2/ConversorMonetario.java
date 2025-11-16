package Ex2;

public class ConversorMonetario {

	private static final double IOF = 0.06;
	private static double taxaDolar;
	private static double taxaEuro;
	
	private ConversorMonetario(){
		
	}
	
	public static double Converter(double valor, double taxa) {
		double conversao = valor * taxa;
		double conversaofinal = conversao * IOF;
		return conversao + conversaofinal;
	}
	
	public static double ComprarDolar(double quantidade, double precoDolar) {
		ConversorMonetario.setTaxaDolar(precoDolar);
		return Converter(quantidade, precoDolar);
		
	}
	
	public static double ComprarEuro(double quantidade, double precoEuro) {
		ConversorMonetario.setTaxaEuro(precoEuro);
		return Converter(quantidade, precoEuro);
	}

	public static double getTaxaEuro() {
		return taxaEuro;
	}

	public static void setTaxaEuro(double taxaEuro) {
		ConversorMonetario.taxaEuro = taxaEuro;
	}

	public static double getTaxaDolar() {
		return taxaDolar;
	}

	public static void setTaxaDolar(double taxaDolar) {
		ConversorMonetario.taxaDolar = taxaDolar;
	}
}
