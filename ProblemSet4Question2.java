import java.io.*;
import java.util.Scanner;

class gradeavg {
public static void main(String args[]) {

	// Variables
	int grade = 0;
	int i = 0;
	int num = 0;
	int sum = 0;
	
// Loop to take in grades
while (grade > -1) {

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter a grade here:");
  	grade = in.nextInt();
  	
  	if (grade != -1) {
  	i++;
  	sum = grade + sum; // Running sum
  }
}
	// Average
	int average;
	average = sum/i;
	System.out.println("The class average is: " + average);

// Organizing grades	
if (average < 60) {

	System.out.print(" F ");
	
}

if ((average >= 60) && (average < 70)) {

System.out.print(" D ");

}

if ((average >= 70) && (average < 80)) {

System.out.print(" C ");

}

if ((average >= 80) && (average < 90)) {

System.out.print(" B ");

}

if (average >= 90) {

System.out.print(" A ");

}

} /* main */
} // gradeavg