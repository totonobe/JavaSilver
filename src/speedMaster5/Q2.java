package speedMaster5;

public class Q2 {

	public static void main(String[] args) {
		int num = 0;

		while(num++ < 5); { //最後にnum=5になって条件式でfalse、その後インクリメントされる。
			System.out.println(num); //whileの条件式がfalseになった時点で実行される。
		}

	}

}
