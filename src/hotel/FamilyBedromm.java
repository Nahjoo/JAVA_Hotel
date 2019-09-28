package hotel;

import java.util.ArrayList;

public class FamilyBedromm extends Bedroom{
	static ArrayList<FamilyBedromm> family = new ArrayList<>();
		
	public FamilyBedromm() {
		super();
	}
	
	public FamilyBedromm(String name, int number, int capacity,String feature) {
		super(name, number, capacity, feature);
	}
	
	public void CreateRoom(FamilyBedromm familybedromm) {
		family.add(familybedromm);
		super.createRoom(familybedromm);
	}
	
	public void getFamilyRoom() {
		for(FamilyBedromm elem: family)
		{
            System.out.println ("Numéro :" + elem.getNumber() + " Nom :"+ elem.getName() + " Capaciter :"+ elem.getCapacity() + " Description : "+ elem.getFeature());
            System.out.println ("-------------------");  
        }
	}
	
	public static void removeRoom(FamilyBedromm familyroom) {
		family.remove(familyroom);
	}
	
	public static void getNbRoom(int nbroom) {
		Boolean exist = null;
		
		for(FamilyBedromm elem: family)
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
