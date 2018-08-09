package Test;

public class TaekwonV extends Robot{ // extends : 확장

	String name = "태권";
	int weight = 2000;
	
	void print(int a) { // int a를 지우면 Robot의 print함수와 같다. 
		System.out.println("나는 태권V의 프린트!");
	}
	
	public static void main(String[] args) {
		/*Robot ro = (Robot)new TaekwonV(); // upCasting; ro의 범위는 Robot만 안다.
		
		TaekwonV v1 = (TaekwonV)new Robot(); // downCasting; RunTime단계에서 에러가 뜬다. 그러나 컴파일 단계까지는 갈 수 있다. 
		TaekwonV v2 = (TaekwonV)ro; // RunTime단계에서 에러가 뜨지 않는다.
		v1, v2의 범위는 Robot의 기능까지 다 알 수 있다.
		System.out.println(ro.name); ==> 로봇*/
		
		// 덮어쓰기는 자바에서 오버라이딩이라 한다. *오버라이딩 ==> 상속!!*
		/*TaekwonV t = new TaekwonV();
		System.out.println(t.name);
		System.out.println(t.weight);
		System.out.println(t.arm);
		t.print(2,"a"); // 위에 print(int a)로 매개변수를 넣어준다면 Robot에 있는 함수가 나타난다.
		t.print(1);*/
	}
}
