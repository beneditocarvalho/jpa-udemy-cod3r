package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;

public class RemoverAssento {

	public static void main(String[] args) {
		
		DAO<Assento> dao = new DAO<>(Assento.class);
		
		Assento assento = dao.obrterPorId(4L);
		
		dao.abrirT();
		dao.removerRegistro(4L);
		dao.fecharT();
		System.out.println(assento.getCliente().getNome());
		dao.fechar();
		

	}

}
