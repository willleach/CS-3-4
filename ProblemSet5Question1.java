import java.io.*;
import java.util.Scanner;
import java.util.Random;

class Guess {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);

	// Variables
	int i = 1;
	int guess = -1;
	int idx;

	// Random number generator
  	Random randomGenerator = new Random();

// Creates random number
for (idx = 1; idx == 1;){

	int answer = randomGenerator.nextInt(1000);

// Start guessing!      
for (; i >= 1; i++) {

	System.out.println("Guess a number between 1 - 1000:");
  	guess = in.nextInt();

// Profiling guesses
if ((guess < 1) | (guess > 1000)) {

  	System.out.println("That is not a number between 1 and 1000. Please try again.");
  	
}
// Correct! 	
if ((guess > 0) & (guess < 1001)) {
  	
if (guess == answer)  {

  	System.out.println("Correct! Congratulations!");
  	break;
  	
}
if (guess > answer)  {

  	System.out.println("Too high!");
  	
}
if (guess < answer)  {

  	System.out.println("Too low!");
  	
}  	
}
}
	
	System.out.println("You guessed " + i + " times!");
	System.exit(0);
	
}
} // main
} // Guess