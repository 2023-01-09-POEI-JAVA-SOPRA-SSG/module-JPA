package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="ferme")
public class Ferme {

	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String localisation;
	
	private int superficie;

	
	@OneToMany
	@JoinTable(
			name = "ferme_machine_association",
			joinColumns = @JoinColumn(name ="id_ferme"),
			inverseJoinColumns = @JoinColumn( name = "id_machine") 
			)
	private List<Machine> machines;
	
	public List<Machine> getMachines() {
		return machines;
	}
	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}
	
	@OneToMany(targetEntity = Animaux.class, mappedBy = "ferme")
	private List<Animaux> animaux;
	
	public List<Animaux> getAnimaux() {
		return animaux;
	}
	public void setAnimaux(List<Animaux> animaux) {
		this.animaux = animaux;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public Ferme() {
		super();
	}

	@Override
	public String toString() {
		return "Ferme [id=" + id + ", name=" + name + ", localisation=" + localisation + ", superficie=" + superficie
				+ "]";
	}

	
	
}
