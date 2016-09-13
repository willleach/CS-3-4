import java.io.*;
import java.util.Scanner;

class grade {
public static void main(String args[]) {

	// Variables
	float total;
	float score;
	float grade;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter the total points in an exam here: ");
  	total = in.nextFloat();
  	
	System.out.println("Enter your score here: ");
  	score = in.nextFloat();
  	
  	// Calculate grade
	grade = (score/total) * 100;
	
// Loop options
if (grade < 60) {
	System.out.println("F");
}

if ((grade >= 60) && (grade < 70)) {
	System.out.println("D");
}

if ((grade >= 70) && (grade < 80)) {
	System.out.println("C");
}

if ((grade >= 80) && (grade < 90)) {
	System.out.println("B");
}

if (grade >= 90) {
	System.out.println("A");
}

} /* main */
} // grade