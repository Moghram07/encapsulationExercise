import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("1", "Omar Alshehri");
        Account account2 = new Account("2", "Mohammed Alzahrani", 500);

        account1.setBalance(100);//set balance to 100
        System.out.println(account1);
        System.out.println(account2);

        // add 100 to account1
        account1.credit(100);
        System.out.println("account 1 new balance = " + account1.getBalance());

        // withdraw 50 from account2
        account2.debit(50);
        System.out.println(account2);

        // Transfer 200 from account2 to account1
        account2.transferTo(account1, 200);
        System.out.println("\nAfter transferring 200 from account2 to account1:");
        System.out.println(account1);
        System.out.println(account2);
        //creating object for the employee class
        Employee employee = new Employee("1110", "Omar Alshehri", 50000);
        Employee employee2 = new Employee("1101","Mohammed Alzahrani", 70000);

        System.out.println(employee);
        System.out.println(employee2);
        // Raise salary by 10%
        employee.raiseSalary(10);
        employee2.raiseSalary(7);
        System.out.println("\nAfter raising salary");
        System.out.println(employee);
        System.out.println(employee2);
        // Print annual salary
        System.out.println(employee.getName()+" Annual salary: " + employee.getAnnualSalary());
        System.out.println(employee2.getName()+" Annual salary: " + employee2.getAnnualSalary());
    }
}