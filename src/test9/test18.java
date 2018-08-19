package test9;

public class test18 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcde");
		sb.delete(1, 3);
		sb.deleteCharAt(2);
		System.out.println(sb);

	}

}
