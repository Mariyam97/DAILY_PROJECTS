package Basics;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Character to find its ASCII VALUE : ");

char ch = sc.next().charAt(0);

int castAscii = (int) ch;

System.out.print("Enterd the Character its ASCII VALUE is : " + castAscii);

	}

}
