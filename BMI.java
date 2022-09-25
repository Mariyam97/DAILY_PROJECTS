import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Weigth of person :");
		int weigth = sc.nextInt();

		System.out.print("Heigth of person :");
		float heigth= sc.nextFloat();
		
	  float	 BMI =  (weigth/(heigth *heigth));
		
		//System.out.println("	BMI is = " + BMI);
		
		if(BMI < 18.5) {
			System.out.println(" Your BMI is  " + BMI + ", you are under weigth" );
			
		}else if(BMI > 18.5 && BMI < 25 ) {
			System.out.println(" Your BMI is  " + BMI + ", you have a normal weigth" );
	
		}else if(BMI > 25 && BMI < 30 ) {
			System.out.println(" Your BMI is  " + BMI + ", you have a slightly overweigth" );
	
		}else if(BMI > 30 && BMI < 35 ) {
		System.out.println(" Your BMI is  " + BMI + ", you are obese" );
       
		}else {
			System.out.println(" Your BMI is  " + BMI + ", you are clinically obese" );
}


	}		
		

}
