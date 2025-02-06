package org.example.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.example.Usuario;

import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();


        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario: usuarios){
            System.out.println("ID" + usuario.getId() + "E-mail: " + usuario.getEmail());
        }

        em.close();
        emf.close();

    }

}
