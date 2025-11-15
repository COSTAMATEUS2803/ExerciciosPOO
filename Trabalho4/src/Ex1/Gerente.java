package Ex1;

public class Gerente extends Funcionario {

	public Gerente(String nome, int matricula, float salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public float calculaSalario() {
		float salario = 2 * getSalarioBase();
		return salario;
	}
}
