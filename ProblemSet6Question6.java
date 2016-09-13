import java.io.*;
import java.util.Scanner;

class pattern2 {
public static void main(String args[]) {
	
	// Variables
	int height;
	int width;
	int j = 0;
	
	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter the height of a rectangle here:");
  	height = in.nextInt();
  	
  	j = (height - 2);
	
 	System.out.println("Enter the width of a rectangle here:");
  	width = in.nextInt();
  	
// If the height and width is greater than 1, than execute
if ((height > 1) & (width > 1)) {	

// Print the top line
for (int i = 0; i < width; i++) {

	System.out.print("*");	
	
}
	System.out.print("\n");
	
// Print middle lines
for (; j > 0; j--) {
	
for (int m = 0; m < (width/2); m++) {

	System.out.print("*");	
	
	System.out.print("0");	
	
}
if (width % 2 != 0) {

	System.out.print("*");
	
}

	System.out.print("\n");
	
}
}

// If the height is 1 and the width is greater than 1 print...
else if ((height == 1) & (width > 1)) {

for (int l = 0; width > l; l++) {

	System.out.print("*");
	
}
}
	
// If the height is greater than 1 and the width is 1 print...	
else if ((height > 1) & (width == 1)) {

for (int h = 0; height > h; h++) {

	System.out.print("*");
	System.out.print("\n");
	
}
}
	
// If the height is 1 and the width is 1 print...	
else if ((height == 1) & (width == 1)) {

	System.out.print("*");
	
}
// Print last line
for (int i = 0; i < width; i++) {

	System.out.print("*");	
	
}
	
	System.out.print("\n");
	
} // main
} // pattern2