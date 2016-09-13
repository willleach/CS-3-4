import java.io.*;
import java.util.Scanner;
import java.util.Random;

class dart {
public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);

	// Variables
	double d;
	double xcor;
	double ycor;
	double num;
	float areaofcircle = 0;
	long totaldartsincircle = 0;
	long totaldarts = 0;
	double pi = 0;

	// Random Number Generator
  	Random randomGenerator = new Random();

    // The user enters in the number of darts thrown
    System.out.println("Enter the number of dart throws here:");
    num = in.nextInt();
    	
for (int i = 0; i < num; i++) {

	// This for loop generates the amount of random numbers that the user wants
    xcor = randomGenerator.nextDouble();
    ycor = randomGenerator.nextDouble();
    d = Math.sqrt((xcor * xcor) + (ycor * ycor));
      
if (d < 1) {

	// If the distance is less than one than the dart hit inside the circle
    ++totaldartsincircle;
    ++totaldarts;
      
}

if (d > 1) {

	// If the distance is greater than one than the dart hit outside the circle
    ++totaldarts;
      
}
}
	
	// This calculates the area of the circle and converts it to a float
	areaofcircle = (((float)totaldartsincircle / (float)totaldarts) * 4.0f);
	pi = (areaofcircle);
	System.out.println(pi);
	
} // main
} // dart
