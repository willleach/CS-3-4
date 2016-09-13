import java.io.*;
import java.util.Scanner;

class TempChanger {

	// Converts Fahrenheit to Celsius
public static double Fahrenheit(double f) {

	// Variables
	double c;
	
	c = (f - 32)/(1.8);
		
    return c;
    
}	

// Converts Celsius to Fahrenheit
public static double Celsius(double c) {
	
	// Variables
	double f;
	
	f = (c * 1.8) + 32;
		
    return f;
    
}	

public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);

	// Variables
	double num1;
	
	System.out.println("Enter an integer here: ");
  	num1 = in.nextDouble();
	
for (int i = 0; i < 1000000; i++) {
	
	double Celsius = Fahrenheit(num1);
	double Fahrenheit = Celsius(num1);
	
}

	System.out.println("The number after the conversions is: " + Fahrenheit);
	
	} // main
	
} // SmallestNum