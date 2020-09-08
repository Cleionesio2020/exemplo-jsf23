package br.com.sis.beans.dao;

import br.com.sis.modell.ClienteModell;
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.Query;
 
 
public class ClienteDAO extends DAO {
 
	public void salvar(ClienteModell cliente){
		//obtendo o EntityManager
		EntityManager em = DAO.getEntityManager();
		try{
			//inicia o processo de transacao
			em.getTransaction().begin();
			//faz a persistencia
			em.persist(cliente);
			//manda bala para o BD
			em.getTransaction().commit();
		}catch (Exception e) {
			//se der algo de errado vem parar aqui, onde eh cancelado
			em.getTransaction().rollback();
		}finally{
                    em.close();
                }
	}
 
	public List exibir(){
		EntityManager em = getEntityManager();
		try{
			Query q = em.createQuery("select object(c) from Cliente as c");
 
		return q.getResultList();}
		finally{
			em.close();
		}
	}
}