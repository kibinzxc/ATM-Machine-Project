import java.io.*;

public class deposit extends checkBal{
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int deposit;
	
	public static void dep() throws IOException{
		char checkDeposit;
		int newBalance = balance + deposit;
		System.out.println("==================================================");
		System.out.println("How much would you like to deposit? ");
		System.out.println("==================================================");
		deposit = Integer.parseInt(br.readLine());
		
		//First Time Deposit Policy
		if (newBalance < maintainBal && deposit < maintainBal){
			System.out.println("==================================================");
			System.out.println("Invalid Action\n" +
								"\n" + "To perform this action, you must deposit atleast 500 PHP for your first deposit");
		System.out.println("==================================================");
		}
		
		//Minimum Deposit is 50 PHP
		else if (deposit < 50) {
			System.out.println("==================================================");
			System.out.println("The minimum deposit is 50 PHP.");
			System.out.println("==================================================");
		}
		
		//Deposit
		else{
			System.out.println("==================================================");
			System.out.print("Confirm Deposit? (Y/N):"); //Confirmation
				checkDeposit = (char)br.read();
				br.readLine();
				
				//Confirm
				if(checkDeposit=='y' || checkDeposit=='Y'){
					balance = balance + deposit;
					System.out.println("==================================================");
					System.out.println("You have deposited " + deposit + "PHP");
					System.out.println("==================================================");
					System.out.println("Your new balance is " + balance + "PHP");
					System.out.println("==================================================");
				}
				
				//Cancel
				else if(checkDeposit=='n' || checkDeposit=='N'){
					System.out.println("==================================================");
					System.out.println("The action has been cancelled");
					System.out.println("==================================================");
			}
				//Error
				else{
					System.out.println("Error!");
			}
			
		}
	}
}
