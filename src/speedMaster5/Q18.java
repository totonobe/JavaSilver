package speedMaster5;

public class Q18 {

	public static void main(String[] args) {
		boolean flag = false;
		do
			System.out.println('A');
		//	System.out.println('A+'); do-whileの｛｝を省略した時は１つの処理しか実行できない。
		while(flag);
		while(flag) //コンパイルエラーにはならない。判定はfalseとなり次の行は実行されない。
			System.out.println('B');//whileの条件式がfalseのため実行されない。

		System.out.println('B');//ここは実行される。
	}
}
