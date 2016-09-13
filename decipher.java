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

public class decipher extends Application {

static StackPane pane;
static String ciphertext;
static String keyword;
Label encryptedLabel;
	
public static void main(String args[]) {

	launch(args);

} // main
// method for taking in cipher text and keyword which converts them into numbers that
// relate to the letter, then fill them into separate arrays, which are put into the
// the two dimensional array, which outputs the decoded text.

public void start(Stage primaryStage) {

	FlowPane rootNode = new FlowPane(10, 10);
	
	primaryStage.setTitle("Cipher");
	primaryStage.setScene(new Scene(rootNode, 800, 700));
	
	//Creates Button
	Button btn = new Button("Enter");
	
	encryptedLabel = new Label();
	
	//Region spacer = new Region();
	//HBox Hbox = new HBox(10, btn);
	HBox Hbox1 = new HBox();
	VBox Vbox = new VBox(10);
	Vbox.getChildren().addAll(Hbox1, encryptedLabel);
	//HBox.setHGrow(spacer, Priority.ALWAYS);
	
	TextField cipherfield = new TextField("Enter Cipher text");
	cipherfield.setMinWidth(150);
	cipherfield.setMaxWidth(250);
	cipherfield.setPrefWidth(200);
	TextField keyfield = new TextField("Enter Keyword");
	keyfield.setMinWidth(150);
	keyfield.setMaxWidth(250);
	keyfield.setPrefWidth(200);
	
	//Handle the action events for the First Button
      btn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle (ActionEvent ae) {		

		encryptedLabel.setText(decipher(cipherfield, keyfield));
	
      }
    });
    
    Hbox1.getChildren().addAll(cipherfield, keyfield, btn);
	
	rootNode.getChildren().addAll(Vbox);
	
	primaryStage.show();
	
}

public static String decipher(TextField cipherfield, TextField keyfield) {
	
	
	ciphertext = cipherfield.getText();
	
	keyword = keyfield.getText(); 
	char cipher[] = ciphertext.toCharArray();
	char keyword1[] = keyword.toCharArray();
	char keyword2[] = new char [cipher.length];
	int ciphertext2[] = new int [cipher.length];
	int keyword3[] = new int [cipher.length];
	char text[] = new char [cipher.length];
	
	// for loop that fills array with cipher length value of keyword characters
	int l = keyword1.length;
	int count = 0;
	for (int k = 0; count < ciphertext2.length; k++) {
		
		for (int m = 0; m < keyword1.length; m++) {
		// key word length is 6
		// cipher length is 14
		if (count == cipher.length) {
		
		break;
		
		}
			keyword2[count] = keyword1[m];
			
			count++;
			
		
		
		}
	}

		
	//for loops that fill second array with numbers
	for (int y = 0; y < ciphertext2.length; y++) {
		keyword3[y] = (char)keyword2[y] - 97;
	/*
	if (keyword2[y] = a) {
	keyword3[y] = 0;
	}
	if (keyword2[y] = b) {
	keyword3[y] = 1;
	}
	if (keyword2[y] = c) {
	keyword3[y] = 2;
	}
	if (keyword2[y] = d) {
	keyword3[y] = 3;
	}
	if (keyword2[y] = e) {
	keyword3[y] = 4;
	}
	if (keyword2[y] = f) {
	keyword3[y] = 5;
	}
	if (keyword2[y] = g) {
	keyword3[y] = 6;
	}
	if (keyword2[y] = h) {
	keyword3[y] = 7;
	}
	if (keyword2[y] = i) {
	keyword3[y] = 8;
	}
	if (keyword2[y] = j) {
	keyword3[y] = 9;
	}
	if (keyword2[y] = k) {
	keyword3[y] = 10;
	}
	if (keyword2[y] = l) {
	keyword3[y] = 11;
	}
	if (keyword2[y] = m) {
	keyword3[y] = 12;
	}
	if (keyword2[y] = n) {
	keyword3[y] = 13;
	}
	if (keyword2[y] = o) {
	keyword3[y] = 14;
	}
	if (keyword2[y] = p) {
	keyword3[y] = 15;
	}
	if (keyword2[y] = q) {
	keyword3[y] = 16;
	}
	if (keyword2[y] = r) {
	keyword3[y] = 17;
	}
	if (keyword2[y] = s) {
	keyword3[y] = 18;
	}
	if (keyword2[y] = t) {
	keyword3[y] = 19;
	}
	if (keyword2[y] = u) {
	keyword3[y] = 20;
	}
	if (keyword2[y] = v) {
	keyword3[y] = 21;
	}
	if (keyword2[y] = w) {
	keyword3[y] = 22;
	}
	if (keyword2[y] = x) {
	keyword3[y] = 23;
	}
	if (keyword2[y] = y) {
	keyword3[y] = 24;
	}
	if (keyword2[y] = z) {
	keyword3[y] = 25;
	}*/
	}
	for (int x = 0; x < ciphertext2.length; x++) {
	
		ciphertext2[x] = (char)cipher[x] - 97;
	/*
	if (cipher[x] = a) {
	ciphertext[x] = 0
	}
	if (cipher[x] = b) {
	ciphertext[x] = 1
	}
	if (cipher[x] = c) {
	ciphertext[x] = 2
	}
	if (cipher[x] = d) {
	ciphertext[x] = 3
	}
	if (cipher[x] = e) {
	ciphertext[x] = 4
	}
	if (cipher[x] = f) {
	ciphertext[x] = 5
	}
	if (cipher[x] = g) {
	ciphertext[x] = 6
	}
	if (cipher[x] = h) {
	ciphertext[x] = 7
	}
	if (cipher[x] = i) {
	ciphertext[x] = 8
	}
	if (cipher[x] = j) {
	ciphertext[x] = 9
	}
	if (cipher[x] = k) {
	ciphertext[x] = 10
	}
	if (cipher[x] = l) {
	ciphertext[x] = 11
	}
	if (cipher[x] = m) {
	ciphertext[x] = 12
	}
	if (cipher[x] = n) {
	ciphertext[x] = 13
	}
	if (cipher[x] = o) {
	ciphertext[x] = 14
	}
	if (cipher[x] = p) {
	ciphertext[x] = 15
	}
	if (cipher[x] = q) {
	ciphertext[x] = 16
	}
	if (cipher[x] = r) {
	ciphertext[x] = 17
	}
	if (cipher[x] = s) {
	ciphertext[x] = 18
	}
	if (cipher[x] = t) {
	ciphertext[x] = 19
	}
	if (cipher[x] = u) {
	ciphertext[x] = 20
	}
	if (cipher[x] = v) {
	ciphertext[x] = 21
	}
	if (cipher[x] = w) {
	ciphertext[x] = 22
	}
	if (cipher[x] = x) {
	ciphertext[x] = 23
	}
	if (cipher[x] = y) {
	ciphertext[x] = 24
	}
	if (cipher[x] = z) {
	ciphertext[x] = 25
	}
	*/
	}
	
	

	// Two - Dimensional array
	char [][] crypto = {
    {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}, //0'
    {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'}, //1'
    {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b'}, //2'
    {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c'}, //3'
    {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd'}, //4'
    {'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e'}, //5'
    {'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f'}, //6'
    {'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g'}, //7'
    {'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}, //8'
    {'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'}, //9'
    {'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'},//10'
    {'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'}, //11'
    {'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'}, //12'
    {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'}, //13'
    {'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'}, //14'
    {'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'}, //15'
    {'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'}, //16'
    {'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q'}, //17'
    {'s', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r'}, //18'
    {'t', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's'}, //19'
    {'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'}, //20'
    {'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u'}, //21'
    {'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v'}, //22'
    {'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w'}, //23'
    {'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x'}, //24'
    {'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'}, //25'
    };

	
	for(int j = 0; j < ciphertext2.length; j++) {
	
		text[j] = crypto[ciphertext2[j]][keyword3[j]];
		//System.out.print("j: " + j);
		//System.out.print(" Ciphertext2: " + ciphertext2[j]);
		//System.out.print(" Keyword3: " + keyword3[j]);
		//System.out.println(" Crypto: " + crypto[ciphertext2[j]][keyword3[j]]);
	
	}
	
	//combine characters within an array back together
	String text1 = new String(text);
	
	return text1;
}


	
}


