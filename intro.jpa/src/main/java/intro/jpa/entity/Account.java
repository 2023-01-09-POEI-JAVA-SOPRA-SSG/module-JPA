package intro.jpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="account")
public class Account {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_creation")
	private Date dateCreation;
	
	@Column(name="nombre_messages")
	private int nombreMessages;
	
	@Column(name="nombres_amis")
	private int nombreAmis;

	@OneToOne
	@JoinColumn(name="credentials_id", nullable=false)
	private Credential credential;
	
	public Credential getCredential() {
		return credential;
	}
	public void setCredential(Credential credential) {
		this.credential = credential;
	}
	
	
	
	
	public Account(String firstName, String lastName, Date dateCreation, int nombreMessages, int nombreAmis,
			Credential credential) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateCreation = dateCreation;
		this.nombreMessages = nombreMessages;
		this.nombreAmis = nombreAmis;
		this.credential = credential;
	}
	public Account(String firstName, String lastName, int nombreMessages, int nombreAmis,
			Credential credential) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nombreMessages = nombreMessages;
		this.nombreAmis = nombreAmis;
		this.credential = credential;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getNombreMessages() {
		return nombreMessages;
	}

	public void setNombreMessages(int nombreMessages) {
		this.nombreMessages = nombreMessages;
	}

	public int getNombreAmis() {
		return nombreAmis;
	}

	public void setNombreAmis(int nombreAmis) {
		this.nombreAmis = nombreAmis;
	}

	public Account() {
		super();
	}

	public Account(int id, String firstName, String lastName, Date dateCreation, int nombreMessages, int nombreAmis) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateCreation = dateCreation;
		this.nombreMessages = nombreMessages;
		this.nombreAmis = nombreAmis;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateCreation="
				+ dateCreation + ", nombreMessages=" + nombreMessages + ", nombreAmis=" + nombreAmis + "]";
	}
	
}
