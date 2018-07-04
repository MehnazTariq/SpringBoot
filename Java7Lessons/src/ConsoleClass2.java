public class ConsoleClass2 {

	public static void main(String[] args) {
		int k = 2 * 7;
		int f = k + 4;
		int a = 4;
		int i = 0;
		int b = 0;
		while (i < 15) {

			for (int j = 0; j <= k; j++) {
				System.out.print("* ");
			}
			for (int c = 0; c < a; c++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print("* ");

			}
			System.out.println();

			k = k - 1;
			f = f - 1;
			b++;
			i++;
			a = a + 2;
		}
		k = 2 * 7;
		f = k + 4;
		a = k * 2 + 4;
		i = 0;
		b = 0;

		while (i < 15) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			for (int c = 0; c < a; c++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= b; j++) {
				System.out.print("* ");

			}
			System.out.println();

			k = k - 1;
			f = f - 1;
			a = a - 2;
			b++;
			i++;
		}
	}
}