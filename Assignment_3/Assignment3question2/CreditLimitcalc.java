import java.util.Scanner;

public class CreditLimitcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = sc.nextInt();

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("Enter details for Customer " + i + ":");

            System.out.print("Account Number: ");
            int accountNumber = sc.nextInt();

            System.out.print("Beginning Balance: ");
            int beginningBalance = sc.nextInt();

            System.out.print("Total Charges: ");
            int totalCharges = sc.nextInt();

            System.out.print("Total Credits: ");
            int totalCredits = sc.nextInt();

            System.out.print("Credit Limit: ");
            int creditLimit = sc.nextInt();

            Customer customer = new Customer(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);

            customer.displayCustomerInfo();
        }

        sc.close();
        
        Customer n=  new Customer(4,55,333,554,3);
    }
}
