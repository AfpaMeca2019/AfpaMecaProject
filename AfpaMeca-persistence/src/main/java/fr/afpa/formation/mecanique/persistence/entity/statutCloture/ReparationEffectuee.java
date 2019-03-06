package fr.afpa.formation.mecanique.persistence.statutCloture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import fr.afpa.formation.mecanique.persistence.statutOR.Statut_OR;

@Entity
public class ReparationEffectuee implements Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private static ReparationEffectuee re = null;
	
	private ReparationEffectuee() {}

	@Override
	public Statut_OR getInstance() {
		// TODO Auto-generated method stub
		if(re == null) re = new ReparationEffectuee();
		return re;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Réparation effectuée";
	}

}
