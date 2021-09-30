package teste.basico;

import infra.UsuarioDAO;

public class RemoverUsuario {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		
		dao.abrirT();
		dao.removerRegistro(12L);
		dao.fecharT();
		dao.fechar();
	}
	
	
}
