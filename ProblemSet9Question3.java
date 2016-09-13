import java.io.*;
import java.util.Scanner;
import java.util.Random;

class Probability {

	// Creates an array
	static double array[] = new double [100];

// Fills Array
public static void fill_array() {
	
	// Scanner
	Scanner in = new Scanner(System.in);
	
	
	
// For loop that randomly indexes the array
for (int i = 0; i < 100; i++) {
	
	int j = 0;
	j = i + 1;
	
 	Random randomGenerator = new Random();
    int num = randomGenerator.nextInt(2);
    
	array[i] = num;
	
    		  
}	

}

	// Finds the probability of six or more
public static boolean prob_of_six_or_more(double array[]) {

	// Variables
	boolean six = false;
	int counter = 1;
	double temp = array[0];

for (int k = 1; k < array.length; k++) {

 if (array[k] == temp) {

	++counter;
	
    if (counter == 6) {
	
	   six = true;
	   return true;

    }

 
 } else {
  
    temp = array[k];
    counter = 1;
   }
    		  
    		  
}	

	return false;

}

public static void main(String args[]) {


	// Scanner
	Scanner in = new Scanner(System.in);

	// Variables
	double prob;
	double counter2 = 0;
	boolean six;
  	
for (int h = 1; h < 10000001; h++) {
		
		fill_array();
		six = prob_of_six_or_more(array);

if (six == true) {

	counter2++;
	
}
		
}
	
	System.out.println(counter2);
	prob = (counter2/10000000.0);
	System.out.println("The probability of six or more is: " +  prob);
	
	
	System.out.println();
	
} // main
	
} // Probability