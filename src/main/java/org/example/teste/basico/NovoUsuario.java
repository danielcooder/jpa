package org.example.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

                EntityManagerFactory emf = Persistence
                        .createEntityManagerFactory("jpa");
                EntityManager em = emf.createEntityManager();

                Usuario novoUsuario = new Usuario("Dani", "dan@lanche.com.br");

                em.getTransaction().begin();
                em.persist(novoUsuario);
                em.getTransaction().commit();

                System.out.println("O Id gerado foi: " + novoUsuario.getId());


        em.close();
                emf.close();
            }
        }
