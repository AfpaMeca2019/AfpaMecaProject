package fr.afpa.formation.mecanique.persistence.statutCloture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import fr.afpa.formation.mecanique.persistence.statutOR.Statut_OR;

@Entity
public class RefusClient implements Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private static RefusClient rc = null;
	
	private RefusClient() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Statut_OR getInstance() {
		// TODO Auto-generated method stub
		if(rc == null) rc = new RefusClient();
		return rc;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Refus client";
	}

}
