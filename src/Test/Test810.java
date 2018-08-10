package Test;

public class Test810 {
	
	double toDecimal(double number, int place) {
		double num = 1;
		for (int i=1; i<place; i++) {
			num *= 10;
		}
		return Math.round(number*num)/num;
	}

	public static void main(String[] args) {
		Test810 round = new Test810();
		System.out.println(round.toDecimal(0.461558,5));
	}
}