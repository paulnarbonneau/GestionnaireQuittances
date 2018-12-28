/**
 * 
 */
package org.narbonneau.gestion.quittance.service;

import java.util.List;

import org.narbonneau.gestion.quittance.dao.PersonneDao;
import org.narbonneau.gestion.quittance.modele.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author x738235
 *
 */
@Service
public class PersonneService {
	
	@Autowired
	private PersonneDao personneDao;
	
	
	public List<Personne> getAllPersonne()
	{
		return personneDao.getAllPersonne();
	}
	

	public PersonneDao getPersonneDao() {
		return personneDao;
	}

	public void setPersonneDao(PersonneDao personneDao) {
		this.personneDao = personneDao;
	}


	public Personne getPersonneById(int idPersonne) {
		return personneDao.getPersonneById(idPersonne);
	}


	public int savePersonne(Personne personne) {
		
		Personne l = personneDao.savePersonne(personne);
		
		return l.getId();
	}

  public int deletePersonneById(int idPersonne) {
    return personneDao.deletePersonneById(idPersonne);
  }

}
