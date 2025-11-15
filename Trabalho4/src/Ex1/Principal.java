package Ex1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
		
		Gerente gerente1 = new Gerente("Roberto", 1, 2500);
		Assistente assist1 = new Assistente("Valtemir", 200, 600);
		Vendedor vend1 = new Vendedor("Rosecleide", 1000, 3000, 500);
		
		listaFuncionarios.add(gerente1);
		listaFuncionarios.add(assist1);
		listaFuncionarios.add(vend1);
		
		for(Funcionario f : listaFuncionarios) {
			System.out.println("Nome: " + f.getNome() +
							   "\nSalário base: " + f.getSalarioBase() +
							   "\nSalário final: " + f.calculaSalario() + 
							   "\n");
		}
	}
}
