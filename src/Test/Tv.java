package Test;

public class Tv extends Robot {
	
	void shoot() {
		System.out.println("Tv의 슈팅!");
	}
	
	void shoot(int a, String b) {
		System.out.println("이이이이이");
	}
	
	void shoot(String b, int a) {
		System.out.println("히히히히히");
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.shoot();
		tv.shoot(1, "1");
		tv.shoot("1", 1);
	}
}
