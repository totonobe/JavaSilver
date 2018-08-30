package speedMaster1;

public class Q2 {

	public static void main(String args[]) {
		func("555");
	}
	public static void func(String str) {
		int num2 =777;
		String num3 = "func_local";
		try {
			String num1 = str;
			num2 = Integer.parseInt(num1);
		} catch (NumberFormatException nfe) {
			num2 = 111;
		}
		System.out.println(num1 + " : " + num2 + " : " + num3);
	}
	static String num1 = "333";
	static String num3 = "9g333";
}

