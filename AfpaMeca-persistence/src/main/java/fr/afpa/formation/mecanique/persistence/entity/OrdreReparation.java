package fr.afpa.formation.mecanique.persistence.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "OR")
public class OrdreReparation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	@Column(nullable = false)
	private String numeroOR;
	@Column(nullable = false)
	private Date dateCreation;
	private Date dateSortie;
	@Column(nullable = false)
	private String symptomesClient;
	@Column(nullable = false)
	private String interventionsARealiser;
	private String interventionsRealisees;
	private String futursTravaux;
	@OneToMany
	private Set<Devis> listDevis = new HashSet<>();
	@OneToOne
	private ControleQualite cq;
	@OneToOne
	private Status_OR statusor;
	@OneToOne
	private Cloture_OR clotureor;
	@OneToOne
	private Utilisateur userCreate;
	@OneToOne
	private Utilisateur userValid;
	@OneToOne
	private Utilisateur userCloture;

	public OrdreReparation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdreReparation(String numeroOR, Date dateCreation, String symptomesClient, String interventionsARealiser) {
		super();
		this.numeroOR = numeroOR;
		this.dateCreation = dateCreation;
		this.symptomesClient = symptomesClient;
		this.interventionsARealiser = interventionsARealiser;
	}

	public void addDevis(Devis d) {
		listDevis.add(d);
	}

	public String getNumeroOR() {
		return numeroOR;
	}

	public void setNumeroOR(String numeroOR) {
		this.numeroOR = numeroOR;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getSymptomesClient() {
		return symptomesClient;
	}

	public void setSymptomesClient(String symptomesClient) {
		this.symptomesClient = symptomesClient;
	}

	public String getInterventionsARealiser() {
		return interventionsARealiser;
	}

	public void setInterventionsARealiser(String interventionsARealiser) {
		this.interventionsARealiser = interventionsARealiser;
	}

	public String getInterventionsRealisees() {
		return interventionsRealisees;
	}

	public void setInterventionsRealisees(String interventionsRealisees) {
		this.interventionsRealisees = interventionsRealisees;
	}

	public String getFutursTravaux() {
		return futursTravaux;
	}

	public void setFutursTravaux(String futursTravaux) {
		this.futursTravaux = futursTravaux;
	}
}