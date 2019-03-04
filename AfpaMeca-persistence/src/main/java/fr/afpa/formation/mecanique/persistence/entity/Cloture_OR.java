package fr.afpa.formation.mecanique.persistence.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cloture_OR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	private String statutCloture;
	@OneToMany
	private Set<OrdreReparation> listOR = new HashSet<>();

	public Cloture_OR(String statutCloture, OrdreReparation or) {
		super();
		this.statutCloture = statutCloture;
		listOR.add(or);
	}
	
	public Cloture_OR() {
		super();
	}

	public String getStatutCloture() {
		return statutCloture;
	}

	public void setStatutCloture(String statutCloture) {
		this.statutCloture = statutCloture;
	}

}
