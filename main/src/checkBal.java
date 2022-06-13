import java.io.*;
public class checkBal {
	//current balance
	public static int balance = 0; 
	//display balance
	public static void checkBal(){
		if (balance==0){
			System.out.println("==================================================");
			System.out.println("Your Balance is " + balance + " Php");
			System.out.println("==================================================");
			System.out.println("Warning: Your balance is below the maintaining balance\n");
			System.out.println("To avoid the closure of your account, deposit an amount" 
												+ "\n equal or above the maintaining balance before the deadline.");
			System.out.println("==================================================");
		}else{
		System.out.println("==================================================");
		System.out.println("Your Balance is " + balance + " Php");
		System.out.println("==================================================");}
	}
}
