package Basics;

import java.util.Scanner;
import java.lang.Math;
public class LargestofThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of testcases : ");
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			int result = Math.max(Math.max(num1,num2),num3);
			System.out.println("max value is : " + result);
			
		}

	}

}
