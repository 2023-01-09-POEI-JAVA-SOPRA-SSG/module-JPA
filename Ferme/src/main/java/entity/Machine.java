package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="machine")
public class Machine {

	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	private int prix;
	
	@Column(name="date_achat")
	private Date dateAchat;
	
	@ManyToOne
	@JoinTable(
			name = "ferme_machine_association",
			joinColumns = @JoinColumn(name ="id_machine"),
			inverseJoinColumns = @JoinColumn( name = "id_ferme") 
			)
	private Ferme ferme;
	
	public Ferme getFerme() {
		return ferme;
	}
	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Machine() {
		super();
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", nom=" + nom + ", prix=" + prix + ", dateAchat=" + dateAchat + "]";
	}
	
	
}
