import java.util.Scanner;

public class SwapAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("A :");
int A = sc.nextInt();

System.out.print("B :");
int B = sc.nextInt();

A=A-B;
B=A+B;
A=B-A;

System.out.println("A :" + A);
System.out.println("B :" + B);
	}

}
