package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Cliente;

public class RemoverCliente {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		
		dao.abrirT();
		dao.removerRegistro(3L);
		dao.fecharT();
		dao.fechar();
		
		

	}

}
