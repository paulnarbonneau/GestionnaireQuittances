package org.narbonneau.gestion.quittance.service;

import org.narbonneau.gestion.quittance.dao.AppartementDao;
import org.narbonneau.gestion.quittance.modele.Appartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppartementService {

  @Autowired
  private AppartementDao appartementDao;


  public List<Appartement> getAllAppartement()
  {
    return appartementDao.getAllAppartement();
  }


  public AppartementDao getAppartementDao() {
    return appartementDao;
  }

  public void setAppartementDao(AppartementDao appartementDao) {
    this.appartementDao = appartementDao;
  }


  public Appartement getAppartementById(int idAppartement) {
    return appartementDao.getAppartementById(idAppartement);
  }


  public int saveAppartement(Appartement personne) {

    Appartement l = appartementDao.saveAppartement(personne);

    return l.getId();
  }

  public int deleteAppartementById(int idAppartement) {
    return appartementDao.deleteAppartementById(idAppartement);
  }

}
