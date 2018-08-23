package test10;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test53 {

	public static void main(String[] args) {
		String date = LocalDate.parse("2015-08-23").format(DateTimeFormatter.ISO_DATE_TIME);
		//parseメソッドで変換したLocalDateのインスタンスは、時刻に関する情報を持っていないので例外がスローされる。
		System.out.println(date);

	}

}
