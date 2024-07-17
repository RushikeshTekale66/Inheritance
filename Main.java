class Main{
	public static void main(String [] args){
		Car c = new Car("Thar", 1000000, "Car", "Mahindra");
		c.displayCar();
	}
}

//Parent Class
class Vehicle{
	String category;
	String brand;
	
	public Vehicle(String category, String brand){
		this.category = category;
		this.brand = brand;
	}
	
	public void displayVehicle(){
		System.out.println(category);
		System.out.println(brand);
	}
}

//Child Class
class Car extends Vehicle{
	String model;
	int price;

	public Car(String model, int price, String category, String brand){
		super(category, brand);
		this.model = model;
		this.price = price;
	}

	public void displayCar(){
		super.displayVehicle();
		System.out.println(model);
		System.out.println(price);
	}
}