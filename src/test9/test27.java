package test9;

import java.time.LocalTime;

public class test27 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(0, 1, 2);
		LocalTime time2 = time.plusHours(12);
		System.out.println(time);
		System.out.println(time2);

		LocalTime timeNow = LocalTime.now();
		LocalTime timeParse = LocalTime.parse("21:12:05");
		System.out.println(timeNow);
		System.out.println(timeParse);
	}

}
