package praticeit;

public class Time {
	private int hour, minute, second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void nextSecond() {
		int second = this.second;
		second += 1;
		int minute = this.minute;
		int hour = this.hour;
		if (second == 60) {
			second = 0;
			minute++;
			if (minute == 60) {
				minute = 0;
				hour++;
			}
		}
	}

	public void previousSecond() {
		int second = this.second;
		second -= 1;
		int minute = this.minute;
		int hour = this.hour;
		if (second == 59) {
			minute--;
			if (minute == 59) {
				hour--;
			}
		}
	}

	public void display() {
		String hour = this.hour + "";
		String minute = this.minute + "";
		String second = this.second + "";
		if (hour.length() <= 1) {
			hour = "0" + hour;
		}
		if (minute.length() <= 1) {
			minute = "0" + minute;
		}
		if (second.length() <= 1) {
			second = "0" + second;
		}
		System.out.println(hour + ":" + minute + ":" + second);
	}
}
