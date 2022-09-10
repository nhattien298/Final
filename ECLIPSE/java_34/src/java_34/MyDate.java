package java_34;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		if(day>=1 && day <=31) {
			this.day = day;
		}else {
			this.day=1;
		}
		if(month>=1 && month<=12) {
			this.month = month;
		}else {
			this.month =1;
		}
		
		if(year>=1) {
			this.year = year;
		}else {
			this.year=1;
		}

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day +"/"+ this.month+"/"+ this.year;
	}
	
}

