package Test;

public class Gundam extends Robot {
	
	void shoot() {
		System.out.println("Gundam�� ����!");
	}
	
	void shoot(int a, String b) {
		System.out.println("�ƾƾƾƾ�");
	}
	
	void shoot(String b, int a) {
		System.out.println("����������");
	}
	
	public static void main(String[] args) {
		Gundam gun = new Gundam();
		gun.shoot();
		gun.shoot(1, "1");
		gun.shoot("1", 1);
	}
}
