package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.entity.Personne;

public interface PersonneRepository extends CrudRepository<Personne, Long> {

}
