package test9;

public class test10 {

	public static void main(String[] args) {
		String str = "a. b. c. d. e";
		String[] array = str.split("\\w\\s");
		for(String s : array) {
			System.out.print(s);
		}
	}
}
