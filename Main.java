class Main{
	public static void main(String [] args){
		SuperBike sb = new SuperBike(true, "Back", 50, "Bike", "Pulser");
		sb.displaySuperBike();
	}
}

//Grand parent
class Vehicle{
	String type;
	String name;
	
	public Vehicle(String type, String name){
		this.type = type;
		this.name = name;
	}

	public void displayVehicle(){
		System.out.println(this.type);
		System.out.println(this.name);
	}
}

//Parent
class Bike extends Vehicle{
	String color;
	int milage;
	
	public Bike(String color, int milage, String type, String name){
		super(type, name);
		this.color = color;
		this.milage = milage;
	}
	
	public void displayBike(){
		System.out.println(this.color);
		System.out.println(this.milage);
		System.out.println(super.type);
		System.out.println(super.name);
	}
}

//Child
class SuperBike extends Bike{
	boolean sportMode;
	public SuperBike(boolean sportMode, String color, int milage, String type, String name){
		super(color, milage, type, name);
		this.sportMode= sportMode;
	}

	public void displaySuperBike(){
		System.out.println(this.sportMode);
		System.out.println(super.color);
		System.out.println(super.milage);
		System.out.println(super.type);
		System.out.println(super.name);
	}
}