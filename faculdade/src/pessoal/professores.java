package pessoal;

public class professores extends empregados {
	private int horasDeAula;
	// Contrutores de professores
	public professores() {
		
	}
	public professores(String nome, double salario, int horas) {
		this.setNome(nome);
		this.setSalario(salario);
		this.horasDeAula = horas;
		gastosFacul = gastosFacul + this.getGastos();
	}
	// get / set horas de aula
	public int getHorasDeAula() {
		return horasDeAula;
	}
	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	// get para gastos com o funcionario e informações do mesmo 
	public double getGastos() {
		return this.getSalario() + (this.horasDeAula * 10);
	}
	public void getInfo() {
		System.out.println(
				"Nome: " + this.getNome() + 
				"\nSalario: " + this.getGastos() +
				"\nHoras de aula: " + this.getHorasDeAula() 
				);
	}
}
