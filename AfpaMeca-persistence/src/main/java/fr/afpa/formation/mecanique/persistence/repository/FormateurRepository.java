package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.utilisateur.Formateur;

public interface FormateurRepository extends CrudRepository<Formateur, Long> {

}
