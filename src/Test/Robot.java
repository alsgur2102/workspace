package Test;

public class Robot implements ExamInterface{

	String name = "로봇";
	int weight = 1000;
	int arm = 2;

	void shoot() {
		System.out.println("Robot의 슈팅!");
	}
	
	void shoot(int a) {
		System.out.println("오버로딩된 Robot생성자");
	}
	

	// -------------인터페이스-------------------
	@Override
	public void print() {
		System.out.println("인터페이스 프린트");
	}

	@Override
	public int getSum(int a) {
		return 1;
	}
	// -------------인터페이스-------------------
	
	
	/*void print() {
		System.out.println("나는 로봇의 함수!");
	}
	
	void print(int a, String b) { 	// 오버로딩
		System.out.println(a+b);
	}

	void print(String b, int a) { 	// 오버로딩 
		System.out.println(a+b);	
	}*/
}
