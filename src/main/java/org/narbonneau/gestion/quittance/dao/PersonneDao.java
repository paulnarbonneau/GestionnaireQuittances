/**
 * 
 */
package org.narbonneau.gestion.quittance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.narbonneau.gestion.quittance.modele.Personne;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author x738235
 *
 */
@Repository
public class PersonneDao {
	
	@PersistenceContext
	private EntityManager em;
	

	public List<Personne> getAllPersonne() {
		TypedQuery<Personne> q = em.createQuery("from Personne",Personne.class);
		return q.getResultList();
	}


	public Personne getPersonneById(int idPersonne) {
		TypedQuery<Personne> q = em.createQuery("from Personne where id = :id",Personne.class);
		q.setParameter("id", idPersonne);
		return q.getSingleResult();
	}


	@Transactional(propagation=Propagation.REQUIRED, readOnly=false, rollbackFor=Exception.class)
	public Personne savePersonne(Personne locataire) {
		
		
		em.persist(locataire);
		em.flush();
		
		return locataire;
	}

	@Transactional(propagation = Propagation.REQUIRED,readOnly = false,rollbackFor = Exception.class)
  public int deletePersonneById(int id)
  {
    Query q = em.createQuery("delete from Personne where id = :id");
    q.setParameter("id",id);
    return q.executeUpdate();
  }

}
