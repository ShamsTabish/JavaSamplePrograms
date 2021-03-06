package branching;

public class ShortHandIf {
	public static void main(String[] args) {
		int age = 40;
		String category = age < 20 ? "Child " : age < 40 ? "Young " : "Old";

		System.out.println("The Person is " + category);

		int x = 0, y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) && (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + " " + y);
		System.out.println(-4>>2);
	}
}

/*
x       Y    x && y
true  true   true
false true   false
true  false  false
false false  false 
*/