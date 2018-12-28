package org.narbonneau.gestion.quittance.dao;

import org.narbonneau.gestion.quittance.modele.Appartement;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AppartementDao {


  @PersistenceContext
  private EntityManager em;


  public List<Appartement> getAllAppartement() {
    TypedQuery<Appartement> q = em.createQuery("from Appartement",Appartement.class);
    return q.getResultList();
  }


  public Appartement getAppartementById(int idAppartement) {
    TypedQuery<Appartement> q = em.createQuery("from Appartement where id = :id",Appartement.class);
    q.setParameter("id", idAppartement);
    return q.getSingleResult();
  }


  @Transactional(propagation= Propagation.REQUIRED, readOnly=false, rollbackFor=Exception.class)
  public Appartement saveAppartement(Appartement appartement) {


    em.persist(appartement);
    em.flush();

    return appartement;
  }

  @Transactional(propagation = Propagation.REQUIRED,readOnly = false,rollbackFor = Exception.class)
  public int deleteAppartementById(int id)
  {
    Query q = em.createQuery("delete from Appartement where id = :id");
    q.setParameter("id",id);
    return q.executeUpdate();
  }
}
