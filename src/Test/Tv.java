package Test;

public class Tv extends Robot {
	
	void shoot() {
		System.out.println("Tv�� ����!");
	}
	
	void shoot(int a, String b) {
		System.out.println("����������");
	}
	
	void shoot(String b, int a) {
		System.out.println("����������");
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.shoot();
		tv.shoot(1, "1");
		tv.shoot("1", 1);
	}
}
