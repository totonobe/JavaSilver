package test9;

import java.time.LocalDate;

public class test26 {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2015,  1, 1);
		LocalDate b = LocalDate.parse("2015-01-01");
		LocalDate c = LocalDate.now();
		System.out.println(a.equals(b));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}

}
