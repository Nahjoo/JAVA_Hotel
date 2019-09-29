package hotel;

import java.time.LocalDate;

public class Owner extends People {
	
	public Owner() {
		super();
	}
	
	public Owner(String lastname, String firstname, LocalDate birthday, String adress) {
		super(lastname,firstname,birthday,adress);	
	}

}


