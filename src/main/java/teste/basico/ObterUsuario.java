package teste.basico;

import infra.UsuarioDAO;
import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
	
		UsuarioDAO dao = new UsuarioDAO();
				
		Usuario usuario  = dao.obrterPorId(4L); 
		
		System.out.println(usuario.getNome());
		
		dao.fechar();
								
	}

}
