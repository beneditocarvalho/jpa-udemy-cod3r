package teste.basico;

import java.util.List;

import infra.UsuarioDAO;
import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> usuarios = dao.obterTodos();
		
		for(Usuario u: usuarios) {
			System.out.println("ID " + u.getId() + " - " + u.getNome() );
		}
		
		dao.fechar();
	}

}
 