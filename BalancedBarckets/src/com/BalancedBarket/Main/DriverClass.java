package com.BalancedBarket.Main;

import com.BalancedBarcket.Service.*;

public class DriverClass {

	public static void main(String[] args, boolean checkBalance) {
		// TODO Auto-generated method stub
		CheckBalanceBarckets balanceBarcket = new CheckBalanceBarckets();
		String bracketExpression = "(){}[]"; //input to the program
		balanceBarcket.checkBalance(bracketExpression);
		if(checkBalance){ 
			System.out.println("The entered String has Balanced Brackets ");	
		} else{
			System.out.println("The entered Strings do not contain Balanced Brackets");	
		} 
	}

	

}
