package fr.afpa.formation.mecanique.persistence.entity.statutOR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class StatutValidationClient extends Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private static StatutValidationClient validClient = null;
	
	private StatutValidationClient() {
		// TODO Auto-generated constructor stub
	}
	
	public StatutValidationClient getInstance() {
		if(validClient == null) {
			validClient = new StatutValidationClient();
		}
		return validClient;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Attente paiement client";
	}

}
