package Test;

import java.util.HashMap; // HashMap�� ���� import���� �߰�����.

public class Shop {

	String item; // item��� String�� �ν��Ͻ� ������ ������.
	int price; // price��� int�� �ν��Ͻ� ������ ������.

	HashMap<Bill, Won> payment(int price) { // payment �����ϰ� HashMap�� �ҷ����� ������ Ÿ���� Bill,Won���� ���ְ� �Ķ���� int�� price �־���. 

		HashMap<Bill, Won> payment = new HashMap<Bill, Won>(); // HashMap<Bill, Won> payment��� ��ü�� ������.
		Bill cheonWon = new Bill(); // BillŬ������ ���� cheonWon�̶�� ���ο� �����ڸ� ������.
		Won ilWon = new Won(); // WonŬ������ ���� ilWon�̶�� ���ο� �����ڸ� ������.

		int cnt = price / cheonWon.value; // price / cheonWon.BillŬ������ �ִ� value�� <== �� ���� int�� cnt���ٰ� �־��ش�.
		int remainder =price % cheonWon.value; // price % cheonWon.BillŬ������ �ִ� value�� <== �� ���� int�� remainder���ٰ� �־��ش�.
		int cnt2 =remainder/ ilWon.value; // remainder / ilWon.ilWonŬ������ �ִ� value�� <== �� ���� int�� cnt2���ٰ� �־��ش�.

		cheonWon.setValue(cnt); // cheonWon.BillŬ������ �ִ� setValue(cnt)
		ilWon.setValue(cnt2); // ilWon.WonŬ������ �ִ� setValue(cnt2)

		payment.put(cheonWon, ilWon); // payment.put(BillŬ������ �ִ� cheonWon, WonŬ������ �ִ� ilWon)

		return payment; // payment���� ��������.
	}

	public static void main(String args[]) { // main method�� ������.
		HashMap<String, Integer> history = new HashMap<String, Integer>(); // HashMap<String, integer> history��� ��ü�� ������.
		Shop s1 = new Shop(); // s1�̶�� ���ο� �����ڸ� ������.
		s1.price = 12800; // s1�� ���� price���� 12800���� �ʱ�ȭ����.
		s1.item = "book"; // s1�� ���� item���� "book"���� �ʱ�ȭ����.
		history.put(s1.item, s1.price); // history.put�� �ȿ� ���� �ʱ�ȭ�� ���־��� String�� s1.item���� Integer�� s1.price���� �־���. 
		System.out.println(s1.payment(s1.price)); // ���ݱ��� �� ���� println���� �����.
	}
}