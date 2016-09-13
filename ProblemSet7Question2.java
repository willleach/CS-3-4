import java.io.*;
import java.util.Scanner;
import java.util.Random;

class bubblesort2 {
public static void main(String args[]) {

	// Variables
	int num = 0;
	int temp = 0;
	
	// Random Number Generator
  	Random randomGenerator = new Random();
	
	// Creates an array
	int array[] = new int [20];
	
// For loop that randomly indexes the array
for (int i = 0; i < 20; i++) {
	
	num = randomGenerator.nextInt(1000);
	array[i] = num;
	
}

for (int l = 0; l < 20; l++) {

	 System.out.println(array[l]);

}

for (int k = 0; k < array.length; k++) {
for (int j = (array.length - 1); j > k; j--) {
if (array[j] < array[j - 1]) {
	
	temp = array[j - 1];
	array[j - 1] = array[j];
	array[j] = temp;
	
}
}
}

	System.out.println("\n");
	
for (int h = 0; h < 20; h++) {

	 System.out.println(array[h]);

}

} // main
} // bubble sort 2



