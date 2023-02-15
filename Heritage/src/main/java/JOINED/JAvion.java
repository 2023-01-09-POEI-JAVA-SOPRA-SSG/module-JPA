package JOINED;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="j_avion")
@PrimaryKeyJoinColumn(name="id_vehicule")
public class JAvion extends JVehicule {
	
	private int altitude;

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return super.toString() + "JAvion [altitude=" + altitude + "]";
	}

	public JAvion() {
		super();
	}	
}
