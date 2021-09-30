package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class AlterarProduto {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		Produto prod = dao.obrterPorId(4L);
		
//		
//		prod.setNome("Mesa Office");
//		prod.setPreco(2589.9);
//		
//		dao.incluirAtomico(prod);
		
		System.out.println(prod.getNome());
		
		dao.fechar();
		
		
	}

}
