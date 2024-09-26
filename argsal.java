public class argsal {
    public static void main(String[] args) {
        // Check if the basic salary is provided as a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java SalaryCalculator <basicSalary>");
            return;
        }

        // Parse the basic salary from the command-line argument
        double basicSalary = Double.parseDouble(args[0]);

        // Calculate DA and HRA
        double da = 0.20 * basicSalary;
        double hra = 0.30 * basicSalary;

        // Calculate Gross Salary
        double grossSalary = basicSalary + da + hra;

        // Calculate Income Tax based on the conditions
        double incomeTax = 0.0;
        if (basicSalary > 0 && basicSalary < 4000) {
            incomeTax = 0.04 * basicSalary;
        } else if (basicSalary >= 4000 && basicSalary < 10000) {
            incomeTax = 0.06 * basicSalary;
        } else if (basicSalary >= 10000 && basicSalary < 17000) {
            incomeTax = 0.08 * basicSalary;
        } else if (basicSalary >= 17000 && basicSalary < 27000) {
            incomeTax = 0.10 * basicSalary;
        } else if (basicSalary >= 27000) {
            incomeTax = 0.12 * basicSalary;
        }

        // Output the results
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Income Tax: " + incomeTax);
    }
}
