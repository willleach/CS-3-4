import java.io.*;
import java.util.Scanner;

class Perfect {

	// Finds perfect numbers
public static boolean Perfect(long num1) {

	// Variables
	boolean perfect;
	int temp = 0;

// Finds divisors of num1  
for (int i = 1; i < num1; i++) {

	if (num1 % i == 0) {
	
		temp = temp + i;
	
	}

}	

    if (temp == num1) {
            
            perfect = true;
            
        } else {
        
            perfect = false;
            
        }
    		  return perfect;
}	

public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);

	// Variables
	long num1;
	boolean perfect;
  	
	System.out.println("The perfect numbers between 1 and 1000 are:");
	
for (int j = 1; j < 1000; j++) {

	perfect = Perfect(j);
	if (perfect == true) {
	
		System.out.print(" " + j);
	
		}
	}
	
	System.out.println();
	
} // main
	
} // SmallestNum