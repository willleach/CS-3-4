import java.io.*;
import java.util.Scanner;

class pyth {
public static void main(String args[]) {

	// Variables
	double a;
	double b;
	double c;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Input numbers for two of the three sides below, enter -1 for the unknown side.");
	System.out.println("Enter A here: ");
  	a = in.nextDouble();
  	
  	System.out.println("Enter B here: ");
  	b = in.nextDouble();
  	
  	System.out.println("Enter C here: ");
  	c = in.nextDouble();

// Unknown side calculation	
if (a == -1.0d) {
	a = Math.sqrt((c*c) - (b*b));
	System.out.println("Side A is:" + a );
}
if (b == -1.0d) {
	b = Math.sqrt((c*c) - (a*a));
	System.out.println("Side B is:" + b );
}	
if (c == -1.0d) {
	c = Math.sqrt((a*a) + (b*b));
	System.out.println("Side C is:" + c );
}
} /* main */
} // pyth