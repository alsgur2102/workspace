package Test;

public class Exam {

	// �ν��Ͻ� �Լ��� ����ϴ�.
	// ����Ÿ���� int, �Ű������� int[] �Ѱ�
	// �Ű������ȿ� ��� ������ ���մϴ�.
	// ���ջ�� ���� �ڸ����� �������ּ���.
	int getLength(int[] arr) {
		int sum = 0;
		for (int i:arr) {
			sum += i;
		}
		String str = sum + "";
		return str.length();
	}

	public static void main(String[] args) {
		
	}
}
