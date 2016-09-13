import java.io.*;
import java.util.Scanner;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import java.lang.Object;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle; 
import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.*;

public class BC4 extends Application {

StackPane pane;
String num;
int numarray[];
Rectangle rectangles[];

public static void main(String args[]) {

	launch(args);

} // main


public static Rectangle[] createrectangle(int[] numarray, HBox Hbox ) {
	
	
	Rectangle rectangles[] = new Rectangle[84];

	//Code
	//int [][] lh = new int [10][7];
	int [][] lh = {
	{0, 0, 0, 1, 1, 0, 1}, //0
	{0, 0, 1, 1, 0, 0, 1}, //1
	{0, 0, 1, 0, 0, 1, 1}, //2
	{0, 1, 1, 1, 1, 0, 1}, //3
	{0, 1, 0, 0, 0, 1, 1}, //4
	{0, 1, 1, 0, 0, 0, 1}, //5
	{0, 1, 0, 1, 1, 1, 1}, //6
	{0, 1, 1, 1, 0, 1, 1}, //7
	{0, 1, 1, 0, 1, 1, 1}, //8
	{0, 0, 0, 1, 0, 1, 1}}; //9
	
	
	
//	int [][] rh = new int [10][7];
	int [][] rh = {
	{1, 1, 1, 0, 0, 1, 0}, //0
	{1, 1, 0, 0, 1, 1, 0}, //1
	{1, 1, 0, 1, 1, 0, 0}, //2
	{1, 0, 0, 0, 0, 1, 0}, //3
	{1, 0, 1, 1, 1, 0, 0}, //4
	{1, 0, 0, 1, 1, 1, 0}, //5
	{1, 0, 1, 0, 0, 0, 0}, //6
	{1, 0, 0, 0, 1, 0, 0}, //7
	{1, 0, 0, 1, 0, 0, 0}, //8
	{1, 1, 1, 0, 1, 0, 0}}; //9
	
	for (int jk = 0; jk < rectangles.length / 2; jk++)
	{
		rectangles[jk] = new Rectangle(((4 * jk) + 16), 10, 4, 100);																																																																																																																																																																																																																																									
	}
	for (int jk = rectangles.length / 2; jk < rectangles.length - 1; jk++)
	{
		rectangles[jk] = new Rectangle(((4 * jk) + 200), 10, 4, 100);
	}
/*	
Rectangle r1 = new Rectangle(0, 10, 4, 120);
Rectangle r2 = new Rectangle(4, 10, 4, 120);
Rectangle r3 = new Rectangle(8, 10, 4, 120);
Rectangle r4 = new Rectangle(12, 10, 4, 120);
Rectangle r5 = new Rectangle(180, 10, 4, 120);
Rectangle r6 = new Rectangle(184, 10, 4, 120);
Rectangle r7 = new Rectangle(188, 10, 4, 120);
Rectangle r8 = new Rectangle(192, 10, 4, 120);
Rectangle r9 = new Rectangle(196, 10, 4, 120);
Rectangle r10 = new Rectangle(rectangles.length * 4 + 36, 10, 4, 120);
Rectangle r11 = new Rectangle(rectangles.length * 4 + 40, 10, 4, 120);
Rectangle r12 = new Rectangle(rectangles.length * 4 + 44, 10, 4, 120);
Rectangle r13 = new Rectangle(rectangles.length * 4 + 48, 10, 4, 120);
*/

Rectangle r1 = new Rectangle(0, 10, 4, 120);
Rectangle r2 = new Rectangle(4, 10, 4, 120);
Rectangle r3 = new Rectangle(8, 10, 4, 120);
Rectangle r4 = new Rectangle(12, 10, 4, 120);
Rectangle r5 = new Rectangle(180, 10, 4, 120);
Rectangle r6 = new Rectangle(184, 10, 4, 120);
Rectangle r7 = new Rectangle(188, 10, 4, 120);
Rectangle r8 = new Rectangle(192, 10, 4, 120);
Rectangle r9 = new Rectangle(196, 10, 4, 120);
Rectangle r10 = new Rectangle(rectangles.length * 4 + 36, 10, 4, 120);
Rectangle r11 = new Rectangle(rectangles.length * 4 + 40, 10, 4, 120);
Rectangle r12 = new Rectangle(rectangles.length * 4 + 44, 10, 4, 120);
Rectangle r13 = new Rectangle(rectangles.length * 4 + 48, 10, 4, 120);

for (int jk = 0; jk < rectangles.length; jk++)
{
	rectangles[jk] = new Rectangle(0, 0, 4, 100);
}


		r1.setFill(Color.BLACK);
		r2.setFill(Color.WHITE);
		r3.setFill(Color.BLACK);
		r4.setFill(Color.WHITE);

		
    for (int k = 0; k < 12; k++) {
	     if (k < 6) {
	     
		if (numarray[k] == 0) {
		System.out.println("k: " + k);
			for (int l = 0; l < 7; l++) {
			
				if (lh[0][l] == 0) {
				
					// create and paint rectangles
				System.out.println("l: " + l + "lh[0][l]: " + lh[0][l]);
			
				
				rectangles[l + (7 * k)].setFill(Color.WHITE);
				
				
				}
					if (lh[0][l] == 1) {
					
						// create and paint rectangles
								System.out.println("l: " + l + "lh[0][l]: " + lh[0][l]);	
					
				}
	}
	} // == 0
	if (numarray[k] == 1) {
		
			for (int h = 0; h < 7; h++) {
				if (lh[1][h] == 0) {
				
				
			
				rectangles[h + (7 * k)].setFill(Color.WHITE);
	
				
				}
					if (lh[1][h] == 1) {
					
			
			
				rectangles[h + (7 * k)].setFill(Color.BLACK);

					
				}
	}
	} // == 1
	if (numarray[k] == 2) {
				
			for (int c = 0; c < 7; c++) {
				if (lh[2][c] == 0) {
				
				
				

				rectangles[c + (7 * k)].setFill(Color.WHITE);

				
				}
					if (lh[2][c] == 1) {
					
					
			
				rectangles[c + (7 * k)].setFill(Color.BLACK);
		
					
				}
	}
	} // == 2
	if (numarray[k] == 3) {
							
			for (int n = 0; n < 7; n++) {
				if (lh[3][n] == 0) {
				
			
				rectangles[n + (7 * k)].setFill(Color.WHITE);
		
				
				}
					if (lh[3][n] == 1) {
					
			
				
		
				rectangles[n + (7 * k)].setFill(Color.BLACK);
	
					
				}
	}
	} // == 3
	if (numarray[k] == 4) {
				
			for (int m = 0; m < 7; m++) {
				if (lh[4][m] == 0) {
				
				
			
				rectangles[m + (7 * k)].setFill(Color.WHITE);
			
				
				}
					if (lh[4][m] == 1) {
					
				

				rectangles[m + (7 * k)].setFill(Color.BLACK);
			
					
				}
	}
	} // == 4
	if (numarray[k] == 5) {
				
			for (int j = 0; j < 7; j++) {
				if (lh[5][j] == 0) {
				
		
				rectangles[j + (7 * k)].setFill(Color.WHITE);
		
				
				}
					if (lh[5][j] == 1) {
					
	
				rectangles[j + (7 * k)].setFill(Color.BLACK);
				
					
				}
	}
	} // == 5
	if (numarray[k] == 6) {
							
			for (int i = 0; i < 7; i++) {
				if (lh[6][i] == 0) {
				
				
		
				rectangles[i + (7 * k)].setFill(Color.WHITE);
		
				
				}
					if (lh[6][i] == 1) {
					
					
				
	
				rectangles[i + (7 * k)].setFill(Color.BLACK);
				
					
				}
	}
	} // == 6
	if (numarray[k] == 7) {
				
			for (int v = 0; v < 7; v++) {
				if (lh[7][v] == 0) {
				
			
				rectangles[v + (7 * k)].setFill(Color.WHITE);
				
				
				}
					if (lh[7][v] == 1) {
					
					
				
			
				rectangles[v + (7 * k)].setFill(Color.BLACK);
			
					
				}
	}
	} // == 7
	if (numarray[k] == 8) {
				
			for (int s = 0; s < 7; s++) {
				if (lh[8][s] == 0) {
				
					
	
				rectangles[s + (7 * k)].setFill(Color.WHITE);
		
				
				}
					if (lh[8][s] == 1) {
					
						

				rectangles[s + (7 * k)].setFill(Color.BLACK);
			
					
				}
	}
	} // == 8
	if (numarray[k] == 9) {
				
			for (int w = 0; w < 7; w++) {
				if (lh[9][w] == 0) {
				
					
				
				rectangles[w + (7 * k)].setFill(Color.WHITE);
			
				
				}
					if (lh[9][w] == 1) {
					
	
				rectangles[w + (7 * k)].setFill(Color.BLACK);
		
					
				}
	}
	} // == 9
	} // k < 6
	
		r5.setFill(Color.WHITE);
		r6.setFill(Color.BLACK);
		r7.setFill(Color.WHITE);
		r8.setFill(Color.BLACK);	
		r9.setFill(Color.WHITE);
	
		
	
	     if (k > 5) {
		if (numarray[k] == 0) {
					
			for (int we = 0; we < 7; we++) {
				if (rh[0][we] == 0) {
				
					
		
				rectangles[we + (7 * k)].setFill(Color.WHITE);
		
		
				
				}
					if (rh[0][we] == 1) {
					
					

				rectangles[we + (7 * k)].setFill(Color.BLACK);
				
					
				}
	}
	} // == 0
	if (numarray[k] == 1) {
							
			for (int me = 0; me < 7; me++) {
				if (rh[1][me] == 0) {
				
					
				
			
				rectangles[me + (7 * k)].setFill(Color.WHITE);
				
				
				}
					if (rh[1][me] == 1) {
					
					
			
				rectangles[me + (7 * k)].setFill(Color.BLACK);

					
					
				}
	}
	} // == 1
	if (numarray[k] == 2) {
				
			for (int he = 0; he < 7; he++) {
	//		System.out.println("rh[11][he]: " + rh[11][he]);
				if (rh[2][he] == 0) {
				
				rectangles[he + (7 * k)].setFill(Color.WHITE);
				
				
			/*System.out.println("he0: " + he + "k: " + k);
				if (he + (7 * k) == 80)
				{
					System.out.println("he: " + he + "val: " + rh[2][he]);
				}
*/
				
				}
					if (rh[2][he] == 1) {
					
						
			
				rectangles[he + (7 * k)].setFill(Color.BLACK);
				
				if (he + (7 * k) == 80)
				{
				//	System.out.println("he: " + he + "val: " + rh[2][he]);
				}
				
				rectangles[80].setFill(Color.WHITE);
					
					
				}
	}
	} // == 2
	if (numarray[k] == 3) {
				
			for (int je = 0; je < 7; je++) {
				if (rh[3][je] == 0) {
				
				
			
				rectangles[je + (7 * k)].setFill(Color.WHITE);

				
				}
					if (rh[3][je] == 1) {
					
						
				
			
				rectangles[je + (7 * k)].setFill(Color.BLACK);
				
					
					
				}
	}
	} // == 3
	if (numarray[k] == 4) {
				
			for (int le = 0; le < 7; le++) {
				if (rh[4][le] == 0) {
				
					
	
				rectangles[le + (7 * k)].setFill(Color.WHITE);

				
				}
					if (rh[4][le] == 1) {
					
					
				
				rectangles[le + (7 * k)].setFill(Color.BLACK);
		
				
				}
	}
	} // == 4
	if (numarray[k] == 5) {
				
			for (int pe = 0; pe < 7; pe++) {
				if (rh[5][pe] == 0) {
				
					

				rectangles[pe + (7 * k)].setFill(Color.WHITE);
				
				
				}
					if (rh[5][pe] == 1) {
					
						
				
			
				rectangles[pe + (7 * k)].setFill(Color.BLACK);
				
					
				}
	}
	} // == 5
	if (numarray[k] == 6) {
				
			for (int te = 0; te < 7; te++) {
				if (rh[6][te] == 0) {
				
				
				
				
				rectangles[te + (7 * k)].setFill(Color.WHITE);
		
				
				}
					if (rh[6][te] == 1) {
					
						
				
				
				rectangles[te + (7 * k)].setFill(Color.BLACK);
		
					
			}
	}
	} // == 6
	if (numarray[k] == 7) {
				
			for (int se = 0; se < 7; se++) {
				if (rh[7][se] == 0) {
				
					
				
				rectangles[se + (7 * k)].setFill(Color.WHITE);
			
				}
					if (rh[7][se] == 1) {
					
						
				
			
				rectangles[se + (7 * k)].setFill(Color.BLACK);
			
					
				}
	}
	} // == 7
	if (numarray[k] == 8) {
				
			for (int ye = 0; ye < 7; ye++) {
				if (rh[8][ye] == 0) {
				
					
				
				
				rectangles[ye + (7 * k)].setFill(Color.WHITE);
		
				
				}
					if (rh[8][ye] == 1) {
					
				
				rectangles[ye + (7 * k)].setFill(Color.BLACK);
		
					
				}
	}
	} // == 8
	if (numarray[k] == 9) {
				
			for (int de = 0; de < 7; de++) {
				if (rh[9][de] == 0) {
				
					
			
				rectangles[de + (7 * k)].setFill(Color.WHITE);
	
				
				}
					if (rh[9][de] == 1) {
					
						
				
				
				rectangles[de + (7 * k)].setFill(Color.BLACK);
			
					
				}
	}
	} // == 9
	} // k > 5-	
	

		r10.setFill(Color.WHITE);
		r11.setFill(Color.BLACK);
		r12.setFill(Color.WHITE);
		r13.setFill(Color.BLACK);
		

	} // k for loop

	Hbox.getChildren().addAll(r1, r2, r3, r4);
	
	for (int tr = 0; tr < rectangles.length-1; tr++) {
		Hbox.getChildren().add(rectangles[tr]);
		if (tr == rectangles.length/2) {
		
		Hbox.getChildren().addAll(r5, r6, r7, r8, r9);
		
		}
	}
	
		Hbox.getChildren().addAll(r10, r11, r12, r13);
	
	return rectangles;


}

public void start(Stage primaryStage) {
	
	
	//Put numbers in array
  
	
	// why does rectangle print before 'enter' is pressed?
	//number of rectangles?
	//Create Window and Input/Output for it

	FlowPane rootNode = new FlowPane(10, 10);
	
	primaryStage.setTitle("Barcode");
	primaryStage.setScene(new Scene(rootNode, 800, 700));
	
	//Creates Button
	Button btn = new Button("Enter");
	
	//Region spacer = new Region();
	//HBox Hbox = new HBox(10, btn);
	HBox Hbox1 = new HBox();
	HBox Hbox2 = new HBox();
	VBox Vbox = new VBox(10);
	Vbox.getChildren().addAll(Hbox1, Hbox2);
	//HBox.setHGrow(spacer, Priority.ALWAYS);
	
	TextField text1 = new TextField("Test");
	text1.setMinWidth(150);
	text1.setMaxWidth(250);
	text1.setPrefWidth(200);
	
	
	//Handle the action events for the First Button
      btn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle (ActionEvent ae) {
		
			
	//Take String
	num = text1.getText();
	numarray = fillarray(num);
	//rectangles = createrectangle(numarray, rootNode);
	rectangles = createrectangle(numarray, Hbox2);
	
      }
    });
    
    Hbox1.getChildren().addAll(text1, btn);
	
	rootNode.getChildren().addAll(Vbox);
	
	primaryStage.show();
	
}

public static int[] fillarray(String num) {
	

		// Creates an array
	int numarray[] = new int [12];
	
	//Indexes the array
 	for (int wt = 0; wt < 12; wt++) {
 	
	numarray[wt] = num.charAt(wt) - 48;
  	
  	}
 
  	return numarray;
}
	
}


