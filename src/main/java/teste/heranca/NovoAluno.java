package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno = new Aluno(2308L, "Benedito");		
		AlunoBolsista aluno1 = new AlunoBolsista(12345L, "Obama", 1000.0);
		
		alunoDAO.incluirAtomico(aluno);
		alunoDAO.incluirAtomico(aluno1);
		
	}

}
