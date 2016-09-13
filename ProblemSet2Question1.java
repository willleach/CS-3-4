import java.io.*;
import java.util.Scanner;

class bmi {
public static void main(String args[]) {

	// Variables
	int weight;
	int height;
	float bmi;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter your weight in pounds here: ");
  	weight = in.nextInt();
  	
	System.out.println("Enter your height in inches here: ");
  	height = in.nextInt();
  	
  	// bmi calculation
	bmi = (weight * 703)/(height * height);

// Loop options!
if (bmi < 18.5f) {
	System.out.println("You are Underweight");
}

if ((bmi >= 18.5f) & (bmi <= 25f)) {
	System.out.println("You are Normal");
}

if ((bmi > 25f) & (bmi <= 30f)) {
	System.out.println("You are Overweight");
}

if (bmi > 30f) {
	System.out.println("You are Obese");
}

} /* main */
} // bmi