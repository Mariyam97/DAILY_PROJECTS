import java.util.Scanner;

public class DisplayNmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("What is Your Name ? ");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println(name.length());

	}

}
