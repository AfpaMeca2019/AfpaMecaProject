package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.cq.Pneumatique;

public interface PneumatiqueRepository extends CrudRepository<Pneumatique, Long> {

}
