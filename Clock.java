import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.Math;
import java.lang.Object;
import javafx.scene.shape.Line;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class Clock extends Application {
		
		
		
		// Variables:
		Circle clock = new Circle();
		static double xcenter = 300.0d;
		static double ycenter = 300.0d;
		static double circleradius = 200.0d;
				
		Circle inner = new Circle();
		static double xcenter2 = 300.0d;
		static double ycenter2 = 300.0d;
		static double circleradius2 = 197.5d;
		
		Circle small = new Circle();
		static double xcenter3 = 300.0d;
		static double ycenter3 = 300.0d;
		static double circleradius3 = 7.5d;
		
		static double xh2;
		static double yh2;

		static double xm2;
		static double ym2;
	
		static double xs2;
		static double ys2;
		
		static int hours;
		static int minutes;
		static int seconds;
		
		//dashes
		// create a double array of 60 dashes which have same coordinate equations
		// then add them to root
		
		// hour line
		static Line hourline = new Line();
		// minute line
		static Line minuteline = new Line();
		// second line
		static Line secondline = new Line();

		static double theta = 0.0d;
	
		
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
		inner.setFill(Color.WHITE);
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
		
		Group root = new Group();
		
		root.getChildren().addAll(clock, inner, small, hourline, 
		minuteline, secondline);
			
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
		
	/*	TranslateTransition h = new TranslateTransition(Duration.millis(1000), hourline);
		h.setFromX(xcenter);
		h.setToX(XHourCoordinates(GetTime));
		h.setFromY(ycenter);
		h.setToY(YHourCoordinates(GetTime));
		h.setCycleCount(Transition.INDEFINITE);
		h.setAutoReverse(false);
		h.setInterpolator(Interpolator.LINEAR);
		h.play();
		
		TranslateTransition m = new TranslateTransition(Duration.millis(1000), mourline);
		m.setFromX(xcenter);
		m.setToX(XMinuteCoordinates(GetTime));
		m.setFromY(ycenter);
		m.setToY(YMinuteCoordinates(GetTime));
		m.setCycleCount(Transition.INDEFINITE);
		m.setAutoReverse(false);
		m.setInterpolator(Interpolator.LINEAR);
		m.play();
		
		TranslateTransition s = new TranslateTransition(Duration.millis(1000), sourline);
		s.setFromX(xcenter);
		s.setToX(XSecondCoordinates(GetTime));
		s.setFromY(ycenter);
		s.setToY(YSecondCoordinates(GetTime));
		s.setCycleCount(Transition.INDEFINITE);
		s.setAutoReverse(false);
		s.setInterpolator(Interpolator.LINEAR);
		s.play();	 */
	}

	public static int GetHours() {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	   System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		hours = cal.get(Calendar.HOUR_OF_DAY);
		
		
		return hours;
		}	
	public static int GetMinutes() {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	   System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		minutes = cal.get(Calendar.MINUTE);
	

		return minutes;
		
		}
	public static int GetSeconds() {
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	   System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		seconds = cal.get(Calendar.SECOND);
		
		
		
		return seconds;
		}
	public static double XHourCoordinate(int hours, int minutes, int seconds) {
		
		theta = (hours * 5) + (minutes/60.0);
		theta = theta/60.0;
		theta = theta * 360.0;
	
		xh2 = xcenter - ((circleradius * 0.5) * (Math.sin(Math.toRadians(theta))));
		
		// get length of line, length.lh
		// endpoint
		
	/*	if ((hours >= 0) & (hours <= 6)) {
		
		 xh2 = xcenter + ((circleradius * 0.5) * (Math.cos(theta)));
		
		}
		if ((hours > 6) & (hours <= 12)) {
		
		 xh2 = xcenter - ((circleradius * 0.5) * (Math.cos(theta)));
		
		}
		if ((hours > 12) & (hours <= 18)) {
		
		 xh2 = xcenter + ((circleradius * 0.5) * (Math.cos(theta)));
		
		}
		if ((hours > 18) & (hours <= 24)) {
		
		 xh2 = xcenter - ((circleradius * 0.5) * (Math.cos(theta)));
		
		} */
	/*	hourline.setStartX(xcenter);
		hourline.setStartY(ycenter);
		hourline.setEndX(xh2);
		hourline.setEndY(yh2); */
		
	  return xh2;
	  
		}
	public static double YHourCoordinate(int hours, int minutes, int seconds) {
		
		
		theta = (hours * 5) + (minutes/60.0);
		theta = theta/60.0;
		theta = theta * 360.0;

		yh2 = ycenter - ((circleradius * 0.5) * (Math.cos(Math.toRadians(theta))));	
		// get length of line, length.lh
		// endpoint
		
	/*	if ((hours > 0) & (hours <= 3)) {
		
		  yh2 = ycenter - ((circleradius * 0.5) * (Math.sin(theta)));

		}
		if ((hours > 3) & (hours <= 9)) {
		
		  yh2 = ycenter + ((circleradius * 0.5) * (Math.sin(theta)));
		
		}
		if ((hours > 9) & (hours <= 15)) {
		
		  yh2 = ycenter - ((circleradius * 0.5) * (Math.sin(theta)));
			
		}
		if ((hours > 15) & (hours <= 21)) {
		
		  yh2 = ycenter + ((circleradius * 0.5) * (Math.sin(theta)));
		
		}
		if ((hours > 21) & (hours <= 24)) {
		
		
		  yh2 = ycenter + ((circleradius * 0.5) * (Math.sin(theta)));
		
		} */
	
		
		
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
		 xm2 = xcenter - ((circleradius * 0.725) * (Math.sin(Math.toRadians(theta))));
		
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
		 xs2 = xcenter - ((circleradius * 0.85) * (Math.sin(Math.toRadians(theta))));
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
