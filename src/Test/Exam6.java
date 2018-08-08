package Test;

public class Exam6 {

	String getSumStr(String[] strArr) {
		String str = "";
		for (int i = 0; i < strArr.length; i++) {
			if (i == strArr.length - 1) {
				str += strArr[i];
			} else {
				str += strArr[i] + " ";
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Exam6 a = new Exam6();
		String[] w = { "w", "a", "t", "e", "r" };
		System.out.print(a.getSumStr(w));
	}
}
