class Main{
	public static void main(String [] str){
		Model m = new Model("X 4 Pro", 18000, "Poco", "India");
		m.display();
	}
}
class Mobile{
	String cName;
	String cLocation;
	
	public Mobile(String cName, String cLocation){
		this.cName = cName;
		this.cLocation = cLocation; 
	}
}

class Model extends Mobile{
	String model;
	int price;

	public Model(String model, int price, String cName, String cLocation){
		super(cName, cLocation);
		this.model = model;
		this.price = price;
	}

	public void display(){
		System.out.println(super.cName);
		System.out.println(super.cLocation);
		System.out.println(this.model);
		System.out.println(this.price);
	}
}