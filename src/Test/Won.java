package Test;

public class Won implements Money {

	int value = 1; // value라는 int형 인스턴스 변수를 선언하고 값을 1로 초기화해줌.

	public int getValue() { // getValue라는 int형 함수를 선언함.
		return this.value; // 이 클래스안에 있다는 this를 사용해 value라는 변수를 리턴함.
	}

	public void setValue(int value) { // setValue라는 int형 함수를 선언하고 파라매터 int형 value를 넣어줌.
		this.value = value; // this.value를 여기 함수 파라매터 int형 value라고 바꿔줌.

	}

	public String toString() { // toString이라는 String형 함수를 선언함.
		return this.value + ""; // 클래스안에 있다는 this를 사용해 value값 뒤에 ""을 넣어주고 리턴함.
		
	}
}