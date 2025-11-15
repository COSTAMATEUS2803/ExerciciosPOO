package Ex1;

public class Assistente extends Funcionario{

	public Assistente(String nome, int matricula, float salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public float calculaSalario() {
		return getSalarioBase();
	}

}
