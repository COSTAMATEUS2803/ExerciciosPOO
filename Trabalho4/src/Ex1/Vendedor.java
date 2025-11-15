package Ex1;

public class Vendedor extends Funcionario {

	float comissao; 
	
	public Vendedor(String nome, int matricula, float salarioBase, float comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}

	@Override
	public float calculaSalario() {
		return comissao + getSalarioBase();
	}

}
