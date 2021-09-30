package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();

		Produto produto = new Produto("Caneta", 3.75);
				
		dao.incluirAtomico(produto).fechar();
		
		

	}

}
