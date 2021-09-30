package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Assento> dao = new DAO<>(Assento.class);
		
		Assento assento = dao.obrterPorId(4L);
				
		System.out.println(assento.getCliente().getNome());
		
		dao.fechar();

	}

}
