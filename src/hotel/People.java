package hotel;

import java.time.LocalDate;

public class People {
	private String lastname;
	private String firstname;
	private LocalDate birthday;
	private String adress;
	
	public People() {
		lastname = "Inconnu";
		firstname = "Inconnu";
		birthday = null;
		adress = "Inconnu";
	}
	
	public People(String lastname, String firstname, LocalDate birthday, String adress) {
		
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthday = birthday;
		this.adress = adress;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
