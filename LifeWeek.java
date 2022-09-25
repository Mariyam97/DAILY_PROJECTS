import java.util.Scanner;
public class LifeWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Age of person :");
		int age = sc.nextInt();
		
		int yearRem = 90 - age;
		int monthRem = yearRem * 12;
		int weekRem = yearRem * 52;
		int daysRem = yearRem *365;
		
		System.out.println("You Have " + daysRem + " days ," + weekRem + " Weeks ," +" and " +  monthRem +" months left.");
	}

}
