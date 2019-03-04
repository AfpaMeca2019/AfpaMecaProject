package fr.afpa.formation.mecanique.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class DevisItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	@OneToOne
	private Piece p;

	public Piece getP() {
		return p;
	}

	public void setP(Piece p) {
		this.p = p;
	}

}
