class Main{
	public static void main(String [] args){
		SuperCar c = new SuperCar(true, "Black", 20, "Car", "Thar");
		c.display();
	}
}

class Vehicle{
	String type;
	String name;

	public Vehicle(String type, String name){
		this.name = name;
		this.type = type;
	}
}

class Car extends Vehicle{
	String color;
	int milage;
	
	public Car(String color, int milage, String type, String name){
		super(type, name);
		this.color = color;
		this.milage = milage;
	}
}

class SuperCar extends Car{
	boolean sportMode;
	
	public SuperCar(boolean sportMode, String color, int milage, String type, String name){
		super(color, milage, type, name);
		this.sportMode = sportMode;
	}

	public void display(){
		System.out.println("Type Vehicle : " + super.type);
		System.out.println("Name Vehile : " + super.name);
		System.out.println("Milage : " + super.milage);
		System.out.println("Color : " + super.color);
		System.out.println("Sport Mode : " + this.sportMode);		
	}
}