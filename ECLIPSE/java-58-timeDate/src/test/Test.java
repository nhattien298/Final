package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		System.out.println("truoc khi chay for : " + t1);
		for (int i = 0; i < 1000; i++) {
			System.out.println("test ---");
		}
		long t2 = System.currentTimeMillis();

		System.out.println("sau khi chay for : " + t2);
		System.out.println("thoi gian chay :" + (t2 - t1) + "ms");
		System.out.println("thoi gian chay :" + (t2 - t1) / 1000 + "s");

		// time unit
		System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000 * 365) + " s");
		System.out.println("1,3h = " + TimeUnit.HOURS.toSeconds(13) + " s ");

		// date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		// calendar
		Calendar c = Calendar.getInstance();
		System.out.println(
				"date " + c.get(Calendar.DATE) + "thang " + c.get(Calendar.MONTH) + "year " + c.get(Calendar.YEAR));
		// cong them gio vao lich
		c.add(Calendar.DATE, 2);
		System.out.println(
				"date " + c.get(Calendar.DATE) + "thang " + c.get(Calendar.MONTH) + "year " + c.get(Calendar.YEAR));

		// dinh dang ngay thang moi
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));

		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
		System.out.println(df1.format(d));
	}

}
