package Application;

import CredentialServices.GenerateEmailPassword; // importing credential services


// Main Method

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayEmpDetails em1=new displayEmpDetails("Mariyam","Sardar"); //Generate an email
		
		System.out.println(em1.showinfo()); // display the Credential
		
	}
}
