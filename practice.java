import java.util.Scanner;
 
class ReverseNumber {

// Reverses number
public static long Reversed(long num1) {

	// Variables
	long reverse = 0;
 
while (num1 != 0) {

        reverse = (reverse * 10);
        reverse = (reverse + (num1 % 10));
        num1 = (num1 / 10);
          
      }
 		return reverse;
}	

   public static void main(String args[]) {
   	
	// Variables
	long reverse = 0;
	long num1;
 
 	// Scanner
    Scanner in = new Scanner(System.in);
      
    System.out.println("Enter a number here: ");
    num1 = in.nextInt();
 		
	reverse = Reversed(num1);
	
    System.out.println("The reverse of your entered number is: " + reverse);
      
   } // main
} // class