package hotel;

import java.time.LocalDate;

public class Customer extends People {
	
	public Customer() {
		super();
	}
	
	public Customer(String lastname, String firstname, LocalDate birthday, String adress) {
		super(lastname,firstname,birthday,adress);
	}
}
