package fr.afpa.formation.mecanique.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import fr.afpa.formation.mecanique.persistence.or.DevisItem;

public interface DevisItemRepository extends CrudRepository<DevisItem, Long> {

}
