package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bedroom {
	
	private String name;
	private String feature;
	private int capacity;
	private int number;
	private static LocalDate date;
	
	static ArrayList<Bedroom> room = new ArrayList<Bedroom>();
	

	public Bedroom() {
		name = "Inconnu";
		capacity = 0;
		number = 0;
		feature = "Inconnu";
	}
	
	public Bedroom(String bName, int bCapacity, int bNumber, String bFeature) {
		name = bName;
		capacity = bCapacity;
		number = bNumber;
		feature = bFeature;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	static void createRoom(Bedroom bedroom) {
		room.add(bedroom);
	}
	
	public void removeRoom(Bedroom bedroom) {
		room.remove(bedroom);
	}
	
	public void getBedroom() {

		for(Bedroom elem: room)
		{
            System.out.println ("Numéro :" + elem.number + " Nom :"+ elem.name + " Capaciter :"+ elem.capacity + " Description : "+ elem.feature);
            System.out.println ("-------------------");
        }
	}

	public static LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		// TODO Auto-generated method stub
		Bedroom.date = date;
	}
	
}
