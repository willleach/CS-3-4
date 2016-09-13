import java.io.*;
import java.util.Scanner;

class Fibonacci {
public static void main(String args[]) {

	// Variables
	double ans2 = 0;
	int ans3;
	int num;

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter the nth number of the fibonacci sequence here:");
  	num = in.nextInt();
	
// Loops until the nth Fibonacci number is found
for (int num2 = 0; num2 < (num + 1); num2++) {

	ans2 = ((Math.pow(1.6180339, num2)/ Math.sqrt(5)) + (-(Math.pow(-0.6180339, num2))/ Math.sqrt(5)));
	ans3 = (int)Math.round(ans2);
	System.out.print(ans3 + " ");
	
}
	
System.out.print("\n");

} // main
} // Fibonacci
