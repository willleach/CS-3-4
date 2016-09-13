import java.io.*;
import java.util.Scanner;
import java.util.Random;

class insertion2 {
public static void main(String args[]) {

	// Variables
    int num;
    int i;
     
    // Random Number Generator
  	Random randomGenerator = new Random();
	
    // Create an array 
    int array[] = new int [20];

// For loop that randomly indexes the array
for (int k = 0; k < 20; k++) {
	
	num = randomGenerator.nextInt(1000);
	array[k] = num;
	
}

for (int h = 0; h < 20; h++) {

	 System.out.println(array[h]);

}

for (int j = 1; j < array.length; j++) {

    num = array[j];
           
for (i = (j - 1); ((i >= 0) && (array[i] > num)); i--) {

    array[i + 1] = array[i];
                 
}

    array[i + 1] = num;
         
}

	System.out.println("\n");
	
for (int l = 0; l < 20; l++) {

	 System.out.println(array[l]);

}

	System.out.println("\n");

     
} // main
} // bubble sort 2



