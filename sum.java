package java_practice;
import java.util.Scanner;


public class sum {
	
	public static void main(String []args) {
		sum1();
		
		int ans=sum2();
		System.out.println(ans);
	}
	

	
	// not returning any value
	
	 static void sum1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1=sc.nextInt();
	System.out.println("Enter second number:");
	int num2=sc.nextInt();
	
	int sum=num1+num2;
	System.out.println("the sum:"+sum);
	}
	
		// return the value
		
		static int sum2() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number:");
			int num1=sc.nextInt();
			System.out.println("Enter second number:");
			int num2=sc.nextInt();
			
			int sum=num1+num2;
			return sum;
			
		}

}
