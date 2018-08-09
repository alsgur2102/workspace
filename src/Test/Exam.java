package Test;

public class Exam {

	// 인스턴스 함수를 만듭니다.
	// 리턴타입은 int, 매개변수는 int[] 한개
	// 매개변수안에 모든 수들을 더합니다.
	// 총합산된 수의 자릿수를 리턴해주세요.
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
