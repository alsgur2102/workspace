package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Homework {
	
	// 4. �ν��Ͻ� �Լ��� ����ϴ�. ����Ÿ�� ArrayList<?>, �Ķ���ʹ� �Ѱ��� int[]�Դϴ�. �Ű������� ���� int�� �迭�� �״�� ���ο� ArrayList�� ��� �������ּ���
	ArrayList<Integer> intArr1(int[] a) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			arr.add(a[i]);
		}
		return arr;
	}

	// 5. 4���� �������� �����ϳ�, �Ķ���ͷ� ���� �迭�� ��� ���Ѱ��� ArrayList�� ��� �������ּ���
	ArrayList<Integer> intArr2(int[] b) {
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		int bb = 0;
		for (int i=0; i<b.length; i++) {
			bb = bb + b[i];
		}
		Arr.add(bb);
		return Arr;
	}

	// 6. �ν��Ͻ� �Լ��� ����ϴ�. ����Ÿ�� String, �Ķ���ʹ� �Ѱ��� int[]�Դϴ�. int[]���ִ� ��� ���� ��������, ¦���� 'even' Ȧ���� 'odd'�� �������ּ���.
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

	// 7. �ν��Ͻ� �Լ��� ����ϴ�. ����Ÿ�� ArrayList<?> �Ķ���ʹ� String, int �� �ΰ��Դϴ�.
	// �ش� �Ķ���� String������ �Ķ����int ���� ��ŭ �ݺ��ؼ� �־��ּ���
	// (��: String s = google, int i = 4 �϶�, [google, google, google, google]�� ���;� �մϴ�)


	// 8. �ν��Ͻ� �Լ��� ����ϴ�. ����Ÿ�� HashMap<String,Integer>�Ķ���ʹ� String[], int[] �� �ΰ��Դϴ�.
	// �� �� �Ķ������ �ε��� ũ��� �����ϴٰ� �����Ҷ�, �ε��� ������ ���� ���鳢�� ���� ���� �������ּ���.
	// (��: String[] s= [a,b,c]; int[] i=[10,20,30]�ϋ� ==> {a=10,b=20,c=30}�� ���;� �մϴ�)
	HashMap<String,Integer> hsMap1 = new HashMap<String,Integer>();

	// 9. �ν��Ͻ� �Լ��� ����ϴ�. ����Ÿ�� ArrayList<?>,�Ķ���ʹ� HashMap<String,String>�Ѱ��Դϴ�.
	// �ش� �Ķ���� KEY-VALUE ���� ���� �ϳ��� String�� ����� ���ο� ArrayList<?>�� ��� �������ּ���
	// (��: HashMap<String,String> hm = {a:apple,b:banana,c:cat}�϶�,[aapple, bbanana, ccat]�� ���;� �մϴ�)
	ArrayList<HashMap<String,String>> hsMap2 = new ArrayList<HashMap<String,String>>();
	
	// 10. �ν��Ͻ� �Լ��� ����ϴ�. ����Ÿ�� ����,�Ķ���ʹ� HashMap<String,String>�Ѱ��Դϴ�.
	// �ΰ��� ArrayList<?>�� �����Ͽ� �ϳ��� �Ķ������ Key�鸸, �ٸ� �ϳ�����Value���鸸 �־ ���� system.out.println���� �ֿܼ� ����ּ���


	public static void main(String[] args) {

		// 1.3���� ArrayList �ν��Ͻ� ������ �����ϴµ�, ���� String, int, boolean�� ���� �ְ� �������ּ���.
		ArrayList<String> strarr = new ArrayList<String>();
		ArrayList<Integer> intarr = new ArrayList<Integer>();
		ArrayList<Boolean> blarr = new ArrayList<Boolean>();

		// 2. 1������ ���� ArrayList��ȿ� �ϳ��� ���� �־� �ּ���. ������ �����ô��� �����Դϴ�.
		strarr.add("�� ��Ʈ��");
		intarr.add(1);
		blarr.add(true);

		// 3. �ν��Ͻ� �Լ��� ����ϴ�. 2������ ���� 3���� ������ �ϳ��� system.out.println���� �ֿܼ� ����ּ���
		System.out.println(strarr);
		System.out.println(intarr);
		System.out.println(blarr);

		int[] abc = {1,2,3};
		Homework aa = new Homework();
		System.out.println(aa.intArr2(abc));
	}
}
