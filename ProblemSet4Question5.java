import java.io.*;
import java.util.Scanner;

class LCM {
public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);

	// Variables
	int i = 2;
	int i2 = 1000;
	long num = -1;
	long num2 = -1;
	long num3 = -1;
	long num4 = -1;
	int LCM = -1;
	int GCD = -1;

	System.out.println("Enter an integer here:");
  	num = in.nextInt();
  	
	System.out.println("Enter another integer here:");
  	num2 = in.nextInt();

// LCM
for (; i >= 2; i++) {

  	if ((i % num == 0) & (i % num2 == 0))  {
  	
	LCM = i;
	break;
}
	
}
	System.out.println("The Least Common Multiple is " + LCM);
	
	num3 = num;
	num4 = num2;
	
// Check all numbers
for (; i2 <= 100000000; i2--) {

// GCD
if ((num3 % i2 == 0) & (num4 % i2 == 0))  {

	GCD = i2;
	break;
}
	
	}
	System.out.println("The Greatest Common Divisor is " + GCD);
	} // main
} // LCM