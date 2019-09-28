package hotel;
import java.time.LocalDate;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int years = 0;
		int month = 0;
		int day = 0;
		int nbPeople;
		int choiceRoom;
		LocalDate date;
		
		System.out.println("----Rservation----");
		System.out.println(" 1. Lister les chambres \n 2. Réserver une chambre \n 3. Afficher les réservation \n 4. Quitter l'application");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choix :");
		choice = sc.nextInt();
		
		
		if(choice != 1 && choice != 2 && choice != 3 && choice != 4) {
			System.out.println("Veuillez saisir le bon mode !");
			main(args);
		}else {
			Bedroom bedroom = new Bedroom();
			SingleBedroom single = new SingleBedroom("Tourtel", 1,300,"Wifi");
			SingleBedroom single2 = new SingleBedroom("Tourtel", 1,500,"Wifi");
			FamilyBedromm family = new FamilyBedromm("Alain", 5, 205, "TV, Wifi");
			SuiteBedroom suite = new SuiteBedroom("Palmier", 12, 401, "TV, Wifi, pscine");
			Reservation reservation = new Reservation();
			
			single.CreateRoom(single);
			single.CreateRoom(single2);
			family.CreateRoom(family);
			suite.CreateRoom(suite);
			
			if(choice == 1) {
				single.getBedroom();
				main(args);
	
			}else if(choice == 2) {
				
				System.out.println("----- Réservation d'une chambre -----");
				System.out.println("Combien de personne ?");
				nbPeople = sc.nextInt();
				System.out.println("Nombre de personne :" + nbPeople);
				System.out.println("Date de réservation : ");
				System.out.println("Année :");
				years = sc.nextInt();
				System.out.println("Moi :");
				month = sc.nextInt();
				System.out.println("Jour :");
				day = sc.nextInt();
				date = LocalDate.of(years, month, day);
				bedroom.setDate(date);
				
				
				if(nbPeople == 1) {
					
					single.getSingleRoom();
					System.out.println("Selectionner le numero de la chambre :");
					choiceRoom = sc.nextInt();
					bedroom.setDate(date);
					SingleBedroom.getNbRoom(choiceRoom);
					main(args);
					
					
				}else if (nbPeople > 1 && nbPeople < 10) {
					
					family.getFamilyRoom();
					System.out.println("Selectionner le numero de la chambre :");
					choiceRoom = sc.nextInt();
					FamilyBedromm.getNbRoom(choiceRoom);
					main(args);
					
					
					
				}else {
					
					suite.getSuiteRoom();
					System.out.println("Selectionner le numero de la chambre :");
					choiceRoom = sc.nextInt();
					SuiteBedroom.getNbRoom(choiceRoom);
					main(args);
					
				}
			}else if(choice == 3) {
				reservation.ReservationRoom();
				main(args);
			}else if(choice == 4) {
				System.out.println("Bye Bye ...");
				System.exit(0);
			}
		
		}	

	}
	
}
