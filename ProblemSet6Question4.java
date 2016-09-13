import java.io.*;
import java.util.Scanner;
class Interest {
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
	
	// Calculate Rate
	rate = (prate / 100) + 1;
	
	money = (amount * Math.pow(rate, 30));
	
	// Print money
	System.out.print("Your total money after 30 years is: " + "$" + money);	
	System.out.print("\n");
	
} // main
} // Interest
