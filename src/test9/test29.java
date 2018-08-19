package test9;
import java.time.LocalDate;
import java.time.Period;

public class test29 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate target = now.plusDays(10);
		System.out.println(target);
		Period x = now.until(target);n
		System.out.println(x);
		System.out.println(x.getDays());

	}

}
