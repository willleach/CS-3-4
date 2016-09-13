import java.io.*;
import java.util.Scanner;

class PrimeFact {

	// Decides if number is prime or not
static int Prime(int number) {

	System.out.println("Prime Factor:       Number of them:");
	
	// Variables
	int count;
    
for (int i = 2; i <= (number); i++) {

    count = 0;
            
while (number % i == 0) {

    number = (number / i);
    count++;
                
if (count == 0) {

    continue;
}
}
    System.out.println("      " + i+ "                    " + count);
}

	 return number;
   
} // Static Method

public static void main(String args[]) {

	// Scanner
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter an integer here: ");
	int number = in.nextInt();
	
	number = Prime(number);

} // main
	
} // PrimeTime

