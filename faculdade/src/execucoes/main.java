package execucoes;
import pessoal.empregados;
import pessoal.professores;
import pessoal.relatorio;

public class main {
	public static void main(String[] args) {
		empregados e1 = new empregados("Danilo",1000);
		professores p1 = new professores("Lilica", 1000, 230);
		relatorio faz = new relatorio();
		faz.getRelatorio();
//		e1.getInfo();
//		p1.getInfo();
	}
}
