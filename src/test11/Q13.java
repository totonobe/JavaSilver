package test11;

public class Q13 {
	static int num;
	private static void test() {
		num++; //非staticだとコンパイルエラーが発生する
		test2();
		System.out.println(num);
	}

	private static void test2() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		Q13.test();
		Q13.test();
	}
}
