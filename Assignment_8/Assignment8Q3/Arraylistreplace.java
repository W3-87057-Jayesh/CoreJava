package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistreplace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> x=new ArrayList<String>();
		x.add("1");
		x.add("2");
		x.add("3");
		x.add("4");
		x.add("5");
		x.add("6");
		System.out.println("Before Replacing=>"+x);
		System.out.println("Enter the Specified element: ");
		String y=sc.nextLine();
		x.set(1,y);
		System.out.println("After Replacing=>"+x);

	}

}
