package test9;

public class test20 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.insert(0,  "abcde");
		CharSequence seq = sb.subSequence(1, 5);
		System.out.println(seq);
		String str = new StringBuilder(seq).substring(1,3);
		System.out.println(str);
	}
}
