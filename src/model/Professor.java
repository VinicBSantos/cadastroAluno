package model;

public class Professor extends Funcionarios{

	private String materia;
	
	
				public Professor(String nome, String cpf, double salario, String materia) {
		this.materia = materia;
	}

				public Professor() {
					System.out.println("professor criado");
				}
		
				public String getMateria() {
					return materia;
				}

				public void setMateria(String materia) {
					this.materia = materia;
				}

				public void exibe() {
					super.exibe();
					System.out.println("materia do Professor:\n"+materia);
				}
}
