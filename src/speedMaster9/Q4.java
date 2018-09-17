package speedMaster9;

public class Q4 {

	public static void main(String[] args) {
		String words = "Panda. Rabbit. Tiger.";
		String ex = "\\.\\s";
		String[] sw = words.split(ex);
		System.out.println(sw[0] + " " + sw[1] + " " + sw[2]);

	}

}
