package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.or.Vehicule;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

}
