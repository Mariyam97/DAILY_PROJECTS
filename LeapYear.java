import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Which year do you want to check? : ");
		int year = sc.nextInt();
		
		if(year%4==0 || year%400==0) {
			System.out.println(" LEAP YEAR ");
		}else {
			System.out.println(" NOT LEAP YEAR ");
		}
	}

}
