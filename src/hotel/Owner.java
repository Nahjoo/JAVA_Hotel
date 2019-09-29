package hotel;

import java.time.LocalDate;

public class Owner extends People {
	
	private String email;
	private String phoneNumber;
	
	public Owner() {
		super();
		email = "Inconnu";
		phoneNumber = "Inconnu";
	}
	
	public Owner(String lastname, String firstname, LocalDate birthday, String adress, String email, String phoneNumber) {
		super(lastname,firstname,birthday,adress);
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
