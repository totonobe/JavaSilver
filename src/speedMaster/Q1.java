package speedMaster;

public class Q1 {

	private static int letter;
	public static int getLetter();//このメソッドが実装されていないのでコンパイルエラー。実装を持たない抽象メソッドとして扱うにはabstractを修飾する必要がある。
	public static void main(String[] args) {
		System.out.println(getLetter());
	}
}
