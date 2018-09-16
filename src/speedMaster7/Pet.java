package speedMaster7;

interface Pet {
	void walk();
}

abstract class Dog {
	abstract public void walk();
}

class Pug extends Dog implements Pet {
	public void walk() {
		System.out.println("Pug is walking.");
	}
}

class Main {
		public static void main(String[] args) {
			Pug dog = new Pug();
		 //Pet dog = new Pug();
			dog.walk();
	}

}
