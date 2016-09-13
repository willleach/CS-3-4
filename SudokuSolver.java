import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.shape.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.animation.AnimationTimer;

public class SudokuSolver extends Application {
		
		
	
		
		// Variables:
		
		
		// Arrays/Buttons:
		Button board[][] = new Button [9][9];
		for (int i = 0; i < 81; i++) {
		
		board[i] = new Button();

		}
		
		int boardnumbers[][] = new int [9][9];
		
		Button panel[] = new Button [10];
		for (int k = 0; k < 10; k++) {
		
		panel[k] = new Button();
		
		if (k > 0) {
		panel[k].setText(k);
		}
		}
		Button solve = new Button("Solve");
		Button reset = new Button("Reset");
		//create hbox for solve and reset button
		//create one big vbox that holds 9 hboxs. each hbox holds one row of 9 buttons
		//hbox for panel
		
	
		
public static void main(String args[]) {

		launch(args);

}

	public void start(Stage primaryStage) {
		
		double startx;
		double starty;
		double endx;
		double endy;
		
		Line dashes[] = new Line [60];
		
	for (int i = 0; i < 60; i++) {
		
		theta = (i/60.0) * 360;
		theta = theta * 100.0;
		theta = Math.round(theta);
		theta = theta/100.0;
		startx = xcenter - ((circleradius) * (Math.sin(Math.toRadians(theta))));
		starty = ycenter - ((circleradius) * (Math.cos(Math.toRadians(theta))));
		endx = xcenter - ((circleradius * 0.95) * (Math.sin(Math.toRadians(theta))));
		endy = ycenter - ((circleradius * 0.95) * (Math.cos(Math.toRadians(theta))));
		dashes[i] = new Line();
		dashes[i].setStartX(startx);
		dashes[i].setStartY(starty);
		dashes[i].setEndX(endx);
		dashes[i].setEndY(endy);
		
		} 
		
		iv1.setImage(image);
		t.setFont(new Font(65));
		t.setFill(Color.GREEN);
		t.setStroke(Color.BLACK);
		dashes[0].setStartX(xcenter);
		dashes[0].setStartY(102.0);
		dashes[0].setEndX(xcenter);
		dashes[0].setEndY(110.0);
		dashes[0].setStrokeWidth(3.0);
		dashes[5].setStrokeWidth(3.0);
		dashes[10].setStrokeWidth(3.0);
		dashes[15].setStrokeWidth(3.0);
		dashes[20].setStrokeWidth(3.0);
		dashes[25].setStrokeWidth(3.0);
		dashes[30].setStrokeWidth(3.0);
		dashes[35].setStrokeWidth(3.0);
		dashes[40].setStrokeWidth(3.0);
		dashes[45].setStrokeWidth(3.0);
		dashes[50].setStrokeWidth(3.0);
		dashes[55].setStrokeWidth(3.0);
		//dashes[59].setStrokeWidth(3.0); 
		
		clock.setCenterX(xcenter);
		clock.setCenterY(ycenter);
		clock.setRadius(circleradius);
		inner.setCenterX(xcenter2);
		inner.setCenterY(ycenter2);
		inner.setRadius(circleradius2);
		inner.setFill(Color.GOLD);
		small.setCenterX(xcenter3);
		small.setCenterY(ycenter3);
		small.setRadius(circleradius3);
		
		hours = GetHours();
		minutes = GetMinutes();
		seconds = GetSeconds();
		xh2 = XHourCoordinate(hours, minutes, seconds);
		yh2 = YHourCoordinate(hours, minutes, seconds);
		xm2 = XMinuteCoordinate(hours, minutes, seconds);
		ym2 = YMinuteCoordinate(hours, minutes, seconds);
		xs2 = XSecondCoordinate(hours, minutes, seconds);
		ys2 = YSecondCoordinate(hours, minutes, seconds);
		hourline.setStartX(xcenter);
		hourline.setStartY(ycenter);
		hourline.setEndX(xh2);
		hourline.setEndY(yh2);
		hourline.setStrokeWidth(4.0);
		minuteline.setStartX(xcenter);
		minuteline.setStartY(ycenter);
		minuteline.setEndX(xm2);
		minuteline.setEndY(ym2);
		minuteline.setStrokeWidth(3.0);
		secondline.setStartX(xcenter);
		secondline.setStartY(ycenter);
		secondline.setEndX(xs2);
		secondline.setEndY(ys2);
		secondline.setStrokeWidth(2.0);
		secondline.setStroke(Color.RED);
		iv1.setX(125);
		iv1.setY(50);		
		Group root = new Group();
		
		root.getChildren().addAll(clock, inner, iv1, t, hourline, 
		minuteline, secondline, small);
			
	for (int k = 0; k < 60; k++) {
		
		root.getChildren().addAll(dashes[k]);
		
		}
		
		// look at the hands and dashes when they start and see why they are the way they are
		
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("Clock");
		primaryStage.setScene(scene);

		primaryStage.show();
		
		AnimationTimer draw = new AnimationTimer() {
		
		public void handle (long now) {
				
		hours = GetHours();
		minutes = GetMinutes();
		seconds = GetSeconds();
		xh2 = XHourCoordinate(hours, minutes, seconds);
		yh2 = YHourCoordinate(hours, minutes, seconds);
		xm2 = XMinuteCoordinate(hours, minutes, seconds);
		ym2 = YMinuteCoordinate(hours, minutes, seconds);
		xs2 = XSecondCoordinate(hours, minutes, seconds);
		ys2 = YSecondCoordinate(hours, minutes, seconds);
		hourline.setStartX(xcenter);
		hourline.setStartY(ycenter);
		hourline.setEndX(xh2);
		hourline.setEndY(yh2);
		minuteline.setStartX(xcenter);
		minuteline.setStartY(ycenter);
		minuteline.setEndX(xm2);
		minuteline.setEndY(ym2);
		secondline.setStartX(xcenter);
		secondline.setStartY(ycenter);
		secondline.setEndX(xs2);
		secondline.setEndY(ys2);
		
		
		}
		
		};
		
		draw.start();
		
	}

	public static int GetHours() {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	  // System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		hours = cal.get(Calendar.HOUR_OF_DAY);
		
		
		return hours;
		}	
	public static int GetMinutes() {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	//   System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		minutes = cal.get(Calendar.MINUTE);
	

		return minutes;
		
		}
	public static int GetSeconds() {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	//   System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		seconds = cal.get(Calendar.SECOND);
		
		
		
		return seconds;
		}
	public static double XHourCoordinate(int hours, int minutes, int seconds) {
		
		theta = (hours * 5) + (minutes/60.0);
		theta = theta/60.0 * 100.0;
		theta = Math.round(theta);
		theta = theta / 100.0;
		theta = theta * 360.0;
	
		xh2 = xcenter + ((circleradius * 0.5) * (Math.sin(Math.toRadians(theta))));
		
		// get length of line, length.lh
		// endpoint
		
	
	/*	hourline.setStartX(xcenter);
		hourline.setStartY(ycenter);
		hourline.setEndX(xh2);
		hourline.setEndY(yh2); */
		
	  return xh2;
	  
		}
	public static double YHourCoordinate(int hours, int minutes, int seconds) {
		
		
			theta = (hours * 5) + (minutes/60.0);
		theta = theta/60.0 * 100.0;
		theta = Math.round(theta);
		theta = theta / 100.0;
		theta = theta * 360.0;

		yh2 = ycenter - ((circleradius * 0.5) * (Math.cos(Math.toRadians(theta))));	
		// get length of line, length.lh
		// endpoint
		
	
	
		
		
	/*	hourline.setStartX(xcenter);
		hourline.setStartY(ycenter);
		hourline.setEndX(xh2);
		hourline.setEndY(yh2); */
		
	  return yh2;
	  
		}
	public static double XMinuteCoordinate(int hours, int minutes, int seconds) {
		
		theta = ((minutes + (seconds/60.0))/60.0) * 360;
		theta = 100.0 * theta;
		theta = Math.round(theta);
		theta = theta / 100.0;
		
		// get length of line, length.lm
		// endpoint
		 xm2 = xcenter + ((circleradius * 0.725) * (Math.sin(Math.toRadians(theta))));
		
	/*	
		minuteline.setStartX(xcenter);
		minuteline.setStartY(ycenter);
		minuteline.setEndX(xm2);
		minuteline.setEndY(ym2); */
		
	  return xm2;
	  
		}
		public static double YMinuteCoordinate(int hours, int minutes, int seconds) {
		
		theta = ((minutes + (seconds/60.0))/60.0) * 360;
		theta = 100.0 * theta;
		theta = Math.round(theta);
		theta = theta / 100.0;
		
		// get length of line, length.lm
		// endpoint
		 ym2 = ycenter - ((circleradius * 0.725) * (Math.cos(Math.toRadians(theta))));
		
		
	/*	minuteline.setStartX(xcenter);
		minuteline.setStartY(ycenter);
		minuteline.setEndX(xm2);
		minuteline.setEndY(ym2); */
		
	  return ym2;
	  
		}
	public static double XSecondCoordinate(int hours, int minutes, int seconds) {
		
		theta = (seconds/60.0) * 360;
	//	theta = 100.0 * theta;
	//	theta = Math.round(theta);
	//	theta = theta / 100.0;

		// get length of line, length.ls
		// endpoint
		 xs2 = xcenter + ((circleradius * 0.85) * (Math.sin(Math.toRadians(theta))));
	/*	
		secondline.setStartX(xcenter);
		secondline.setStartY(ycenter);
		secondline.setEndX(xs2);
		secondline.setEndY(ys2);
		*/
	  return xs2;
	  
		}
			public static double YSecondCoordinate(int hours, int minutes, int seconds) {
		
		theta = (seconds/60.0) * 360;
		theta = 100.0 * theta;
		theta = Math.round(theta);
		theta = theta / 100.0;

		// get length of line, length.ls
		// endpoint
		
		 ys2 = ycenter - ((circleradius * 0.85) * (Math.cos(Math.toRadians(theta))));
		
		
		/* secondline.setStartX(xcenter);
		secondline.setStartY(ycenter);
		secondline.setEndX(xs2);
		secondline.setEndY(ys2); */
		
	  return ys2;
	  
		}
  
  
}
