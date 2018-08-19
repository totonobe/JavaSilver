package test9;
import java.util.ArrayList;

public class test33 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add(1, "B");
		list.add("C");
		list.add("D");
		for (String str : list) {
			System.out.println(str);
		}

	}

}
