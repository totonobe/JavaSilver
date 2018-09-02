package speedMaster4;

public class Q1 {

	public static void main(String[] args) {
		char[] ary = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.arraycopy(ary, 4, ary, 1, 2);

		for(int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
		}

		System.out.println("");

		String[] ary2 = {"A", "B", "C", "D", "E", "F"};
		System.arraycopy(ary2, 4, ary2, 1, 2);

		for(int i = 0; i < ary2.length; i++) {
			System.out.print(ary2[i]);
		}

	}

}
