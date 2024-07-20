class Main{
	public static void main(String [] args){
		SBI sb = new SBI("Pune", "SBI1233", "SBI");
		sb.displaySBI();

		BOI bo = new BOI("Personal", "BOI");
		bo.displayBOI();
	}
}

//Parent class
class Bank{
	String bname;

	public Bank(String bname){
		this.bname = bname;
	}
}

// 1 child
class SBI extends Bank{
	String location;
	String ifsc;

	public SBI(String location, String ifsc, String bname){
		super(bname);
		this.location = location;
		this.ifsc = ifsc;
	}

	public void displaySBI(){
		System.out.println(super.bname);
		System.out.println(this.location);
		System.out.println(this.ifsc);
	}
}

// 2 child
class BOI extends Bank{
	String loantype;
	
	public BOI(String loantype, String bname){
		super(bname);
		this.loantype = loantype;
	}
	
	public void displayBOI(){
		System.out.println(super.bname);
		System.out.println(this.loantype);
	}
}