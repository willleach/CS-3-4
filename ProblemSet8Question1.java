import java.io.*;
import java.util.Scanner;

class SmallestNum {

		// Calculates smallest number
static int SmallestNumber(int num1, int num2, int num3) {

	// Variables
	int temp = 0;
	int smallest;
	
	// Define Array
	int array[] = new int [3];
	
	// Index array
	array[0] = num1;
	array[1] = num2;
	array[2] = num3;
	
// Sort array	
for (int k = 0; k < array.length; k++) {

for (int j = (array.length - 1); j > k; j--) {

if (array[j] < array[j - 1]) {
	
	temp = array[j - 1];
	array[j - 1] = array[j];
	array[j] = temp;
	
}
}
}       
	smallest = array[0];
	
    return smallest;
   
} // Static Method

public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter an integer here: ");
	int num1 = in.nextInt();
	
	System.out.println("Enter an integer here: ");
	int num2 = in.nextInt();
	
	System.out.println("Enter an integer here: ");
	int num3 = in.nextInt();
	
	int smallest = SmallestNumber(num1, num2, num3);
	
	 System.out.println("The smallest number is: " + smallest);
	
} // maint
	
} // SmallestNum



