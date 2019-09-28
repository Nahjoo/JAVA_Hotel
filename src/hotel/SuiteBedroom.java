package hotel;

import java.util.ArrayList;

public class SuiteBedroom extends Bedroom{
	static ArrayList<SuiteBedroom> suite = new ArrayList<>();
	
	public SuiteBedroom() {
		super();
	}
	
	public SuiteBedroom(String name, int number, int capacity,String feature) {
		super(name, number, capacity, feature);
	}
	
	public void CreateRoom(SuiteBedroom suitebedroom) {
		suite.add(suitebedroom);
		super.createRoom(suitebedroom);
	}
	
	public void getSuiteRoom() {
		for(SuiteBedroom elem: suite)
		{
            System.out.println ("Numéro :" + elem.getNumber() + " Nom :"+ elem.getName() + " Capaciter :"+ elem.getCapacity() + " Description : "+ elem.getFeature());
            System.out.println ("-------------------");  
        }
	}
	
	public static void removeRoom(SuiteBedroom suiteroom) {
		suite.remove(suiteroom);
	}
	
	public static void getNbRoom(int nbroom) {
		Boolean exist = null;
		
		for(SuiteBedroom elem: suite)
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
			System.out.println("Chambre réservé!");
			
		}
	}
}
