package Test;

public class Robot implements ExamInterface{

	String name = "�κ�";
	int weight = 1000;
	int arm = 2;

	void shoot() {
		System.out.println("Robot�� ����!");
	}
	
	void shoot(int a) {
		System.out.println("�����ε��� Robot������");
	}
	

	// -------------�������̽�-------------------
	@Override
	public void print() {
		System.out.println("�������̽� ����Ʈ");
	}

	@Override
	public int getSum(int a) {
		return 1;
	}
	// -------------�������̽�-------------------
	
	
	/*void print() {
		System.out.println("���� �κ��� �Լ�!");
	}
	
	void print(int a, String b) { 	// �����ε�
		System.out.println(a+b);
	}

	void print(String b, int a) { 	// �����ε� 
		System.out.println(a+b);	
	}*/
}
