import java.io.*;
import java.util.Scanner;

class Interest2 {
public static void main(String args[]) {

	// Variables
	double money = 0;
	double amount;
	double prate;
	double rate = 0;
	double monthly;

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter the initial amount of money in your savings account here:");
  	amount = in.nextInt();
  	
  	System.out.println("Enter the rate in percentage form that your money will grow at here:");
  	prate = in.nextInt();
  	
  	System.out.println("Enter the amount of money you want to put in every month here:");
  	monthly = in.nextInt();
	
	// Calculate rate
	rate = (prate / 100) + 1;
	
	money = (amount * Math.pow(rate, 30));
	
	System.out.println("Your total money after 30 years is: " + "$" + money);	
	
	money = 0;
	rate = ((prate / 1200) + 1);
	
// Calculate monthly money
for (int i = 360; i > 0; i--) {

	money = (amount * rate);
	amount = money + monthly;
	
}
	System.out.println("Your total money after 30 years with monthly deposits is: " + "$" + money);
	System.out.print("\n");
	
} // main
} // Interest2
