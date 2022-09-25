import java.util.Scanner;
public class TwoDigitAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("First Digit :");
		int num1 = sc.nextInt();

		System.out.print("Second Digit :");
		int num2= sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.print("Sum is = " + sum);
	}

}
