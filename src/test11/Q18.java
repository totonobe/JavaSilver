package test11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q18 {

	public static void main(String[] args) {
		String[] array = {"apple", "banana", "orange"};
		List<String> list = new ArrayList<>(Arrays.asList(array));
		String s;
		if (list.removeIf((String s) -> {return s.length() == 5;})) {
			//if文内の変数としてラムダ式で宣言したsは使えないのでコンパイルエラー
			System.out.println(s);
		}

	}

}
