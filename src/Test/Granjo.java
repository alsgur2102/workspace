package Test;

public class Granjo extends Robot {

	void shoot() {
		System.out.println("Granjo의 슈팅!");
	}
	
	void shoot(int a, String b) {
		System.out.println("어어어어어");
	}
	
	void shoot(String b, int a) {
		System.out.println("허허허허허");
	}
	
	public static void main(String[] args) {
		Granjo jo = new Granjo();
		jo.shoot();
		jo.shoot(1, "1");
		jo.shoot("1", 1);
	}
}
