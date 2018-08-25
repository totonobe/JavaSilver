package test11;

public class Q9 {

	public static void main(String[] args) {
		String a = "A";
		a = a.concat("B");
		String b = "C";
		a = a.concat(b);
		System.out.println(a);
		String c = a.replace('C', 'D');
		System.out.println("C:" + c);
		a = a.concat(b);
		System.out.println(a);
	}

}
