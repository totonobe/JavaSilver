package test9;

public class test21 {

	public static void main(String[] args) {
		Algorithm algorithm = (String name) -> {
			System.out.println("hello, " + name);
		};
		Service s = new Service();
		s.setLogic(algorithm);
		s.doProcess("Lamda");
		s.doRestart("再起動を実施");
	}

}
