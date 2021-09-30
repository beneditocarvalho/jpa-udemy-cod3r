package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento {

	public static void main(String[] args) {
		
		Assento assento = new Assento("07B");
		Cliente cliente = new Cliente("Michele", assento);
		
		DAO<Object> dao = new DAO<>();
					
		dao.abrirT();
		dao.incluir(assento);
		dao.incluir(cliente);
		dao.fecharT();
		dao.fechar();
		
	}

}
