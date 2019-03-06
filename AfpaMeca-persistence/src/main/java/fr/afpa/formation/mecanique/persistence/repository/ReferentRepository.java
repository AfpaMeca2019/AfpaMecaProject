package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.utilisateur.Referent;

public interface ReferentRepository extends CrudRepository<Referent, Long> {

}
