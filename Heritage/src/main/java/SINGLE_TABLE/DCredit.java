package SINGLE_TABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class DCredit extends DPayment{

	
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

	public DCredit() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "DCredit [cardNumber=" + cardNumber + ", dateExp=" + dateExp + "]";
	}
	
	
}
