package alarmclock;

import java.util.Date;
import java.text.*;

public class App {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat spf = new SimpleDateFormat("YY:mm:dd");
		System.out.println(spf.format(today));
		

	}

}
