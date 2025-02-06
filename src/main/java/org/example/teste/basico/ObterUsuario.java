package org.example.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Usuario;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 1L);
        System.out.println(usuario.getNome());

        em.close();
        emf.close();

    }

}
