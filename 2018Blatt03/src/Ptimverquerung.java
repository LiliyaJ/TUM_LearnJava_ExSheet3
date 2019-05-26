public class Ptimverquerung {

	// checkt ob eine Zahl eine Primzahl ist
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// aid method for querSumm();
	// bestimmt welchen Faktor hat eine Zahl
	public static int factor(int n) {
		int numberOfFactors = 0;
		while (n != 0) {
			numberOfFactors++;
			n = n / 10;
		}
		return numberOfFactors;
	}

	// macht Quersumme
	public static int querSumm(int p) {
		int factor = factor(p);
		int summ = 0;
		for (int i = 1; i <= factor; i++) {
			int lastDigit = p % 10;
			p = p / 10;
			summ = summ + lastDigit;

		}
		return summ;
	}

	// checkt ob querSumm even ist
	public static boolean isEven(int p) {
		if (p % 2 == 0) {
			return true;
		}

		return false;
	}

	public static int querPrim(int n) {
		int digit = n;
		int summ = 0;
		if (n < 0) {
			return 0;
		} else {
			while (digit >= 0) {
				if (isPrime(digit)) {
					int querSummOfDigit = querSumm(digit);
					if (isEven(querSummOfDigit)) {
						summ += digit;
					}
					digit--;
				} else {
					digit--;
				}
			}
		}
		return summ;
	}

	public static void main(String[] args) {
		// test querPrim(eine positive Zahl)
		int n = 23;
		System.out.println(querPrim(n));

		// test querPrim(0)
		int n0 = 0;
		System.out.println(querPrim(n0));

		// test querPrim(eine negative Zahl)
		int nNeg = -23;
		System.out.println(querPrim(nNeg));
	}
}
