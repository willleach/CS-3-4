import java.io.*;
import java.util.Scanner;

class factorials {
public static void main(String args[]) {

	// Variables
	int num;
	int num2;
	int num3;
	int num4;
	int i;
	int l = 0;
	int sum = 1;

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter an integer here:");
  	num = in.nextInt();
  	
  	num2 = num;
  	num3  = num2;
  	num4 = num3;
	i = 0;
	
// Loops until all rows of factorials are covered
while (num > i) {

	System.out.print(num4 + "!" + " = " + num4);
	
// Loops for a part of the factorial layout
for (int k = 1; k < num3; k++) {

	--num2;
	System.out.print(" x " + num2);
	sum = (sum * (num2 + 1));
	
}
	// increments and decrements
	i++;
	num2--;
	--num4;
	System.out.print(" = " + sum);
	System.out.print("\n");
	num2 = num4;
	num3--;
	sum = 1;
	
}

System.out.print("\n");

} // main
} // factorials