import java.io.*;
import java.util.Scanner;

class NxM {
public static void main(String args[]) {

	// Variables
	int rlength;
	int clength;
	int num = 1;

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter in a column length here:");
  	clength = in.nextInt();
  	
 	System.out.println("Enter in a row length here:");
  	rlength = in.nextInjt();

// Manages row length
for (int num4 = 1; num4 <= rlength; num4++) {

// Manages column length
for (int num3 = 1; num3 <= clength; num3++) {

	num = (num3 * num4);
	System.out.print(num + "\t");
	
}	
	System.out.print("\n");
}
	System.out.print("\n");	
	
} // main
} // NxM