package fr.afpa.formation.mecanique.persistence.typePaiement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cheque implements TypePaiement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	private static Cheque c = null;	
	
	private Cheque() {}
	
	public Cheque getInstance() {
		if(c == null) {
			c = new Cheque();
		}
		return c;
	}

	public String getPaiement() {
		// TODO Auto-generated method stub
		return "Cheque";
	}

}
