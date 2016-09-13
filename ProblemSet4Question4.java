import java.io.*;
import java.util.Scanner;

class reciprocal {
public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);

	// Variables
	int loopnum;
	loopnum = 1;
	float num = -1;
	float sum = 0;

// Keep entering numbers
while (loopnum >= 1) {

 	System.out.println("Enter a number in here. When you are done, enter zero.");
  	num = in.nextFloat();
	int verification;
	
// Verification
if (num == 0) {

		System.out.println("Are you done entering numbers? Enter 1 for Yes or 2 for No:");
		verification = in.nextInt();
		
if (verification == 1) {

			loopnum = -1;
			break;
}

if (verification == 0) {

		num = 1;
}

}
	sum = sum+1/num;
}
	System.out.println("The sum is " + sum);

	} // main
} // reciprocal