package teste.basico;

import infra.UsuarioDAO;
import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario novoUsuario = new Usuario("Steve Ballmer", "s.ballmer@gmail.com");
		
		dao.incluirAtomico(novoUsuario);
		
		
	}

}
