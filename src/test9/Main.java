package test9;

public class Main {

	public static void main(String[] args) {
		String str = "hoge, world.";
		hello(str);
		System.out.println(str);
	}
	private static void hello(String str) {
		System.out.println(str.replaceAll("hoge", "hello"));// test
	}
}
