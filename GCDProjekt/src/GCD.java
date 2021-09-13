
public class GCD {

	public static void main(String[] args) {

		int a = 2_178_309;
		int b = 3_524_578;
		int gcd = GCDMetode(a, b);

		System.out.println();
		System.out.println("Stoorste Felles Divsor\ngcd(" + a + ", " + b + ") = " + gcd);

	}

	private static int GCDMetode(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		int rest = max;
		int del;
		while (rest != 0) {
			String mellomrom1 = tallLengde(max);
			String mellomrom2 = tallLengde(min);
			del = max / min;
			rest = max % min;
			System.out.println(max + mellomrom1 + " = " + del + "*" + min + mellomrom2 + " + " + rest);
			max = min;
			min = rest;
		}

		return max;
	}

	private static String tallLengde(int tall) {
		int length = (int) (Math.log10(tall) + 1);
		String mellomrom;
		switch (length) {
		case 1:
			mellomrom = "          ";
			break;
		case 2:
			mellomrom = "         ";
			;
			break;
		case 3:
			mellomrom = "        ";
			;
			break;
		case 4:
			mellomrom = "       ";
			;
			break;
		case 5:
			mellomrom = "      ";
			;
			break;
		case 6:
			mellomrom = "     ";
			;
			break;
		case 7:
			mellomrom = "    ";
			;
			break;
		case 8:
			mellomrom = "   ";
			;
			break;
		case 9:
			mellomrom = "  ";
			;
			break;
		case 10:
			mellomrom = " ";
			break;
		default:
			mellomrom = "";
			break;
		}

		return mellomrom;
	}

}
