package fr.afpa.formation.mecanique.persistence.statutOR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class AttenteValidationFormateur implements Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	private static AttenteValidationFormateur attenteFor = null;
	
	private AttenteValidationFormateur() {
		// TODO Auto-generated constructor stub
	}
	
	public AttenteValidationFormateur getInstance() {
		if(attenteFor == null) {
			attenteFor = new AttenteValidationFormateur();
		}
		return attenteFor;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Attente validation formateur";
	}

}
