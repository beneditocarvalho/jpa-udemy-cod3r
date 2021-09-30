package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("Star Wars Ep 4", 8.7);
		Filme filmeB = new Filme("O futurista", 8.9);
		
		Ator ator = new Ator("Benedito de Carvalho");
		Ator atriz = new Ator("Flávia Alessandra");
		
		filmeA.adicionarAtor(ator);
		filmeA.adicionarAtor(atriz);
		
		filmeB.adicionarAtor(ator);
		filmeB.adicionarAtor(atriz);
		
		DAO<Filme> dao = new DAO<>();
		
		dao.incluirAtomico(filmeB);
		
		
		
		
	}

}
