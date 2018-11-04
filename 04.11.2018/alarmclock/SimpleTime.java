package alarmclock;

public class SimpleTime {
	
	//------------------Properties--------------
	private int hour;
	private int minute;
	private int second;

	//------------------Constructors--------------
	public SimpleTime() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public SimpleTime(int hour, int minute, int second) {
		super();
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	//------------------Getters and Setters--------------
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour%24;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute%60;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second%60;
	}
	
	//------------------Methods--------------
	
	public void setTime(int hour, int minute, int seconds) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void add(SimpleTime time) {
		setHour(getHour()+time.getHour());
		setMinute(getMinute()+time.getMinute());
		setSecond(getSecond()+time.getSecond());
	}
	
	public void addHour(int hours) {
		setHour(getHour()+hours);
	}
	
	public void addMinute(int minutes) {
		setMinute(getMinute()+minutes);
	}
	
	public void addSecond(int seconds) {
		setSecond(getSecond()+seconds);
	}
	
	public boolean equals(SimpleTime time) {
		if (	time.getHour() == getHour() &&
				time.getMinute() == getMinute() &&
				time.getSecond() == getSecond())
			return true;
		else
			return false;
	}
	
	public void tick() {addSecond(1);}
	

}
