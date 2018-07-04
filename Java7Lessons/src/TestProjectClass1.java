import java.util.Scanner;

public class TestProjectClass1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first digit:");
		int num1 = in.nextInt();

		System.out.println("Enter the Second digit:");
		int num2 = in.nextInt();

		System.out.println("Enter the Arthimetic Operation sign to be performed:");
		char arthOperation = in.next().charAt(0);

		if (arthOperation == '+') {
			MethodAddition Add = new MethodAddition();
			Add.addNumbers(num1, num2);
		}

	}
}