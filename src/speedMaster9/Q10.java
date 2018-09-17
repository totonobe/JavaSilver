package speedMaster9;

public class Q10 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("123456789");
		System.out.println("削除前 : " + sb);
		sb.delete(0, sb.length());
		System.out.println("delete : " + sb);

	}

}
