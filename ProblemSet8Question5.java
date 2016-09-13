import java.io.*;
import java.util.Scanner;

class AdvRectangle {

	// Makes a rectangle
public static void Rectangle(int width, int height, char character) {

	// Variables
	int k;
	char rectangle;

// If the height and width is greater than 1, than execute
if ((height > 1) & (width > 1)) {	

// Print first line
for (int j = 0; j < width; j++) {

	System.out.print(character);	
	
}
	
	System.out.print("\n");
	
// Print middle lines
for (k = height - 2; k > 0; k--) {

	System.out.print(character);	
	
for (int i = 0; i < (width-2); i++) {
	
	System.out.print(character);	
		
}		
	
	System.out.print(character);
	System.out.print("\n");
	
}

// Print last line
for (int j = 0; j < width; j++) {

	System.out.print(character);	
	
}
	
	System.out.print("\n");	
	
}

// If the height is 1 and the width is greater than 1 print...	
else if ((height == 1) & (width > 1)) {

for (int l = 0; width > l; l++) {

	System.out.print(character);
	
}
}
// If the height is greater than 1 and the width is 1 print...		
else if ((height > 1) & (width == 1)) {

for (int h = 0; height > h; h++) {

	System.out.print(character);
	System.out.print("\n");
	
}
}
// If the height is 1 and the width is 1 print...	
else if ((height == 1) & (width == 1)) {

	System.out.print(character);
	
}

	System.out.print("\n");
    
}	

public static void main(String args[]) {

	int width = 0;
	
while (width != -1) {

	// Variables
	int height;
	char character;
	
	// Scanner
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a width here: ");
  	width = in.nextInt();
  	
  	System.out.println("Enter a height here: ");
  	height = in.nextInt();
  	
  	System.out.println("Enter a character here: ");
  	character = in.next().charAt(0);
	
	Rectangle(width, height, character);
	
	} // While Loop
	} // main
	
} // SmallestNum