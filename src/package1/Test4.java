package package1;

public class Test4 {
	public static void main(String[] args) {
		int a;
		double b, c, d;
		a = (int) 1.93; // キャストで代入
		b = 1.23;
		c = 10; // キャストなしで代入
		d = c; // キャストありで代入
		System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
	}
}
