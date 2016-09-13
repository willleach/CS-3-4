import java.io.*;
import java.util.Scanner;

class number {
public static void main(String args[]) {

	//  Variables
	int firstnumber;
	int secondnumber;
	int sum;
	int difference;
	int product;
	float quotient;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter one number here: ");
 	firstnumber = in.nextInt();
 	
	System.out.println("Enter one number here: ");
  	secondnumber = in.nextInt();
  	
  	// Calculations!
	sum = firstnumber + secondnumber;
	difference = firstnumber - secondnumber;
	product = firstnumber * secondnumber;
	quotient = firstnumber/secondnumber;
	
	// Print!
	System.out.println("The sum is " + sum);
	System.out.println("The difference is " + difference);
	System.out.println("The product is " + product);
	System.out.println("The quotient is " + quotient);
	
} /* main */
} // number

