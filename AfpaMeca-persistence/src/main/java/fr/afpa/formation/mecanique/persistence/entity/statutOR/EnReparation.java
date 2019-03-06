package fr.afpa.formation.mecanique.persistence.entity.statutOR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class EnReparation extends Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	private static EnReparation enRep = null;
	
	private EnReparation() {
		// TODO Auto-generated constructor stub
	}
	
	public EnReparation getInstance() {
		if(enRep == null) {
			enRep = new EnReparation();
		}
		return enRep;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "En réparation";
	}

}
