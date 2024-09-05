public class Customer {
    private int accountNumber;
    private int beginningBalance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    public Customer(int accountNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public int calculateNewBalance() {
        return beginningBalance + totalCharges - totalCredits;
    }

    public boolean isCreditLimitExceeded() {
        return calculateNewBalance() > creditLimit;
    }

    public void displayCustomerInfo() {
        int newBalance = calculateNewBalance();
        System.out.println("--------------Invoice-------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Beginning Balance: " + beginningBalance);
        System.out.println("Total Charges: " + totalCharges);
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("New Balance: " + newBalance);
        System.out.print("Result=>");
        if (isCreditLimitExceeded()) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Credit limit not exceeded.");
        }
        System.out.println("----------------------------------------"); 
    }
}
