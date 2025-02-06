package org.example.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Usuario;

public class RemoverUsuario {

    public static void main(String[] args) {

                EntityManagerFactory emf = Persistence
                        .createEntityManagerFactory("jpa");
                EntityManager em = emf.createEntityManager();

                Usuario usuario = em.find(Usuario.class, 2L);

                if(usuario != null) {
                    em.getTransaction().begin();
                    em.remove(usuario);
                    em.getTransaction().commit();
                }

                em.close();
                emf.close();
            }
        }