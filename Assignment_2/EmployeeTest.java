class Employee{
	private String fname,lname;
	private double msalary;
	public Employee(String fname, String lname, double msalary) {
		super();
		this.fname = fname;
		this.lname = lname;
		setMsalary(msalary);
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getMsalary() {
		return msalary;
	}
	public void setMsalary(double msalary) {
		  if (msalary >= 0.0) {
		        this.msalary = msalary;
		    } 
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Aditya","Shukla",188800.00);
		System.out.println("First name :" + e1.getFname());
		System.out.println("Last name :" + e1.getLname());
		System.out.println("Monthly Salary :" + e1.getMsalary());
		System.out.println("Yearly Salary :" +(e1.getMsalary() * 12));
		
		System.out.println();
		
		Employee e2=new Employee("Harish","Sharma",-100.00);
		System.out.println("First name :" + e2.getFname());
		System.out.println("Last name :" + e2.getLname());
		System.out.println("Monthly Salary:" + e2.getMsalary());
		System.out.println("Yearly Salary :" + e2.getMsalary() * 12);
		System.out.println();
		System.out.println("After 10% hike");
		System.out.println("Yearly Salary :" + (e1.getMsalary() * 12 * 1.1));
		System.out.println("Yearly Salary :" +(e2.getMsalary() * 12* 1.1));


	}

}
