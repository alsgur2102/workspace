package Test;

public interface ExamInterface {
								
	/*interface I { 			// 생성이 불가능하다. 
		void print();			// 함수이름밖에 선언이 되지 않는다.
		int getSum(int a);*/ 	// 딱 정해져 있는 *계약서* 같은 것이다.
	
	// 구현받을 때에는 ==> Class ExamInterface implements I 이렇게 쓴다.
	
	void print();
	int getSum(int a);
}
