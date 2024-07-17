class Main{
	String name;
	int id;
	int salary;
	int age;
	String location;
	String cName;
	
	public Main(String name, int id, int salary, int age, String location, String cName){
		//Assigning value to the instance variable using this keyword
		this.name = name;
		this.id= id;
		this.salary = salary;
		this.age= age;
		this.location = location;
		this.cName = cName;
	}

	public Main(){
		//Constructor calling using this()
		this("Rushikesh", 10, 1000000, 24, "Pune", "Google");
	}

	public void info(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(location);
		System.out.println(cName);
	}

	public static void main(String [] args){
		Main tk = new Main();
		tk.info();
	}
}