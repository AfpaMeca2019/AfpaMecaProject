package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.cq.Niveau;

public interface NiveauRepository extends CrudRepository<Niveau, Long> {

}
