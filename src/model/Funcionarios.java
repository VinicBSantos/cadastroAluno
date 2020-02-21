package model;

public class Funcionarios {

	private String nome;
	private String cpf;
	private double salario;

	public void Funscionarios(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public Funcionarios() {
		System.out.println("funcionario criado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void exibe() {
		System.out.println("nome do funcionario:\n"+nome+"\ncpf do funcionario:\n"+cpf+"\nsalario:\n"+salario);
	}

}
