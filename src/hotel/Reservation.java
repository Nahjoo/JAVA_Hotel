package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation extends Bedroom {
	
	static ArrayList<Reservation> reservation = new ArrayList<>();

	private LocalDate reservationDate;
	
	public Reservation() {
		super();
		reservationDate = null;
	}
	
	public Reservation(String name, int number, int capacity, String feature, LocalDate reservation) {
		super(name,number,capacity,feature);
		this.reservationDate = reservation;
	}
	
	public LocalDate getReservationDate() {
		return reservationDate;
	}
	
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	public void createReservation(Reservation reservationroom) {
		reservation.add(reservationroom);
	}
	
	public void ReservationRoom() {

		for(Reservation elem: reservation)
		{
            System.out.println ("Numéro :" + elem.getNumber() + " Nom :"+ elem.getName() + " Capaciter :"+ elem.getCapacity() + " Description : "+ elem.getFeature() + " Date :" + elem.getReservationDate());
            System.out.println ("-------------------");
            
        }
	}
	
}