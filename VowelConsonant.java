package Basics;

import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of testcases : ");
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
		System.out.print("Enter the Character : ");
		char charActor= sc.next().charAt(0);
		
		
		switch(charActor) {
		
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' : System.out.println("Enter the Character is VOWEL : " + charActor);
					break;
		default:
			System.out.println("Enter the Character is Consonants : " + charActor);
		}
	}
	}
}
