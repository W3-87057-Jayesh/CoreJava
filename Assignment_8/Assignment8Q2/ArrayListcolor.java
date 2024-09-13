package day10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListcolor {

	public static void main(String[] args) {
		ArrayList<String> x=new ArrayList<String>();
		x.add("Red");
		x.add("Blue");
		x.add("Orange");
		x.add("Cyan");
		x.add("Green");
		x.add("Grey");
		System.out.println("Before Replacing=>"+x);
		Collections.sort(x);
		System.out.println("After Replacing=>"+x);
	}

}
