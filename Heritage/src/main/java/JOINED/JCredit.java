package JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="j_credit")
@PrimaryKeyJoinColumn(name="id_payment")
public class JCredit extends JPayment{

	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration_date")
	private String dateExp;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDateExp() {
		return dateExp;
	}

	public void setDateExp(String dateExp) {
		this.dateExp = dateExp;
	}

	public JCredit() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "JCredit [cardNumber=" + cardNumber + ", dateExp=" + dateExp + "]";
	}
	
	
}
