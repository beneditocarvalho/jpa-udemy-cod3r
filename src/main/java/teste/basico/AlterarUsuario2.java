package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 10L);
		
		usuario.setNome("Steve Wozzniack");
		usuario.setEmail("wozzniack@gmail.com");
		
//		em.detach(usuario); // retira o objeto do estado gerenciável
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		

	}

}
