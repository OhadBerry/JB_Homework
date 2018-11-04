package alarmclock;

public class Alarm {
	private SimpleTime time;
	private boolean isSet;
	private int snoozeTime;
	private boolean isSnooze;
	
	public Alarm() {
		super();
		this.time.setTime(0, 0, 0);
		this.isSet = false;
		this.snoozeTime = 0;
		this.isSnooze = false;
	}

	public Alarm(SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		super();
		this.time = time;
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;
		this.isSnooze = isSnooze;
	}

	public SimpleTime getTime() {
		return time;
	}

	public void setTime(SimpleTime time) {
		this.time = time;
	}

	public boolean isSet() {
		return isSet;
	}

	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}

	public int getSnoozeTime() {
		return snoozeTime;
	}

	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}

	public boolean isSnooze() {
		return isSnooze;
	}

	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}
	
	
	

}
