package SINGLE_TABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class DPayPal extends DPayment {
	
	@Column(name="account_number")
	private String AccountNumber;
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public DPayPal() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "DPayPal [AccountNumber=" + AccountNumber + "]";
	}
	
	
}
