package alarmclock;

public class ExtendedTime extends SimpleTime {
	private boolean is24Hours;

	public ExtendedTime() {
		super(0, 0, 0);
		is24Hours = true;
	}

	public ExtendedTime(int hour, int minute, int second, boolean is24Hours) {
		super(hour, minute, second);
		this.is24Hours = is24Hours;
		// TODO Auto-generated constructor stub
	}
	
	
	

}
