package Samples;

public class CalHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of Array : ");
        int size=sc.nextInt();

        int  arr[] = new int[size];

        for(int i=0; i<size; i++){
           arr[i] = sc.nextInt();
        }
      //  System.out.println("Enter the value in an array");
        //for(int i=0; i<size; i++){
            //System.out.print(arr[i] + " ");
         //   System.out.println();
       // }
        int sum=0;

        for(int i=0; i<size; i++){
            sum=sum+ arr[i];
        }
        System.out.println("sum of array =" +sum);
        int average= (int) Math.floor(sum/size);
        System.out.println(average);
    }
	}

}
