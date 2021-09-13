 

public class GCD {

	public static void main(String[] args) {

		int a = 2_178_309;
		int b = 3_524_578;
		int gcd = GCDMetode(a, b);

		System.out.println("Stoorste Felles Divsor\ngcd(" + a + ", " + b + ") = " + gcd);

	}

	private static int GCDMetode(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		int rest = max;

		while (rest != 0) {
			int del = max / min;
			rest = max % min;
			System.out.println(max + " = " + del + "*" + min + " + " + rest);
			max = min;
			min = rest;
		}

		return max;
	}

}
