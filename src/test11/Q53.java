package test11;

public class Q53 {

	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		double c = 20;
		a = (int) b; //floatの値をintに代入するとコンパイルエラーになるので、明示的に変換しなければならない。
		System.out.println(a);
		b = a;
		System.out.println(b);
		c = b;
		System.out.println(c);
		c = a;
		System.out.println(c);

	}

}
