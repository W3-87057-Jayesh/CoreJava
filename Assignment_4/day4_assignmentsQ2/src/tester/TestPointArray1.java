package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Points: ");
		int n = sc.nextInt();
		
		Point2D[] p = new Point2D[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the coordinates for p" + i);
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			p[i] = new Point2D(x1, y1);
		}

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y coordinates of all points");
			System.out.println("3. Display distance between two points");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter index of the point: ");
				int index = sc.nextInt();
				if (index>= 0 && index < p.length) {
					System.out.println("Point at index " + index + ": " + p[index].getDetails());
				} else {
					System.out.println("Invalid index, please retry!");
				}
				break;
			case 2:
				for (Point2D x : p) {
					System.out.println(x.getDetails());
				}
				break;
			case 3:
				System.out.print("Enter index of start point: ");
				int startIndex = sc.nextInt();
				System.out.print("Enter index of end point: ");
				int endIndex = sc.nextInt();
				if (startIndex >= 0 && 
					startIndex < p.length && 
					endIndex >= 0 && 
					endIndex < p.length) {
					if (!p[startIndex].equals(p[endIndex])) {
						double distance = p[startIndex].calculateDistance(p[endIndex]);
						System.out.println("Distance between points: " + distance);
					} else {
						System.out.println("Points are at the same location.");
					}
				} else {
					System.out.println("Invalid indices, please retry!");
				}
				break;
			case 4:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice, please retry!");
			}
		}

	}
}