package test11;

public class Q16 {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder(5);
		String str = "";

		System.out.println("sb:" + sb);
		String c = str.toString();
		System.out.println("c:" + c);

		if (sb.equals(str)) {
			System.out.println("A");
		} else if (sb.toString().equals(str.toString())) { //sbをtoStringで文字列に変換している。が、今回のケースではバッファしかないので空文字を返す。よってtrue
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

}
