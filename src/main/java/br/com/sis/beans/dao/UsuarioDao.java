package br.com.sis.beans.dao;

import br.com.sis.modell.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioDao extends DAO {

   
    public void salvar(Usuario usuario) {
        //obtendo o EntityManager
        EntityManager em = DAO.getEntityManager();
        try {
            //inicia o processo de transacao
            em.getTransaction().begin();
            //faz a persistencia
            em.persist(usuario);
            //manda bala para o BD
            em.getTransaction().commit();
        } catch (Exception e) {
            //se der algo de errado vem parar aqui, onde eh cancelado
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }

    public Usuario exibir(Usuario user) {
        EntityManager em = DAO.getEntityManager();
        try {
            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login  = :login AND u.senha = :senha",Usuario.class);
            query.setParameter("login", user.getLogin());
            query.setParameter("senha", user.getSenha());
            return (Usuario) query.getSingleResult();
        } finally {
            em.close();
        }
    }
    
}
