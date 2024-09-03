import java.util.Scanner;

public class Assignmentq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number :");
int x=sc.nextInt();
System.out.println("Given number :"+x);
System.out.println("Binary equivalent :"+Integer.toBinaryString(x));
System.out.println("Octal equivalent :"+Integer.toOctalString(x));
System.out.println("Hexadecimal equivalent :"+Integer.toHexString(x));

sc.close();
	}

}
