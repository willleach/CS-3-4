import java.io.*;
import java.util.Scanner;

class additup {
public static void main(String args[]) {

	// Variables
	int num;
	int i = 0;
	int sum = 0;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter an integer here:");
  	num = in.nextInt();

// Running sum
while (num > i + 1) {

	i++;
	sum = sum + i;
	System.out.print(i + " + ");
	
}
i++;

	sum = (sum * i);
	System.out.print(i);
	System.out.print(" = " + sum + " ");
	
} /* main */
} // number