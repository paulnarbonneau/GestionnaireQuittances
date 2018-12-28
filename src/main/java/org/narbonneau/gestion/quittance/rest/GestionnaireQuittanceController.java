package org.narbonneau.gestion.quittance.rest;

import java.util.List;

import org.narbonneau.gestion.quittance.modele.Appartement;
import org.narbonneau.gestion.quittance.modele.Personne;
import org.narbonneau.gestion.quittance.service.AppartementService;
import org.narbonneau.gestion.quittance.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestionnaireQuittances/v1")
@CrossOrigin
public class GestionnaireQuittanceController {
	
	@Autowired
	private PersonneService personneService;

	@Autowired
  private AppartementService appartementService;
	
	
	@GetMapping(value = "/personnes")
	public List<Personne> getAllPersonne()
	{
		return personneService.getAllPersonne();
	}
	
	@GetMapping(value = "/personne/{id}")
	public Personne getPersonneById(@PathVariable int id)
	{
		return personneService.getPersonneById(id);
	}
	
	@PostMapping(value="/personne")
	public int savePersonne(@RequestBody Personne personne)
	{
		return personneService.savePersonne(personne);
	}

	@DeleteMapping(value="/personne/{id}")
  public int deletePersonneById(@PathVariable int id)
  {
    return personneService.deletePersonneById(id);
  }


  @GetMapping(value = "/appartements")
  public List<Appartement> getAllAppartement()
  {
    return appartementService.getAllAppartement();
  }

  @GetMapping(value = "/appartement/{id}")
  public Appartement getAppartementById(@PathVariable int id)
  {
    return appartementService.getAppartementById(id);
  }

  @PostMapping(value="/appartement")
  public int saveAppartement(@RequestBody Appartement appartement)
  {
    return appartementService.saveAppartement(appartement);
  }

  @DeleteMapping(value="/appartement/{id}")
  public int deleteAppartementById(@PathVariable int id)
  {
    return appartementService.deleteAppartementById(id);
  }

}
