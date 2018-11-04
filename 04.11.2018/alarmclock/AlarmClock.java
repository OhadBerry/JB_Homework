package alarmclock;

public class AlarmClock {
	private ExtendedTime currentTime;
	private Alarm[] alarmTime = new Alarm[5];
	
	public AlarmClock() {
		super();
		this.currentTime.setTime(0, 0, 0);
		for (Alarm alarmTimeElement : alarmTime) {
			alarmTimeElement = new Alarm();
		}
			
	}
	
	public void setAlarm(int numOfAlarm, SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		alarmTime[numOfAlarm-1].setTime(time);
		alarmTime[numOfAlarm-1].setSet(isSet);
		alarmTime[numOfAlarm-1].setSnooze(isSnooze);
		alarmTime[numOfAlarm-1].setSnoozeTime(snoozeTime);
	}
	
	public void setAlarm(int numOfAlarm, int hour, int minute, int second, boolean isSet, int snoozeTime, boolean isSnooze) {
		SimpleTime time = new SimpleTime(hour,minute,second);
		alarmTime[numOfAlarm-1].setTime(time);
		alarmTime[numOfAlarm-1].setSet(isSet);
		alarmTime[numOfAlarm-1].setSnooze(isSnooze);
		alarmTime[numOfAlarm-1].setSnoozeTime(snoozeTime);
	}
	

}
