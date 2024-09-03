import java.util.ArrayList;
import java.util.Scanner;
class MenuItem {
    String name;
    double price;
    int quantity;
    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    void addQuantity(int quantity) {
        this.quantity += quantity;
    }
    double calculateTotal() {
        return this.price * this.quantity;
    }
}
public class Assignmentq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Dosa", 50));
        menu.add(new MenuItem("Samosa", 20));
        menu.add(new MenuItem("Idli", 30));
        menu.add(new MenuItem("Vada", 25));
        menu.add(new MenuItem("Puri", 40));
        menu.add(new MenuItem("Uttapam", 60));
        menu.add(new MenuItem("Pongal", 70));
        menu.add(new MenuItem("Chapati", 15));
        menu.add(new MenuItem("Biriyani", 90));
        while (true) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).name + " - " + menu.get(i).price);
            }
            System.out.println("10. Generate Bill");
            System.out.print("Select an item by number (1-10): ");
            int choice = scanner.nextInt();
            if (choice == 10) {
                double totalBill = 0;
                System.out.println("Generating bill=>");
                System.out.println("Item \t Quantity \t Price");
                System.out.println("-----------------------------");
                for (MenuItem item : menu) {
                    if (item.quantity > 0) {
                        double itemTotal = item.calculateTotal();
                        totalBill += itemTotal;
                        System.out.println(item.name+" \t "+item.quantity+" \t\t "+itemTotal);
                    }
                }
                System.out.println("-----------------------------");
                System.out.println("Total bill: "+ totalBill);
                break;
            } else if (choice > 0 && choice <= menu.size()) {
                System.out.print("Enter quantity for " + menu.get(choice - 1).name + ": ");
                int quantity = scanner.nextInt();
                menu.get(choice - 1).addQuantity(quantity);
            } else {
                System.out.println("Invalid choice, please select again.");
            }
        }
        scanner.close();
    }
}