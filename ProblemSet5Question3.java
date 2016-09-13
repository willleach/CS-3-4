import java.io.*;
import java.util.Scanner;

class rectangle {
public static void main(String args[]) {

	// Variables
	int height;
	int width;
	int i = 0;
	int j = 0;
	int k = 0;

	// Scanner
 	Scanner in = new Scanner(System.in);
 	System.out.println("Enter the height of a rectangle here:");
  	height = in.nextInt();
  	
  	k = height - 2;

 	System.out.println("Enter the width of a rectangle here:");
  	width = in.nextInt();
  	
// If the height and width is greater than 1, than execute
if ((height > 1) & (width > 1)) {	

// Print first line
for (; j < width; j++) {

	System.out.print("*");	
	
}
	
	System.out.print("\n");
	
// Print middle lines
for (k = height - 2; k > 0; k--) {

	System.out.print("*");	
	
for (i = 0; i < (width-2); i++) {
	
	System.out.print(" ");	
		
}		
	
	System.out.print("*");
	System.out.print("\n");
	
}
	
j = 0;

// Print last line
for (; j < width; j++) {

	System.out.print("*");	
	
}
	
	System.out.print("\n");	
	
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

	System.out.print("\n");
	
} // main
} // rectangle