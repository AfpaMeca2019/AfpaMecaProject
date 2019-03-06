package fr.afpa.formation.mecanique.persistence.entity.statutOR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cloture extends Statut_OR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private static Cloture c = null;
	
	private Cloture() {}

	public Cloture getInstance() {
		// TODO Auto-generated method stub
		if(c == null) {
			c = new Cloture();
		}
		return c;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Clôturé";
	}
}