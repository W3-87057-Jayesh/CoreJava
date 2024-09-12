package tester;

import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basket size: ");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int counter = 0,i;

		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("Options:");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits");
			System.out.println("5. Display details of all fresh fruits");
			System.out.println("6. Display tastes of all stale fruits");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println("10. Exit");
			System.out.println("---------------------------------------------------");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (counter < size) {
					System.out.print("Enter name, weight, color: ");
					basket[counter++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Basket is full!");
				}
				break;
			case 2:
				if (counter < size) {
					System.out.print("Enter name, weight, color: ");
					basket[counter++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Basket is full!");
				}
				break;
			case 3:
				if (counter < size) {
					System.out.print("Enter name, weight, color: ");
					basket[counter++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Basket is full!");
				}
				break;
			case 4:
				 i=0;
				for (Fruit fruit : basket) {
					if (fruit != null) {i++;
						System.out.println("=> "+i+". "+ fruit.getName());
					}
				}
				break;
			case 5:
				i=0;
				for (Fruit fruit : basket) {i++;
					if (fruit != null && fruit.isFresh()) {
						System.out.println("=> "+i+". "+fruit.toString() + ", Taste: " + fruit.taste());
					}
				}
				break;
			case 6:
				for (Fruit fruit : basket) {
					if (fruit != null && !fruit.isFresh()) {
						System.out.println("=> "+"Taste: " + fruit.taste());
					}
				}
				break;
			case 7:
				System.out.print("Enter index to mark as stale: ");
				int index = sc.nextInt();
				index-=1;
				if (index >= 0 && index < counter) {
					basket[index].setFresh(false);
					System.out.println("=> "+"The fruit named " +basket[index].getName()+" is stale now.");
				} else {
					System.out.println("Invalid index!");
				}
				break;
			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.taste().equals("sour")) {
						fruit.setFresh(false);
						System.out.println("All sour fruits are stale now.");
					}
				}
				break;
			case 10:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid option!");
			}
		}
	}
}
