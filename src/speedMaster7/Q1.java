package speedMaster7;

class Q1 {
	void disp() {
	}
}

class Child extends Q1 {
	void pdisp(){
	}
}

class MyEx {
	public static void main(String[] args) {
		Q1 p = new Child();
		//Child a = new Q1();
	}
}