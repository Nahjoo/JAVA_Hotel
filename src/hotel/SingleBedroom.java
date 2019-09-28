package hotel;

import java.util.ArrayList;

public class SingleBedroom extends Bedroom {
	
	static ArrayList<SingleBedroom> single = new ArrayList<>();
	
	public SingleBedroom() {
		super();
	}
	
	public SingleBedroom(String name, int number, int capacity, String feature) {
		super(name, number, capacity, feature);
	}
	
	public void CreateRoom(SingleBedroom singlebedroom) {
		single.add(singlebedroom);
		super.createRoom(singlebedroom);
	}
	
	public void getSingleRoom() {
		for(SingleBedroom elem: single)
		{
            System.out.println ("Numéro :" + elem.getNumber() + " Nom :"+ elem.getName() + " Capaciter :"+ elem.getCapacity() + " Description : "+ elem.getFeature());
            System.out.println ("-------------------");  
        }
	}
	
	public static void removeRoom(SingleBedroom singleroom) {
		single.remove(singleroom);
	}
	
	public static void getNbRoom(int nbroom) {
		Boolean exist = null;
		
		
		for(SingleBedroom elem: single)
		{
			if(nbroom == elem.getNumber()) {
				exist = true;
				removeRoom(elem);
				Reservation reservation = new Reservation(elem.getName(),elem.getCapacity(), elem.getNumber() ,elem.getFeature(), Bedroom.getDate());
				reservation.createReservation(reservation);
				break;
				
			}else {
				exist = false;
			}
		}
		
		if(!exist) {
			System.out.println("Chambre n'exist pas !");
		}else {
			System.out.println("Chambre réservé");
			
		}
	}
}
