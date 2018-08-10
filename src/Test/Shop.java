package Test;

import java.util.HashMap; // HashMap에 대한 import문을 추가해줌.

public class Shop {

	String item; // item라는 String형 인스턴스 변수를 선언함.
	int price; // price라는 int형 인스턴스 변수를 선언함.

	HashMap<Bill, Won> payment(int price) { // payment 선언하고 HashMap을 불러오고 데이터 타입을 Bill,Won으로 해주고 파라매터 int형 price 넣어줌. 

		HashMap<Bill, Won> payment = new HashMap<Bill, Won>(); // HashMap<Bill, Won> payment라는 객체를 생성함.
		Bill cheonWon = new Bill(); // Bill클래스에 대한 cheonWon이라는 새로운 생성자를 생성함.
		Won ilWon = new Won(); // Won클래스에 대한 ilWon이라는 새로운 생성자를 생성함.

		int cnt = price / cheonWon.value; // price / cheonWon.Bill클래스에 있는 value값 <== 이 값을 int형 cnt에다가 넣어준다.
		int remainder =price % cheonWon.value; // price % cheonWon.Bill클래스에 있는 value값 <== 이 값을 int형 remainder에다가 넣어준다.
		int cnt2 =remainder/ ilWon.value; // remainder / ilWon.ilWon클래스에 있는 value값 <== 이 값을 int형 cnt2에다가 넣어준다.

		cheonWon.setValue(cnt); // cheonWon.Bill클래스에 있는 setValue(cnt)
		ilWon.setValue(cnt2); // ilWon.Won클래스에 있는 setValue(cnt2)

		payment.put(cheonWon, ilWon); // payment.put(Bill클래스에 있는 cheonWon, Won클래스에 있는 ilWon)

		return payment; // payment값을 리턴해줌.
	}

	public static void main(String args[]) { // main method를 선언함.
		HashMap<String, Integer> history = new HashMap<String, Integer>(); // HashMap<String, integer> history라는 객체를 생성함.
		Shop s1 = new Shop(); // s1이라는 새로운 생성자를 생성함.
		s1.price = 12800; // s1에 대한 price값을 12800으로 초기화해줌.
		s1.item = "book"; // s1에 대한 item값을 "book"으로 초기화해줌.
		history.put(s1.item, s1.price); // history.put값 안에 위에 초기화를 해주었던 String형 s1.item값과 Integer형 s1.price값을 넣어줌. 
		System.out.println(s1.payment(s1.price)); // 지금까지 쓴 것을 println으로 출력함.
	}
}