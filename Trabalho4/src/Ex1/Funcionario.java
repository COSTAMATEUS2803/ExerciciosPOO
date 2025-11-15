package Ex1;

public abstract class Funcionario {

	private String Nome;
	private int Matricula;
	private float SalarioBase;
	
	public Funcionario(String nome, int matricula, float salarioBase) {
		Nome = nome;
		Matricula = matricula;
		SalarioBase = salarioBase;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public float getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		SalarioBase = salarioBase;
	}

	public abstract float calculaSalario();
	
}
