package speedMaster5;

public class Q23 {

	public static void main(String[] args) {
		String[][] type = new String[3][3];
		type[0][0] = "Circle";
		type[0][1] = "Triangle";
		type[0][2] = "Square";
		type[1][0] = "Black";
		type[1][1] = "White";
		type[1][2] = "Blue";
		type[2][0] = "[2][0]";
		type[2][1] = "[2][1]";
		type[2][2] = "[2][2]";

		for(int i=0; i < type.length;) {
			for(int j = 0; j < type[i].length;) {
				System.out.print(type[i][j] + ";");
				j++;
			}
			i++;
		}

	}

}
