package Test;

public class Gundam extends Robot {
	
	void shoot() {
		System.out.println("Gundam의 슈팅!");
	}
	
	void shoot(int a, String b) {
		System.out.println("아아아아아");
	}
	
	void shoot(String b, int a) {
		System.out.println("하하하하하");
	}
	
	public static void main(String[] args) {
		Gundam gun = new Gundam();
		gun.shoot();
		gun.shoot(1, "1");
		gun.shoot("1", 1);
	}
}
