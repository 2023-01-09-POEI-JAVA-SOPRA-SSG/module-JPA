package JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name="j_payment")
@Inheritance(strategy = InheritanceType.JOINED)
public class JPayment {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int amount;
	
	@Column(name="payment_date")
	private String paymentDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "JPayment [id=" + id + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}

	public JPayment() {
		super();
	}
	
	
	
}
