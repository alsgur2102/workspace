package Test;

public class Granjo extends Robot {

	void shoot() {
		System.out.println("Granjo�� ����!");
	}
	
	void shoot(int a, String b) {
		System.out.println("������");
	}
	
	void shoot(String b, int a) {
		System.out.println("����������");
	}
	
	public static void main(String[] args) {
		Granjo jo = new Granjo();
		jo.shoot();
		jo.shoot(1, "1");
		jo.shoot("1", 1);
	}
}
