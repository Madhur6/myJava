package kay;

import java.time.LocalDate;
import java.util.Scanner;

class TrainClass {
	
	private int id;
	private String name;
	private String arrivalTime; // yyyy-mm-dd
	private String departureTime;
	private String destination;
	private String departure;
	
	public TrainClass() {
		
	}
	
	public TrainClass(int id, String name, String arrivalTime, String departureTime, String destination, String departure) {
		this.id = id;
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.destination = destination;
		this.departure = departure;
	}
	
	public TrainClass(String name, String arrivalTime, String departureTime, String destination, String departure) {
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.destination = destination;
		this.departure = departure;
	}
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + ", destination=" + destination + ", departure=" + departure + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getArrivalTime()=" + getArrivalTime() + ", getDepartureTime()="
				+ getDepartureTime() + ", getDestination()=" + getDestination() + ", getDeparture()=" + getDeparture()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}


public class Train {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of trains: ");
		int n = sc.nextInt();
		
		TrainClass[] trainArr = new TrainClass[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Enter train ID " + (i+1) +": ");
			int id = sc.nextInt(); // Revise cli.java in order to understand this line...😎😎
			sc.nextLine();
			
			System.out.print("Enter train Name " + (i+1) + ": ");
			String name = sc.nextLine();
			
			System.out.print("Enter arrival time: " + (i+1) + ": ");
			String arrTime = sc.nextLine();
			
			System.out.print("Enter departure time: " +  (i+1) + ": ");
			String depTime = sc.nextLine();
			
			System.out.print("Enter departure station: " + (i+1) + ": ");
			String depStation = sc.nextLine();
			
			System.out.print("Enter destination station: " + (i+1) + ": ");
			String destinationStation = sc.nextLine();
			
			
			TrainClass train = new TrainClass(id, name, arrTime, depTime, depStation, destinationStation);
			
			trainArr[i] = train;
		}
		
		
		for (int i = 0; i < trainArr.length; i++) {
			System.out.println("----------------------*-------------------------");
			System.out.println(trainArr[i]); // This is will be representing the object at index i inside our trainArr...
			System.out.println("----------------------*-------------------------");
		}
		
		// OBJECT ARRAY....
	}
}















