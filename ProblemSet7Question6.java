import java.io.*;
import java.util.Scanner;
import java.util.Random;

class insertion2 {
public static void main(String args[]) {

	// Variable
	int num = 0;
	float median = 0;
	
	// Random Number Generator
  	Random randomGenerator = new Random();
  	
  	// Scanner
 	Scanner in = new Scanner(System.in);
	
	// Creates an array
	int array[] = new int [13];
	
// For loop that randomly indexes the array
for (int i = 0; i < 13; i++) {
	
	int j = 0;
	j = i + 1;
	System.out.println("Index an array of 13 here: " + j);
  	num = in.nextInt();
	
	array[i] = num;

}

	
	// Solving for median
	median = ((array[6] + array[7]) / 2);
	System.out.println("The median of the array is: " + median);
	

} // main
} // bubble sort 2



