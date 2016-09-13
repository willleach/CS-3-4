import java.io.*;
import java.util.Scanner;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
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

public class BC3 extends Application {

StackPane pane;
String num;

public static void main(String args[]) {

	launch(args);

} // main

public void start(Stage primaryStage) {
	
	//Create Window and Input/Output for it
	pane = new StackPane();
	
	FlowPane rootNode = new FlowPane(10, 10);
	
	primaryStage.setTitle("Barcode");
	primaryStage.setScene(new Scene(pane, 300, 250));
	
	TextField text1 = new TextField();
	text1.setMinWidth(150);
	text1.setMaxWidth(250);
	text1.setPrefWidth(200);
	
	
	//Code
	//int [][] lh = new int [10][7];
	int [][] lh = {{0, 0, 0, 1, 1, 0, 1}, //0
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
	int [][] rh = {{1, 1, 1, 0, 0, 1, 0}, //0
	{1, 1, 0, 0, 1, 1, 0}, //1
	{1, 1, 0, 1, 1, 0, 0}, //2
	{1, 0, 0, 0, 0, 0, 0}, //3
	{1, 0, 1, 1, 1, 0, 0}, //4
	{1, 0, 0, 1, 1, 1, 0}, //5
	{1, 0, 1, 0, 0, 0, 0}, //6
	{1, 0, 0, 0, 1, 0, 0}, //7
	{1, 0, 0, 1, 0, 0, 0}, //8
	{1, 1, 1, 0, 1, 0, 0}}; //9
	
	Rectangle r1 = new Rectangle(50,25,100,140);
	Rectangle r2 = new Rectangle(50,25,100,140);
	Rectangle r3 = new Rectangle(50,25,100,140);
	Rectangle r4 = new Rectangle(50,25,100,140);
	Rectangle r5 = new Rectangle(50,25,100,140);
	Rectangle r6 = new Rectangle(50,25,100,140);
	Rectangle r7 = new Rectangle(50,25,100,140);
	Rectangle r8 = new Rectangle(50,25,100,140);
	Rectangle r9 = new Rectangle(50,25,100,140);
	Rectangle r10 = new Rectangle(50,25,100,140);
	Rectangle r11 = new Rectangle(50,25,100,140);
	Rectangle r12 = new Rectangle(50,25,100,140);
	Rectangle r13 = new Rectangle(50,25,100,140);
	Rectangle r14 = new Rectangle(50,25,100,140);
	Rectangle r15 = new Rectangle(50,25,100,140);
	Rectangle r16 = new Rectangle(50,25,100,140);
	Rectangle r17 = new Rectangle(50,25,100,140);
	Rectangle r18 = new Rectangle(50,25,100,140);
	Rectangle r19 = new Rectangle(50,25,100,140);
	Rectangle r20 = new Rectangle(50,25,100,140);
	Rectangle r21 = new Rectangle(50,25,100,140);
	Rectangle r22 = new Rectangle(50,25,100,140);
	Rectangle r23 = new Rectangle(50,25,100,140);
	Rectangle r24 = new Rectangle(50,25,100,140);
	Rectangle r25 = new Rectangle(50,25,100,140);
	Rectangle r26 = new Rectangle(50,25,100,140);
	Rectangle r27 = new Rectangle(50,25,100,140);
	Rectangle r28 = new Rectangle(50,25,100,140);
	Rectangle r29 = new Rectangle(50,25,100,140);
	Rectangle r30 = new Rectangle(50,25,100,140);
	Rectangle r31 = new Rectangle(50,25,100,140);
	Rectangle r32 = new Rectangle(50,25,100,140);
	Rectangle r33 = new Rectangle(50,25,100,140);
	Rectangle r34 = new Rectangle(50,25,100,140);
	Rectangle r35 = new Rectangle(50,25,100,140);
	Rectangle r36 = new Rectangle(50,25,100,140);
	Rectangle r37 = new Rectangle(50,25,100,140);
	Rectangle r38 = new Rectangle(50,25,100,140);
	Rectangle r39 = new Rectangle(50,25,100,140);
	Rectangle r40 = new Rectangle(50,25,100,140);
	
	//Creates Button
	Button btn = new Button("Enter");
	
	//Handle the action events for the First Button
      btn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle (ActionEvent ae) {
		
		//Put numbers in array
    	int array[] = array(num);
	
       for (int k = 0; k < 12; k++) {
	     if (k < 6) {
		if (array[k] == 0) {
			for (int l = 0; l < 9; l++) {
				if (lh[0][l] == 0) {
				
					// create and paint rectangles
				
				r1.setWidth(200);
				r1.setHeight(100);
				r1.setStroke(Color.BLACK);
				r1.setFill(Color.WHITE);
				r1.setStrokeWidth(3);
				
				}
					if (lh[0][l] == 1) {
					
						// create and paint rectangles
				
				r2.setWidth(200);
				r2.setHeight(100);
				r2.setStroke(Color.BLACK);
				r2.setFill(Color.BLACK);
				r2.setStrokeWidth(3);
					
				}
	}
	} // == 0
	if (array[k] == 1) {
			for (int h = 0; h < 9; h++) {
				if (lh[0][h] == 0) {
				
				
				r3.setWidth(200);
				r3.setHeight(100);
				r3.setStroke(Color.BLACK);
				r3.setFill(Color.WHITE);
				r3.setStrokeWidth(3);
				
				}
					if (lh[0][h] == 1) {
					
			
				
				r4.setWidth(200);
				r4.setHeight(100);
				r4.setStroke(Color.BLACK);
				r4.setFill(Color.BLACK);
				r4.setStrokeWidth(3);
					
				}
	}
	} // == 1
	if (array[k] == 2) {
			for (int c = 0; c < 9; c++) {
				if (lh[0][c] == 0) {
				
				
				
				r5.setWidth(200);
				r5.setHeight(100);
				r5.setStroke(Color.BLACK);
				r5.setFill(Color.WHITE);
				r5.setStrokeWidth(3);
				
				}
					if (lh[0][c] == 1) {
					
					
				
				r6.setWidth(200);
				r6.setHeight(100);
				r6.setStroke(Color.BLACK);
				r6.setFill(Color.BLACK);
				r6.setStrokeWidth(3);
					
				}
	}
	} // == 2
	if (array[k] == 3) {
			for (int n = 0; n < 9; n++) {
				if (lh[0][n] == 0) {
				
			
				r7.setWidth(200);
				r7.setHeight(100);
				r7.setStroke(Color.BLACK);
				r7.setFill(Color.WHITE);
				r7.setStrokeWidth(3);
				
				}
					if (lh[0][n] == 1) {
					
			
				
				r8.setWidth(200);
				r8.setHeight(100);
				r8.setStroke(Color.BLACK);
				r8.setFill(Color.BLACK);
				r8.setStrokeWidth(3);
					
				}
	}
	} // == 3
	if (array[k] == 4) {
			for (int m = 0; m < 9; m++) {
				if (lh[0][m] == 0) {
				
				
				
				r9.setWidth(200);
				r9.setHeight(100);
				r9.setStroke(Color.BLACK);
				r9.setFill(Color.WHITE);
				r9.setStrokeWidth(3);
				
				}
					if (lh[0][m] == 1) {
					
				
				r10.setWidth(200);
				r10.setHeight(100);
				r10.setStroke(Color.BLACK);
				r10.setFill(Color.BLACK);
				r10.setStrokeWidth(3);
					
				}
	}
	} // == 4
	if (array[k] == 0) {
			for (int j = 0; j < 9; j++) {
				if (lh[0][j] == 0) {
				
					
				r11.setWidth(200);
				r11.setHeight(100);
				r11.setStroke(Color.BLACK);
				r11.setFill(Color.WHITE);
				r11.setStrokeWidth(3);
				
				}
					if (lh[0][j] == 1) {
					
					
				
				r12.setWidth(200);
				r12.setHeight(100);
				r12.setStroke(Color.BLACK);
				r12.setFill(Color.BLACK);
				r12.setStrokeWidth(3);
					
				}
	}
	} // == 5
	if (array[k] == 6) {
			for (int i = 0; i < 9; i++) {
				if (lh[0][i] == 0) {
				
				
				
				r13.setWidth(200);
				r13.setHeight(100);
				r13.setStroke(Color.BLACK);
				r13.setFill(Color.WHITE);
				r13.setStrokeWidth(3);
				
				}
					if (lh[0][i] == 1) {
					
					
				
				r14.setWidth(200);
				r14.setHeight(100);
				r14.setStroke(Color.BLACK);
				r14.setFill(Color.BLACK);
				r14.setStrokeWidth(3);
					
				}
	}
	} // == 6
	if (array[k] == 0) {
			for (int v = 0; v < 9; v++) {
				if (lh[0][v] == 0) {
				
					
				r15.setWidth(200);
				r15.setHeight(100);
				r15.setStroke(Color.BLACK);
				r15.setFill(Color.WHITE);
				r15.setStrokeWidth(3);
				
				}
					if (lh[0][v] == 1) {
					
					
				
				r16.setWidth(200);
				r16.setHeight(100);
				r16.setStroke(Color.BLACK);
				r16.setFill(Color.BLACK);
				r16.setStrokeWidth(3);
					
				}
	}
	} // == 7
	if (array[k] == 0) {
			for (int s = 0; s < 9; s++) {
				if (lh[0][s] == 0) {
				
					
				r17.setWidth(200);
				r17.setHeight(100);
				r17.setStroke(Color.BLACK);
				r17.setFill(Color.WHITE);
				r17.setStrokeWidth(3);
				
				}
					if (lh[0][s] == 1) {
					
						
				r18.setWidth(200);
				r18.setHeight(100);
				r18.setStroke(Color.BLACK);
				r18.setFill(Color.BLACK);
				r18.setStrokeWidth(3);
					
				}
	}
	} // == 8
	if (array[k] == 9) {
			for (int w = 0; w < 9; w++) {
				if (lh[0][w] == 0) {
				
					
				
				r19.setWidth(200);
				r19.setHeight(100);
				r19.setStroke(Color.BLACK);
				r19.setFill(Color.WHITE);
				r19.setStrokeWidth(3);
				
				}
					if (lh[0][w] == 1) {
					
					
				r20.setWidth(200);
				r20.setHeight(100);
				r20.setStroke(Color.BLACK);
				r20.setFill(Color.BLACK);
				r20.setStrokeWidth(3);
					
				}
	}
	} // == 9
	} // k < 6
	     if (k > 6) {
		if (array[k] == 0) {
			for (int we = 0; we < 9; we++) {
				if (lh[0][we] == 0) {
				
					
				
				r21.setWidth(200);
				r21.setHeight(100);
				r21.setStroke(Color.BLACK);
				r21.setFill(Color.WHITE);
				r21.setStrokeWidth(3);
				
				}
					if (lh[0][we] == 1) {
					
					
				
				r22.setWidth(200);
				r22.setHeight(100);
				r22.setStroke(Color.BLACK);
				r22.setFill(Color.BLACK);
				r22.setStrokeWidth(3);
					
				}
	}
	} // == 0
	if (array[k] == 1) {
			for (int me = 0; me < 9; me++) {
				if (lh[0][me] == 0) {
				
					
				
				r23.setWidth(200);
				r23.setHeight(100);
				r23.setStroke(Color.BLACK);
				r23.setFill(Color.WHITE);
				r23.setStrokeWidth(3);
				
				}
					if (lh[0][me] == 1) {
					
					
				
				r24.setWidth(200);
				r24.setHeight(100);
				r24.setStroke(Color.BLACK);
				r24.setFill(Color.BLACK);
				r24.setStrokeWidth(3);
					
				}
	}
	} // == 1
	if (array[k] == 2) {
			for (int he = 0; he < 9; he++) {
				if (lh[0][he] == 0) {
				
				
				r25.setWidth(200);
				r25.setHeight(100);
				r25.setStroke(Color.BLACK);
				r25.setFill(Color.WHITE);
				r25.setStrokeWidth(3);
				
				}
					if (lh[0][he] == 1) {
					
						
				r26.setWidth(200);
				r26.setHeight(100);
				r26.setStroke(Color.BLACK);
				r26.setFill(Color.BLACK);
				r26.setStrokeWidth(3);
					
				}
	}
	} // == 2
	if (array[k] == 3) {
			for (int je = 0; je < 9; je++) {
				if (lh[0][je] == 0) {
				
				
				r27.setWidth(200);
				r27.setHeight(100);
				r27.setStroke(Color.BLACK);
				r27.setFill(Color.WHITE);
				r27.setStrokeWidth(3);
				
				}
					if (lh[0][je] == 1) {
					
						
				
				r28.setWidth(200);
				r28.setHeight(100);
				r28.setStroke(Color.BLACK);
				r28.setFill(Color.BLACK);
				r28.setStrokeWidth(3);
					
				}
	}
	} // == 3
	if (array[k] == 4) {
			for (int le = 0; le < 9; le++) {
				if (lh[0][le] == 0) {
				
					
				
				r29.setWidth(200);
				r29.setHeight(100);
				r29.setStroke(Color.BLACK);
				r29.setFill(Color.WHITE);
				r29.setStrokeWidth(3);
				
				}
					if (lh[0][le] == 1) {
					
					
				r30.setWidth(200);
				r30.setHeight(100);
				r30.setStroke(Color.BLACK);
				r30.setFill(Color.BLACK);
				r30.setStrokeWidth(3);
					
				}
	}
	} // == 4
	if (array[k] == 0) {
			for (int pe = 0; pe < 9; pe++) {
				if (lh[0][pe] == 0) {
				
					
				r31.setWidth(200);
				r31.setHeight(100);
				r31.setStroke(Color.BLACK);
				r31.setFill(Color.WHITE);
				r31.setStrokeWidth(3);
				
				}
					if (lh[0][pe] == 1) {
					
						
				
				r32.setWidth(200);
				r32.setHeight(100);
				r32.setStroke(Color.BLACK);
				r32.setFill(Color.BLACK);
				r32.setStrokeWidth(3);
					
				}
	}
	} // == 5
	if (array[k] == 6) {
			for (int te = 0; te < 9; te++) {
				if (lh[0][te] == 0) {
				
				
				
				r33.setWidth(200);
				r33.setHeight(100);
				r33.setStroke(Color.BLACK);
				r33.setFill(Color.WHITE);
				r33.setStrokeWidth(3);
				
				}
					if (lh[0][te] == 1) {
					
						
				
				r34.setWidth(200);
				r34.setHeight(100);
				r34.setStroke(Color.BLACK);
				r34.setFill(Color.BLACK);
				r34.setStrokeWidth(3);
					
			}
	}
	} // == 6
	if (array[k] == 0) {
			for (int se = 0; se < 9; se++) {
				if (lh[0][se] == 0) {
				
					
				
				r35.setWidth(200);
				r35.setHeight(100);
				r35.setStroke(Color.BLACK);
				r35.setFill(Color.WHITE);
				r35.setStrokeWidth(3);
				
				}
					if (lh[0][se] == 1) {
					
						
				
				r36.setWidth(200);
				r36.setHeight(100);
				r36.setStroke(Color.BLACK);
				r36.setFill(Color.BLACK);
				r36.setStrokeWidth(3);
					
				}
	}
	} // == 7
	if (array[k] == 0) {
			for (int ye = 0; ye < 9; ye++) {
				if (lh[0][ye] == 0) {
				
					
				
				r37.setWidth(200);
				r37.setHeight(100);
				r37.setStroke(Color.BLACK);
				r37.setFill(Color.WHITE);
				r37.setStrokeWidth(3);
				
				}
					if (lh[0][ye] == 1) {
					
						
				r38.setWidth(200);
				r38.setHeight(100);
				r38.setStroke(Color.BLACK);
				r38.setFill(Color.BLACK);
				r38.setStrokeWidth(3);
					
				}
	}
	} // == 8
	if (array[k] == 9) {
			for (int de = 0; de < 9; de++) {
				if (lh[0][de] == 0) {
				
					
				r39.setWidth(200);
				r39.setHeight(100);
				r39.setStroke(Color.BLACK);
				r39.setFill(Color.WHITE);
				r39.setStrokeWidth(3);
				
				}
					if (lh[0][de] == 1) {
					
						
				
				r40.setWidth(200);
				r40.setHeight(100);
				r40.setStroke(Color.BLACK);
				r40.setFill(Color.BLACK);
				r40.setStrokeWidth(3);
					
				}
	}
	} // == 9
	} // k > 6
	} //for loop
	
	//Take String
	num = text1.getText();
	
      }
    });

	rootNode.getChildren().addAll(text1, btn);
	pane.getChildren().addAll(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 
	r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, 
	r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, 
	r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);

	primaryStage.show();
	
}

public static int[] array(String num) {
	

		// Creates an array
	int array[] = new int [12];
	
	//Indexes the array
 	for (int wt = 0; wt < 5; wt++) {
 	
	array[wt] = num.charAt(wt) - 48;
  	
  	}
  	//Indexes the array
 	for (int u = 5; u < 11; u++) {
 	
	array[u] = num.charAt(u) - 48;
  	
  	}
  	return array;
}
	
}


