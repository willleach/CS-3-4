import java.io.*;
import java.util.Scanner;
class quad {
public static void main(String args[]) {
double root1;
double root2;
double doubleroot;
double imaginary;
double roots;
int a;
int b;
int c;
 	Scanner in = new Scanner(System.in);
	System.out.println("Enter A here: ");
  	a = in.nextInt();
  	System.out.println("Enter B here: ");
  	b = in.nextInt();
  	System.out.println("Enter C here: ");
  	c = in.nextInt();
  	roots = ((b * b) - 4 * (a) * (c));
  	
if (roots > 0) {
	root1 = (-b + Math.sqrt((b * b) - 4 * (a) * (c)))/2 * (a);
  	root2 = (-b - Math.sqrt((b * b) - 4 * (a) * (c)))/2 * (a);
	System.out.println("There are two real roots, they are:" + root1 + "and" + root2 );
}
if (roots == 0) {
	doubleroot = -b/2 * (a);
	System.out.println("There is one real root, it is:" + doubleroot);
}
if (roots < 0) {
	System.out.println("The roots are imaginary");
}
} /* main */
} // number