package TABLE_PER_CLASS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_paypal")
public class TPayPal extends TPayment {
	
	@Column(name="account_number")
	private String AccountNumber;
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public TPayPal() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "TPayPal [AccountNumber=" + AccountNumber + "]";
	}
	public TPayPal( int amount, String paymentDate, String accountNumber) {
		super( amount, paymentDate);
		AccountNumber = accountNumber;
	}
	
	
	
	
}
