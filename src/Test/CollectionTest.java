package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest {

	// Set
	// �迭�� ���� �ǹ��ε� �ߺ��� ���� �ʴ´�, ������ ���� �ϳ��ۿ� ����.
	
	// List : add(); remove(); get(); size();
	// [1,2,3,4,5,6].add(3) ==> [1,2,3,4,5,6,3]
	// [1,2,3,4,5,6,3].remove(2) ==> [1,2,3,4,5,6,3]
	
	// Map : put(key,value); remove(); get(); size();
	// {a=apple,b=balloon,c=cat}; put(a,ant) ==> {a=ant,b=balloon,c=cat}; ���ο� ���� ������ ������ �ִ� ���� �������.
	
	public static void main(String[] args) {
		int[] arr = new int[5]; // [0,0,0,0,0] �ε��� ũ�⸦ ������� �Ѵ�.
		String[] arr1 = new String[5]; // [null,null,null,null,null] �ε��� ũ�⸦ ������� �Ѵ�.
		
		ArrayList list = new ArrayList(); // �ε��� ũ�⸦ �������� �ʾƵ� ��, ����ó�� �þ��.
		ArrayList<Integer> arr2 = new ArrayList(); // <>�� ������ Ÿ���� ù���� �빮�ڷ� ����� �Ѵ�.
		
		HashMap map = new HashMap(); // keyvalue key���� �ߺ��� �Ǹ� �ȵȴ�.
		
		
	}
}
