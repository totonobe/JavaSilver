package test9;

import java.time.Duration;
import java.time.LocalDateTime;

public class test28 {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2015, 1, 1, 0, 0);
		LocalDateTime end = LocalDateTime.of(2015, 1, 2, 1, 0);
		Duration d = Duration.between(start, end);
		System.out.println(d);
		System.out.println(d.toHours());
	}

}
