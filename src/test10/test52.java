package test10;

public class test52 {

	public static void main(String[] args) {
		int x = 5;
		while(test(x)) {
			System.out.println(x);
			x--;
		}
	}
	public static boolean test(int x) {
		return x-- > 0 ? true : false;
	}
}
