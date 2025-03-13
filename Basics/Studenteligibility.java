package Lab;

import java.util.Scanner;

public class Studenteligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//input
        System.out.print("Enter marks for Math: ");
        double maths=sc.nextDouble();//input for sub1
        System.out.print("Enter marks for Physics: ");
        double physics=sc.nextDouble();//input for sub2
        System.out.print("Enter marks for Chemistry: ");
        double chemistry=sc.nextDouble();//input for sub 3
        double totalMarks=maths+physics+chemistry;//input for total marks
        double totalMathPhysics=maths+physics;//input for sum of sub1+sub2
        
        if(totalMarks>=150) {
            System.out.println("The student is eligible");
        }
        else if(totalMathPhysics>=120) {
            System.out.println("The student is eligible");
        } else {
            System.out.println("The student is not eligible.");
        }
        sc.close();
    }
}