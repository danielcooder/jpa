package org.example.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Usuario;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 3L);
        usuario.setNome("Leonardo");
        usuario.setEmail("leo@lanches.com.br");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }

}
