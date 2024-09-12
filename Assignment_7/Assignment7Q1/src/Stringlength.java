import java.util.Scanner;

class ExceptionLineTooLong extends Exception
{
	public ExceptionLineTooLong(String s) {
		super(s);
	}
	
}
public class Stringlength{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line=>");
		String s=sc.nextLine();
		try {
			checkline(s);
		}catch(ExceptionLineTooLong e) {System.out.println(e.getMessage());
		}
	}
	public static void checkline(String s) throws ExceptionLineTooLong {
		if(s.length()>80) {
			throw new ExceptionLineTooLong("The String is too long");
			
		}else {
			System.out.println("The length is =>"+s.length());
		}
	}
}







