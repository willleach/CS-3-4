import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Clock {

		Variables:
		int hours;
		int minutes;
		int seconds;
		int xh = 0;
		int yh = 0;
		int xm = 0;
		int ym = 0;
		int xs = 0;
		int ys = 0;
		int theta = 0;
		// create lines lh, lm, and ls
		
public static void main(String args[]) {
	
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	  	Calendar cal = Calendar.getInstance();
	   System.out.println(dateFormat.format(cal.getTime()));
		
		// gets time in hours, minutes, and seconds
		hours = cal.get(Calendar.HOUR_OF_DAY);
		minutes = cal.get(Calendar.MINUTE);
		seconds = cal.get(Calendar.SECOND);
		
		
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
	public static int HourCoordinates(hours, minutes, seconds) {
		
		
		// get length of line, length.lh
		
		
		
		
	  return xh;
	  return yh;
	  
		}
	public static int MinuteCoordinates(hours, minutes, seconds) {
		
		
		// get length of line, length.lm
		
		
			
	  return xm;
	  return ym;
	  
		}
	public static int SecondCoordinates(hours, minutes, seconds) {
		
		
		// get length of line, length.ls
		
		
			
	  return xs;
	  return ys;
		}
  }
}
