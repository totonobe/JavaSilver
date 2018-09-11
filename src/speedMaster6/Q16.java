package speedMaster6;

public class Q16 {
	String size = "nomal";
	Q16(String s) {
		size = s;
	}
	void print() {
		System.out.println(size);
	}
	public static void main(String[] args) {
		new Q16("large").print();
	}

}
