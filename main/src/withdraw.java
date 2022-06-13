import java.io.*;
public class withdraw extends checkBal {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int withdrawn, remainingBal;
	
	public static void getWithdraw() throws IOException{
		char confirm1;
		char confirmW;
		char proceed;
		int withdrawn1, withdrawn2;
		
		
		//balance 0: cannot withdraw
		if(balance <= 0){
			System.out.println("==================================================");
			System.out.println("Invalid Action" + "\n"
								+ "You have no remaining balance in your account" );
			System.out.println("==================================================");
		
		//balance <= 500: Warnings + Notify -> closure of account
		}else if(balance <= 500){
			System.out.println("==================================================");
			System.out.println("Warning: Your balance will be below the maintaning balance if you proceed");
			System.out.println("Note: If your balance is below the maintaining balance it will result to closure of your account");
			System.out.print("Do you still want to continue? (Y/N): ");
			confirm1 = (char)br.read();
			br.readLine();
			if(confirm1=='y' || confirm1=='Y'){
				System.out.println("==================================================");
				System.out.println("How much would you like to withdraw? ");
				System.out.println("==================================================");
				withdrawn1 = Integer.parseInt(br.readLine());
				withdrawn = withdrawn1;
				remainingBal = balance - withdrawn;
				System.out.println("==================================================");
				System.out.print("Confirm Withdraw? (Y/N): ");
				confirm1 = (char)br.read();
				br.readLine();
				if(confirm1=='y' || confirm1=='Y'){
					if(withdrawn<100){
						System.out.println("==================================================");
						System.out.println("The minimum amount for withdrawal is 100.00 Php");
						System.out.println("==================================================");
					}else if(withdrawn < balance){
						balance = balance - withdrawn;
						remainingBal = balance - withdrawn;
						System.out.println("==================================================");
						System.out.println("You have withdrawn " + withdrawn + " Php");
						System.out.println("==================================================");
						System.out.println("Your remaining balance is " + remainingBal + "Php");
						System.out.println("==================================================");
						System.out.println("Note: Your account will be closed in 3 days");
						System.out.println("To avoid the closure of your account, deposit an amount" 
												+ "\n equal or above the maintaining balance within 3 days");
						System.out.println("==================================================");
					}else{
						System.out.println("==================================================");
						System.out.println("Invalid Action!");
						System.out.println("==================================================");
						}
				}else if(confirm1 == 'n' || confirm1 == 'N'){
					System.out.println("==================================================");
					System.out.println("The action has been cancelled");
					System.out.println("==================================================");
				}else{
					System.out.println("Error!");
				}	
			}
			
		} //balance above the maintaining balance1
			else{
			System.out.println("==================================================");
			System.out.println("How much would you like to withdraw? ");
			System.out.println("==================================================");
				withdrawn2 = Integer.parseInt(br.readLine());
				withdrawn = withdrawn2;
				remainingBal = balance - withdrawn;
			System.out.println("==================================================");
			System.out.print("Confirm Withdraw? (Y/N): ");
				confirmW = (char)br.read();
				br.readLine();
			if(confirmW=='y' || confirmW=='Y'){
				if(withdrawn<100){
						System.out.println("==================================================");
						System.out.println("The minimum amount for withdrawal is 100.00 Php");
						System.out.println("==================================================");
					}else if(withdrawn < balance){
						balance = balance - withdrawn;
						System.out.println("==================================================");
						System.out.println("You have withdrawn " + withdrawn + " Php");
						System.out.println("==================================================");
						System.out.println("Your remaining balance is " + remainingBal + " Php");
						System.out.println("==================================================");
					}else if(withdrawn == balance){
						System.out.println("==================================================");
						System.out.println("Are you sure to withdraw all the remaining balance of your account? (Y/N)");
						System.out.println("Warning: The action will result into closure of your account");
						System.out.println("==================================================");
						proceed = (char)br.read();
						br.readLine();
						if(proceed=='y' || proceed=='Y'){
							balance = balance - withdrawn;
							System.out.println("==================================================");
							System.out.println("You have withdrawn " + withdrawn + " Php");
							System.out.println("==================================================");
							System.out.println("Your remaining balance is " + remainingBal + " Php");
							System.out.println("==================================================");
							System.out.println("Note: Your account will be closed in 3 days");
							System.out.println("To avoid the closure of your account, deposit an amount" 
												+ "\n equal or above the maintaining balance within 3 days");
							System.out.println("==================================================");
						}else if(proceed=='n' || proceed=='N'){
							System.out.println("==================================================");
							System.out.println("The action has been cancelled");
							System.out.println("==================================================");
						}else{
							System.out.println("Error!");
						}	
							
					}else if (withdrawn > balance){
						System.out.println("==================================================");
						System.out.println("Invalid Action!");
						System.out.println("==================================================");
					}
			}else if(confirmW == 'n' || confirmW == 'N'){
				System.out.println("==================================================");
				System.out.println("The action has been cancelled");
				System.out.println("==================================================");
			}else{
				System.out.println("Error!");
				}
		}
		
	}
}
