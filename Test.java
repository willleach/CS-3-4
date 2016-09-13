import java.io.*;
import java.util.Scanner;

class pattern2 {
public static void main(String args[]) {
	
	// Variables
	int number;
	int count;
	
    // Scanner
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a positive number: ");
    number = in.nextInt();
    
for (int i = 2; i <= (number); i++) {

    count = 0;
            
while (number % i == 0) {

    number /= i;
    count++;
                
if (count == 0) {

    continue;
}
}
    System.out.println(i+ "**" + count);
}

	
} // main
} // pattern2