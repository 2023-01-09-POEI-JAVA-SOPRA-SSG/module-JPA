package TABLE_PER_CLASS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_credit")
public class TCredit extends TPayment{

	
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

	public TCredit() {
		super();
	}

	
	
	


	public TCredit( int amount, String paymentDate, String cardNumber, String dateExp) {
		super( amount, paymentDate);
		this.cardNumber = cardNumber;
		this.dateExp = dateExp;
	}

	@Override
	public String toString() {
		return super.toString() + "TCredit [cardNumber=" + cardNumber + ", dateExp=" + dateExp + "]";
	}
	
	
}
