public class SalariedEmployee extends Employee {
    private double weeklySalary;

    
    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary * 1.10; 
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s\nweekly salary: %.2f",
                super.toString(), weeklySalary);
    }
}
