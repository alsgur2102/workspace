package Test;

public class Won implements Money {

	int value = 1; // value��� int�� �ν��Ͻ� ������ �����ϰ� ���� 1�� �ʱ�ȭ����.

	public int getValue() { // getValue��� int�� �Լ��� ������.
		return this.value; // �� Ŭ�����ȿ� �ִٴ� this�� ����� value��� ������ ������.
	}

	public void setValue(int value) { // setValue��� int�� �Լ��� �����ϰ� �Ķ���� int�� value�� �־���.
		this.value = value; // this.value�� ���� �Լ� �Ķ���� int�� value��� �ٲ���.

	}

	public String toString() { // toString�̶�� String�� �Լ��� ������.
		return this.value + ""; // Ŭ�����ȿ� �ִٴ� this�� ����� value�� �ڿ� ""�� �־��ְ� ������.
		
	}
}