package entity;

import com.github.javafaker.Faker;

public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private int zip;
	private String address;
	private String number;
	public User(String firstName, String lastName, int age, int zip, String address, String number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.zip = zip;
		this.address = address;
		this.number = number;
	}
	
	
	
	
	
	public User() {
		super();
		
		Faker faker = new Faker();

		
		this.firstName = faker.company().name();
		this.lastName = faker.name().lastName();
		this.age = faker.number().numberBetween(20, 40);
		this.zip = Integer.parseInt( faker.number().digits(5));
		this.address = faker.address().streetAddress();
		this.number = "0" + faker.number().digits(9);
		
	}





	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", zip=" + zip
				+ ", address=" + address + ", number=" + number + "]";
	}
	
	
	
}
