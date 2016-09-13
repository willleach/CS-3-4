import java.io.*;
import java.util.Scanner;

class even {
public static void main(String args[]) {

	// Variable
	int num;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer here: ");
  	num = in.nextInt();
 
// Remainder loops 	
if (num % 2 == 0) {
	System.out.println("The number is even");
}

if (num % 2 != 0) {
	System.out.println("The number is odd");
}

} /* main */
} // even