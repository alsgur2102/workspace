package Test;

public class Car {

	int weight = 2000;
	int tireNum = 4;
	static int handleNum = 1;
	
	void rolling() {
		System.out.println("ÀÚµ¿Â÷°¡ ±¼·¯°©´Ï´Ù.");
	}
	
	public static void main(String[] args) {
		Car bmw = new Car();
		Car audi = new Car();
		
		bmw.tireNum = 8;
		System.out.println(bmw.tireNum);
		System.out.println(audi.tireNum);
		audi.weight = 1000;
		System.out.println(bmw.weight);
		
		bmw.handleNum = 10;
		System.out.println(audi.handleNum);
	}
}
