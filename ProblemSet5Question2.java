import java.io.*;
import java.util.Scanner;

class pattern {
public static void main(String args[]) {

	// Variables
	int num;
	int num2;
	int i;
	int rownum;

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter an integer here:");
 	
  	num = in.nextInt();
  	num2 = num;
	i = 0;
	rownum = 1;
	
// Loops until all rows are done
while (num > i) {

// Prints rows
for (int j = 0; j < rownum; j++) {
	System.out.print(num2);
	System.out.print("\t");	
		
}
	
	System.out.print("\n");	
	rownum++;
	num2--;
	i++;
	
}
} // main
} // pattern