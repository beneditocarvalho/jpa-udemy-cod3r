package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("PS5", 2499.00);
		Pedido pedido = new Pedido();
		ItemPedido itemPedido = new ItemPedido(1, pedido, produto);
		
		dao.abrirT()
		.incluir(produto)
		.incluir(pedido)
		.incluir(itemPedido)
		.fecharT()
		.fechar();
		
	}

}
