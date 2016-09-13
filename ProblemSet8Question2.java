import java.io.*;
import java.util.Scanner;

class PrimeTime {

		// Decides if number is prime or not
static boolean Prime(int num1) {

	// Variables
	boolean prime;

// Loop that tests the division of number
for (int i = (num1 - 1); i > 1; i--) {

	if ((num1 % i) != 0) {
	
	prime = true;
	
	}	
	
	if ((num1 % i) == 0) {
	
	prime = false;
	return false;
	
	}	

}

	return true;
   
} // Static Method

public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter an integer here: ");
	int num1 = in.nextInt();
	
	boolean prime = Prime(num1);
	System.out.println(prime);
	
if (prime == true) {
	
	System.out.println("The number is a prime number");
	
}

if (prime == false) {
	
	System.out.println("The number is not a prime number");
	
}

} // main
	
} // PrimeTime



