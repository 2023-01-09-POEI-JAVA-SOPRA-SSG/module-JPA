package JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="j_paypal")
@PrimaryKeyJoinColumn(name="id_payment")
public class JPayPal extends JPayment {
	
	@Column(name="account_number")
	private String AccountNumber;
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public JPayPal() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "JPayPal [AccountNumber=" + AccountNumber + "]";
	}
	
	
}
