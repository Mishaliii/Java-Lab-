package Lab;

import java.util.Scanner;

public class Grademark {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student's percentage: ");
        double per=sc.nextDouble();

        if (per>=90) {
            System.out.println("Grade: A");//compare for >90
            System.out.println("Excellent work!");
        } else if (per>=80) {
            System.out.println("Grade: B");//compare for >80
            System.out.println("Good job!");
        } else if (per>=70) {
            System.out.println("Grade: C");//compare for >70
            System.out.println("You can do better");
        } else if (per>=60) {
            System.out.println("Grade: D");//compare for >60
            System.out.println("Work harder");
        } else {
            System.out.println("Grade: F");
            System.out.println("Failed. Try again");
        }

        
        sc.close();
    }
}