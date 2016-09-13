import java.io.*;
import java.util.Scanner;

class mileage {
public static void main(String args[]) {

	// Variables
	int startmileage;
	int startgas;
	int endmileage;
	int endgas;
	int mileage;
	int gas;
	float gasconsumption;
	
	// Scanner
	Scanner in = new Scanner(System.in);
	System.out.println("Miles at the start of the drive, enter here:");
  	startmileage = in.nextInt();
  
	System.out.println("Miles at the end of the drive, enter here:");
  	endmileage = in.nextInt();
  
	System.out.println("Gas at the start of the drive, enter here:");
  	startgas = in.nextInt();
  
	System.out.println("Gas at the end of the drive, enter here:");
	endgas = in.nextInt();
  
  	// Calculations
	mileage = endmileage - startmileage;
	gas = startgas - endgas;
	gasconsumption = mileage/gas;

	// Print!
	System.out.println("The gas consumption of the car is" + gasconsumption);

} /* main */
} // num
