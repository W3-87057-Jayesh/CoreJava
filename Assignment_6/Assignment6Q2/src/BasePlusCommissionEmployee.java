
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
    @Override
    public String toString() {
        return String.format("base salaried commission employee: %s\nbase salary: %.2f",
                super.toString(), baseSalary);
    }
}
