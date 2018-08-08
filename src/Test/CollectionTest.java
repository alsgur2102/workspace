package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest {

	// Set
	// 배열과 같은 의미인데 중복이 되지 않는다, 무조건 값은 하나밖에 없다.
	
	// List : add(); remove(); get(); size();
	// [1,2,3,4,5,6].add(3) ==> [1,2,3,4,5,6,3]
	// [1,2,3,4,5,6,3].remove(2) ==> [1,2,3,4,5,6,3]
	
	// Map : put(key,value); remove(); get(); size();
	// {a=apple,b=balloon,c=cat}; put(a,ant) ==> {a=ant,b=balloon,c=cat}; 새로운 값을 넣으면 기존에 있던 값은 사라진다.
	
	public static void main(String[] args) {
		int[] arr = new int[5]; // [0,0,0,0,0] 인덱스 크기를 정해줘야 한다.
		String[] arr1 = new String[5]; // [null,null,null,null,null] 인덱스 크기를 정해줘야 한다.
		
		ArrayList list = new ArrayList(); // 인덱스 크기를 정해주지 않아도 됨, 고무줄처럼 늘어난다.
		ArrayList<Integer> arr2 = new ArrayList(); // <>안 데이터 타입은 첫문자 대문자로 해줘야 한다.
		
		HashMap map = new HashMap(); // keyvalue key값이 중복이 되면 안된다.
		
		
	}
}
