
public class GCD {

	public static void main(String[] args) {

		int a;
		int b;

		a = 2_178_309;
		b = 3_524_578;

//		a = 1_001_735_677;
//		b = 1_006_662_301;
//		a = 1_007_050_321;
//		b = 1_009_101_133;
//		a = 1_010_889_991;

//		a = 1097;
//		b = 65537;

		int gcd = GCDMetode(a, b);

	}

	private static int GCDMetode(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		int rest = max;
		int del;
		while (rest != 0) {

			del = max / min;
			rest = max % min;
			String mellomrom1 = tallLengde(max);
			String mellomrom2 = tallLengde(min);
			String mellomrom3 = tallLengde(del);

			System.out.println(max + mellomrom1 + " = " + del + mellomrom3 + " * " + min + mellomrom2 + " + " + rest);
			max = min;
			min = rest;
		}

		System.out.println();
		System.out.println("Stoorste Felles Divsor\ngcd(" + a + ", " + b + ") = " + max);

		return max;
	}

//	private static int inversMetode(int a, int b) {
//		int max = Math.max(a, b);
//		int min = Math.min(a, b);
//		int rest = max;
//		int del;
//		int gcd = 987654321;
//		
//		if (min == 0) {
//			return 0;
//		}
//		del = max / min;
//		rest = max % min;
//		String mellomrom1 = tallLengde(max);
//		String mellomrom2 = tallLengde(min);
//		String mellomrom3 = tallLengde(del);
//		System.out.println(max + mellomrom1 + " = " + del + mellomrom3 + " * " + min + mellomrom2 + " + " + rest);
//		
//		inversMetode(min, rest);
//		
//
//		return gcd;
//	}

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
