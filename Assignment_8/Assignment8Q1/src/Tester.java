

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackInterface chosenStack = null; 

        while (true) {
        	System.out.println("----------------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push Employee Data");
            System.out.println("4. Pop Employee Data");
            System.out.println("5. Exit");
        	System.out.println("----------------------------------");


            System.out.print("Enter your choice of Stack : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (chosenStack == null) {
                        chosenStack = new FixedStack();
                        System.out.println("Fixed Stack selected.");
                    	System.out.println("");

                    } else {
                        System.out.println("Stack already chosen!");
                    	System.out.println("");

                    }
                    break;
                case 2:
                    if (chosenStack == null) {
                        chosenStack = new GrowableStack();
                        System.out.println("Growable Stack selected.");
                    	System.out.println("");

                    } else {
                        System.out.println("Stack already chosen!");
                    	System.out.println("");

                    }
                    break;
                case 3:
                    if (chosenStack == null) {
                        System.out.println("No stack chosen!!!");
                    	System.out.println("");

                    } else {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Employee Name: ");
                        String name = sc.next();
                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();
                        Employee emp = new Employee(id, name, salary);
                        chosenStack.push(emp);
                    }
                    break;
                case 4:
                    if (chosenStack == null) {
                        System.out.println("No stack chosen!!!");
                    } else {
                        Employee emp = chosenStack.pop();
                        if (emp != null) {
                            System.out.println("Popped: " + emp);

                        }
                    }
                    break;
                case 5:
                	System.out.println("----------------------------------");
                    System.out.println("Exiting...");
                	System.out.println("----------------------------------");

                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");

            }
        }
    }
}
