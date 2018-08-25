package test11;

public class Q11 {

	public static void main(String[] args) {
		String str = "apple";
		String[] array = {"a", "p", "p", "l", "e"};
		String result = "";
		for(String val : array) {
			if (val.equals("p")) {
				continue;
			}
			result = result + val;

			System.out.println(result);
		}
		boolean a = str == result;
		boolean b = str.equals(result);
		System.out.println(a + ":"  + b);
	}
}
