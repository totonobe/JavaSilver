package speedMaster7;

class Q7 {
	public void foo() {
		System.out.print("Afoo ");
	}
}
public class Test extends Q7 {
	public void foo() {
		System.out.print("Bfoo ");
	}
	public static void main(String[] args) {
		Q7 Q7 = new Test();
		Test test = (Test)Q7;
		test.foo();
		Q7.foo();

	}

}

