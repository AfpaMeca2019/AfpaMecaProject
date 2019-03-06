package fr.afpa.formation.mecanique.persistence.entity.statutOR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class DemandeCloture extends Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private static DemandeCloture dc = null;
	
	private DemandeCloture() {}
	
	public DemandeCloture getInstance() {
		// TODO Auto-generated method stub
		if(dc == null) {
			dc = new DemandeCloture();
		}
		return dc;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Demande de clôture";
	}

}
