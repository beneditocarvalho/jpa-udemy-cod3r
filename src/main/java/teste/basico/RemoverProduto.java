package teste.basico;

import infra.ProdutoDAO;

public class RemoverProduto {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.abrirT();		
		dao.removerRegistro(8L);
		dao.fecharT();
		dao.fechar();
	}

}
