package fr.afpa.formation.mecanique.persistence.entity.typePaiement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Espece implements TypePaiement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private static Espece e = null;
	
	private Espece() {}
	
	public Espece getInstance() {
		if(e == null) {
			e = new Espece();
		}
		return e;
	}

	public String getPaiement() {
		// TODO Auto-generated method stub
		return "Especes";
	}

}
