import java.io.*;
import java.util.Scanner;

class circumference {
public static void main(String args[]) {

	// Variables
	int radius;
	float pi = 3.14159f;
	float circumference;
	
	// Scanner
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the radius of a circle here:");
  	radius = in.nextInt();
  	
  	// Calculations and Printing!
	circumference = radius * 2 * pi;
	System.out.println("The circumference is " + circumference);

} /* main */
} // num

