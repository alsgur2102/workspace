package Test;

public class TaekwonV extends Robot{ // extends : Ȯ��

	String name = "�±�";
	int weight = 2000;
	
	void print(int a) { // int a�� ����� Robot�� print�Լ��� ����. 
		System.out.println("���� �±�V�� ����Ʈ!");
	}
	
	public static void main(String[] args) {
		/*Robot ro = (Robot)new TaekwonV(); // upCasting; ro�� ������ Robot�� �ȴ�.
		
		TaekwonV v1 = (TaekwonV)new Robot(); // downCasting; RunTime�ܰ迡�� ������ ���. �׷��� ������ �ܰ������ �� �� �ִ�. 
		TaekwonV v2 = (TaekwonV)ro; // RunTime�ܰ迡�� ������ ���� �ʴ´�.
		v1, v2�� ������ Robot�� ��ɱ��� �� �� �� �ִ�.
		System.out.println(ro.name); ==> �κ�*/
		
		// ������ �ڹٿ��� �������̵��̶� �Ѵ�. *�������̵� ==> ���!!*
		/*TaekwonV t = new TaekwonV();
		System.out.println(t.name);
		System.out.println(t.weight);
		System.out.println(t.arm);
		t.print(2,"a"); // ���� print(int a)�� �Ű������� �־��شٸ� Robot�� �ִ� �Լ��� ��Ÿ����.
		t.print(1);*/
	}
}
