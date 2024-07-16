
public class inheritance
{
	public static void main(String[] args) {
		Student st = new Student();
		st.clgname = "D Y Patil";
		st.location = "Pune";
		st.stdname = "Rushikesh Tekale";
		
		st.stdInfo();
	}
}

class College{
    String clgname;
    String location;
    public void collegeInfo(){
        System.out.println(clgname);
        System.out.println(location);
    }
}

class Student extends College{
    String stdname;
    public void stdInfo(){
        collegeInfo();
        System.out.println(stdname);
    }
}