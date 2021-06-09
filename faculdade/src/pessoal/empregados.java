package pessoal;

public class empregados {
	private String nome;
	private double salario;
	public static int numFuncionarios;
	public static double gastosFacul;
	// Constutores de empregados
	public empregados() {
		numFuncionarios++;
		gastosFacul = gastosFacul + this.getGastos();
	}
	public empregados(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		gastosFacul = gastosFacul + this.getGastos();
	}
	// get / set de Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	// get / set de Salario
	public double getSalario() {
		return salario;
	}
	public double getGastos() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// Informações do funcionario
	public void getInfo() {
		System.out.println(
				"Nome: " + this.getNome() + 
				"\nSalario: " + this.getSalario() + "\n"
				);
	}
	
}
