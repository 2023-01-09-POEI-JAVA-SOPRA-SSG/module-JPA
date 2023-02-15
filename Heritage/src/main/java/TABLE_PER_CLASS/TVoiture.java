package TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="t_voiture")
public class TVoiture extends TVehicule{

	private int chevaux;
	
	private String marque;

	public int getChevaux() {
		return chevaux;
	}

	public void setChevaux(int chevaux) {
		this.chevaux = chevaux;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return super.toString() + "JVoiture [chevaux=" + chevaux + ", marque=" + marque + "]";
	}

	public TVoiture() {
		super();
	}
	
}
