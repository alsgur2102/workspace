package Test;

import java.util.HashMap;

public class HashExam {

	HashMap<String,int[]> makeMap(String[] strArr,int[] intArr) {

		// [a,b,c]
		// [1,2,3]

		// {a=[1,2,3],b=[1,2,3],c=[1,2,3]}

		HashMap<String,int[]> map = new HashMap<String,int[]>();
		for (int i=0; i<strArr.length; i++) {
			String k = strArr[i];
			map.put(k, intArr);
		}
		return map;
	}
	
	public static void main(String[] args) {
		HashExam hash = new HashExam();
		String[] key = {"a","b","c"};
		int[] value = {1,2,3};
		System.out.println(hash.makeMap(key, value));
	}
}
