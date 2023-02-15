package TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="t_avion")
public class TAvion extends TVehicule {
	
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

	public TAvion() {
		super();
	}	
}
