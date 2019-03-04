package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.entity.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

}
