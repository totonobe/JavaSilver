package speedMaster6;

public class Q13 {

	public static void main(String[] args) {
		Q13 t1 = new Q13(100);
		Q13 t2 = new Q13(50);
		Q13 t3 = new Q13(10);
		t1.func();
		t2.func();
		t3.func();
	}
	private int i;
	private static int j;
	public Q13(int i) {
		this.j += i;
		this.i += i;
	}
	public void func() {
		System.out.println("i : " + i +  " j : " + j);
	}

}
