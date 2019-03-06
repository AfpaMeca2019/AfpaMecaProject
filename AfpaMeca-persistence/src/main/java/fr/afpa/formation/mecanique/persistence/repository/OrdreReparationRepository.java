package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.or.OrdreReparation;

public interface OrdreReparationRepository extends CrudRepository<OrdreReparation, Long> {

}
