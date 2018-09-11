package speedMaster6;

public class Q12 {
	static int staNum = 3;

	public static void main(String[] args) {
		Q12 test  = new Q12();
		test.staNum++;
		Q12.staNum++;
		test.staNum++;
		System.out.println(Q12.staNum + "" + test.staNum);
	}
}
