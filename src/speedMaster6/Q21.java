package speedMaster6;

public class Q21 {

		int i = 3;

		Q21() {
			this(10);
		}

		Q21(int i) {
			this(i, 10);
			i = i * 10;
		}

		Q21(int i, int y) {
			i = i * y;
		}

		public static void main(String[] s) {
			System.out.println(new Q21());
		}
	}
