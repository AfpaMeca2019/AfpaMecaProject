package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.or.Stagiaire;

public interface StagiaireRepository extends CrudRepository<Stagiaire, Long> {

}
