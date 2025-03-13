package Lab;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the employee role (Manager, Developer, Intern): ");
        String role = sc.nextLine();

       
        System.out.print("Enter experience in no of years: ");
        int experience = sc.nextInt();
        double baseSalary = 0;
        if (role.equalsIgnoreCase("Manager")) { //salary for for manager 
            baseSalary = 50000;
        } else if (role.equalsIgnoreCase("Developer")) { //salary for for developer
            baseSalary = 30000;
        } else if (role.equalsIgnoreCase("Intern")) { //salary for for intern
            baseSalary = 15000;
        } else {
            System.out.println("Invalid role entered!");
            return;
        }
        
        double bonus = 0;
        if (experience >= 3 && experience <= 5) {
            bonus = baseSalary * 0.10; // 10% bonus for 3-5 years
        } else if (experience > 5) {
            bonus = baseSalary * 0.20; // 20% bonus for more than 5 years
        } else {
            bonus = 0; // No bonus for less than 3 years
        }

        double totalSalary = baseSalary + bonus;
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        sc.close();
    }
}