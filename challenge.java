import java.io.*;
import java.util.Scanner;
class challenge {
public static void main(String args[]) {
int num;
int num1;
int num2;
int num3;
int num4;
int num5;
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter a five digit number: ");
  	num = in.nextInt();
  num1 = num / 10000;
  num2 = (num / 1000) - (num1 * 10);
  num3 = (num / 100) - (num1 * 100) - (num2 * 10);
  num4 = (num / 10) - (num1 * 1000) - (num2 * 100) - (num3 * 10);
  num5 = (num) - (num1 * 10000) - (num2 * 1000) - (num3 * 100) - (num4 * 10);
  System.out.println(num1 + "  " + num2 + "  " + num3 + "  " + num4 + "  " + num5);
} /* main */
} // number