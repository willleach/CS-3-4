import java.io.*;
import java.util.Scanner;

class BC {

public static void main(String args[]) {
	
	// Variables
	int digit;
	int num = 0;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	
	// Creates an array
	int array[] = new int [11];
	
// For loop that randomly indexes the array
for (int i = 0; i < 11; i++) {
	
	System.out.println("Enter digit number " + (i + 1));
  	digit = in.nextInt();
	
	array[i] = digit;

}

	num = (10 - (((3 * array[0]) + (array[1]) + (3 * array[2]) + (array[3]) + (3 * array[4]) + (array[5]) + (3 * array[6]) 
	+ (array[7]) + (3 * array[8]) + (array[9]) + (3 * array[10])) % 10));
	
	System.out.println("The 12th digit is: " + num);

} // main
	
} // PayTable



