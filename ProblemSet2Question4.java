import java.io.*;
import java.util.Scanner;

class multiple {
public static void main(String args[]) {

	// Variables
	int num1;
	int num2;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer here: ");
  	num1 = in.nextInt();
  	
  	System.out.println("Enter another integer here: ");
  	num2 = in.nextInt();

// Remainder loops
if (num1 % num2 == 0) {
	System.out.println("The first number is a multiple of the second number");
}

if (num1 % num2 != 0) {
	System.out.println("The first number is not a multiple of the second number");
}
} /* main */
} // multiple