import java.io.*;
import java.util.Scanner;

class BC2 {

public static void main(String args[]) {
	
	// Variables
	int digit;
	int num = 0;
	int a = 0;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	
	// Creates an array
	int array[] = new int [12];
	
// For loop that indexes the array
for (int i = 0; i < 12; i++) {
	
	System.out.println("Enter digit number, enter -1 if blank ");
  	digit = in.nextInt();
	
	if (digit == -1) {
	
	a = i;
	
	
	}
	array[i] = digit;
	
	

}

if (a%2 == 0) {

num = (10 - (((3 * array[0]) + (array[1]) + (3 * array[2]) + (array[3]) + (3 * array[4]) + (array[5]) + (3 * array[6]) 
	+ (array[7]) + (3 * array[8]) + (array[9]) + (3 * array[10]) + (array[11]) - (3 * array[a])) % 10));

}
if (a/2 != 0) {

num = (10 - (((3 * array[0]) + (array[1]) + (3 * array[2]) + (array[3]) + (3 * array[4]) + (array[5]) + (3 * array[6]) 
	+ (array[7]) + (3 * array[8]) + (array[9]) + (3 * array[10]) + (array[11]) - (array[a])) % 10));

}
	
	
	System.out.println("The missing digit is: " + num);

} // main
	
} // PayTable



