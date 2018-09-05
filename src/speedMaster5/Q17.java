package speedMaster5;

public class Q17 {

	public static void main(String[] args) {
		do {
			int num = 0;
			int ary[] = {0, 1, 2, 3, 4};
			System.out.println(ary[num++]);
		} while(num < ary.length); //intとaryはdoブロック内で宣言したため、そのブロック内のみで有効。条件式に使用することはできない。
		//よってコンパイルエラーになる。

	}

}
