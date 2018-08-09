package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Homework {
	
	// 4. 인스턴스 함수를 만듭니다. 리턴타입 ArrayList<?>, 파라매터는 한개의 int[]입니다. 매개변수로 받은 int형 배열을 그대로 새로운 ArrayList에 담아 리턴해주세요
	ArrayList<Integer> intArr1(int[] a) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			arr.add(a[i]);
		}
		return arr;
	}

	// 5. 4번과 나머지는 동일하나, 파라매터로 받은 배열을 모두 더한값을 ArrayList에 담아 리턴해주세요
	ArrayList<Integer> intArr2(int[] b) {
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		int bb = 0;
		for (int i=0; i<b.length; i++) {
			bb = bb + b[i];
		}
		Arr.add(bb);
		return Arr;
	}

	// 6. 인스턴스 함수를 만듭니다. 리턴타입 String, 파라매터는 한개의 int[]입니다. int[]에있는 모든 수를 더했을때, 짝수면 'even' 홀수면 'odd'를 리턴해주세요.
	String strArr(int[] c) {
		int cc = 0;
		for(int i=0; i<c.length; i++) {
			cc = cc + c[i];
			if (cc % 2 == 0) {
				return "even";
			}
			else {
				return "odd";
			}
		}
		return "";
	}

	// 7. 인스턴스 함수를 만듭니다. 리턴타입 ArrayList<?> 파라매터는 String, int 총 두개입니다.
	// 해당 파라매터 String변수를 파라매터int 변수 만큼 반복해서 넣어주세요
	// (예: String s = google, int i = 4 일때, [google, google, google, google]이 나와야 합니다)


	// 8. 인스턴스 함수를 만듭니다. 리턴타입 HashMap<String,Integer>파라매터는 String[], int[] 총 두개입니다.
	// 이 두 파라매터의 인덱스 크기는 동일하다고 가정할때, 인덱스 값들이 같은 값들끼리 묶은 맵을 리턴해주세요.
	// (예: String[] s= [a,b,c]; int[] i=[10,20,30]일떄 ==> {a=10,b=20,c=30}이 나와야 합니다)
	HashMap<String,Integer> hsMap1 = new HashMap<String,Integer>();

	// 9. 인스턴스 함수를 만듭니다. 리턴타입 ArrayList<?>,파라매터는 HashMap<String,String>한개입니다.
	// 해당 파라매터 KEY-VALUE 값을 붙혀 하나의 String을 만들어 새로운 ArrayList<?>에 담아 리턴해주세요
	// (예: HashMap<String,String> hm = {a:apple,b:banana,c:cat}일때,[aapple, bbanana, ccat]이 나와야 합니다)
	ArrayList<HashMap<String,String>> hsMap2 = new ArrayList<HashMap<String,String>>();
	
	// 10. 인스턴스 함수를 만듭니다. 리턴타입 없음,파라매터는 HashMap<String,String>한개입니다.
	// 두개의 ArrayList<?>를 생성하여 하나는 파라매터의 Key들만, 다른 하나에는Value값들만 넣어서 각각 system.out.println으로 콘솔에 찍어주세요


	public static void main(String[] args) {

		// 1.3개의 ArrayList 인스턴스 변수를 생성하는데, 각각 String, int, boolean만 들어갈수 있게 규제해주세요.
		ArrayList<String> strarr = new ArrayList<String>();
		ArrayList<Integer> intarr = new ArrayList<Integer>();
		ArrayList<Boolean> blarr = new ArrayList<Boolean>();

		// 2. 1번에서 만든 ArrayList들안에 하나씩 값을 넣어 주세요. 무엇을 넣으시던지 자유입니다.
		strarr.add("난 스트링");
		intarr.add(1);
		blarr.add(true);

		// 3. 인스턴스 함수를 만듭니다. 2번에서 넣은 3개의 값들을 하나씩 system.out.println으로 콘솔에 찍어주세요
		System.out.println(strarr);
		System.out.println(intarr);
		System.out.println(blarr);

		int[] abc = {1,2,3};
		Homework aa = new Homework();
		System.out.println(aa.intArr2(abc));
	}
}
