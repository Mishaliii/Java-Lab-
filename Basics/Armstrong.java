package Lab;
import java.util.Scanner;

public class Armstrong {


	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);//taking input//
	        System.out.print("Enter a number: ");
	        int num=sc.nextInt();

	        int onum= num; // Store original number
	        int numberofdigits=0;
	        
	        while(num!=0){
	            num/=10; // Remove last digit
	            numberofdigits++;//count the number of digits//
	        }

	        num=onum; // Reset num to original value
	        int sum=0;

	        
	        while(num!=0) {
	            int digit = num%10;  // Extract last digit 
	            sum+=Math.pow(digit,numberofdigits); // Raise to the power and add to sum
	            num/=10; // Remove last digit
	        }

	       
	        if(sum == onum) {
	            System.out.println(onum+ "is an Armstrong number");
	        } else{
	            System.out.println(onum+ "is not an Armstrong number");
	        }

	        sc.close();
	    }
	}

