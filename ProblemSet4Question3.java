import java.io.*;
import java.util.Scanner;

class gradeavg2 {
public static void main(String args[]) {

	// Variables
	int grade = 0;
	int i = 0;
	int num = 0;
	int sum = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int f = 0;

// Categorizing grades		
while (grade > -1) {

if (grade != -1) {

if (grade < 60) {

	++f;
}

if ((grade >= 60) && (grade < 70)) {

	++d;
}

if ((grade >= 70) && (grade < 80)) {

	++c;
}

if ((grade >= 80) && (grade < 90)) {

	++b;
}

if (grade >= 90) {

	++a;
}

}
	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter a grade here:");
  	grade = in.nextInt();

// Running sum  	
if (grade != -1) {

  	i++;
  	sum = grade + sum;
  	
}
}
	// Average
	int average;
	average = sum/i;
	System.out.print("The class average is: " + average);
	
// Class average
if (average < 60) {

	System.out.println(" F ");
}

if ((average >= 60) && (average < 70)) {

System.out.println(" D ");
}

if ((average >= 70) && (average < 80)) {

System.out.println(" C ");
}

if ((average >= 80) && (average < 90)) {

System.out.println(" B ");
}

if (average >= 90) {

System.out.println(" A ");
}


f = f - 1;

System.out.println("The number of A's are: " + a);
System.out.println("The number of B's are: " + b);
System.out.println("The number of C's are: " + c);
System.out.println("The number of D's are: " + d);
System.out.println("The number of F's are: " + f);
} /* main */
} // gradeavg2