package test11;

public class Q14 {

	public static void main(String[] args) {
		Q14Item[] items = new Q14Item[3];
		//items[0] = new Q14Item("null"); 1番目の要素に何も無いのに拡張forをまわしたのでNullPointerException
		items[1] = new Q14Item("A");
		items[2] = new Q14Item("B");
		for (Q14Item item : items) {
			System.out.println(item.name);
		}

	}

}
