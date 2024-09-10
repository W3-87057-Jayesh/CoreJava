import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String input = scanner.nextLine();
         
         if (isPalindrome(input)) {
             System.out.println("|" + input + "| is a palindrome.");
         } else {
             System.out.println("|" + input + "| is not a palindrome.");
         }
     }
     
     public static boolean isPalindrome(String str) {
         str = str.toLowerCase();
         String r = new StringBuilder(str).reverse().toString();
         return str.equals(r);
     }
 }

	