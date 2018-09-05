package speedMaster5;

public class Q11 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 9;
		for(num1 = 0; num1 < num2 -1; num1 += 2) {
			System.out.print(num1 + ":");
		}

		System.out.println("");

		int num3 = 0;
		for(num3 = 0; num3 < 10; num3++) {
			System.out.print(++num3 + ":");
		}

	}

}
