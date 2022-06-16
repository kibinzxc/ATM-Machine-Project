import java.io.*;
public class withdraw extends checkBal {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int withdrawn, remainingBal;
	
	public static void getWithdraw() throws IOException{
		char confirm1;
		char confirmW;
		char proceed;
		int withdrawn1, withdrawn2;
		
		
		//Invalid Action (zero balance)  
		if(balance <= 0){
			System.out.println("==================================================");
			System.out.println("Invalid Action" + "\n"
								+ "You have no remaining balance in your account" );
			System.out.println("==================================================");
			}
			
		/* Warning (continuing will result to account closure)
		   Balance is equal or below the maintaining balance */ 
		else if(balance <= maintainBal){
			System.out.println("==================================================");
			System.out.println("Warning: Your balance will be below the maintaning balance if you proceed");
			System.out.println("Note: If your balance is below the maintaining balance" +"\n"+
						"      it will result to closure of your account. \n");
			System.out.print("Do you still want to continue? (Y/N): ");//Confirmation
			confirm1 = (char)br.read();
			br.readLine();
			
			//Confirm
			if(confirm1=='y' || confirm1=='Y'){
				System.out.println("==================================================");
				System.out.println("How much would you like to withdraw? ");
				System.out.println("==================================================");
				withdrawn1 = Integer.parseInt(br.readLine());
				withdrawn = withdrawn1;
				remainingBal = balance - withdrawn;
				System.out.println("==================================================");
				System.out.print("Confirm Withdraw? (Y/N): "); //Confirmation
				confirm1 = (char)br.read();
				br.readLine();
				
				//Confirm
				if(confirm1=='y' || confirm1=='Y'){
					//Minimum Withdrawal is 100 PHP
					if(withdrawn<100){
						System.out.println("==================================================");
						System.out.println("The minimum amount for withdrawal is 100.00 PHP");
						System.out.println("==================================================");
					}
					//Withdrawal w/ notice of account closure
					else if(withdrawn <= balance){
						balance = balance - withdrawn;
						System.out.println("==================================================");
						System.out.println("You have withdrawn " + withdrawn + " PHP");
						System.out.println("==================================================");
						System.out.println("Your remaining balance is " + remainingBal + " PHP");
						System.out.println("==================================================");
						System.out.println("Note: Your account will be closed in 3 days");
						System.out.println("To avoid the closure of your account, deposit an amount" 
												+ "\n equal or above the maintaining balance within 3 days");
						System.out.println("==================================================");
					}
					//Invalid Action (Entered amount exceeded the remaining balance) 
					else{
						System.out.println("==================================================");
						System.out.println("Invalid Action!");
						System.out.println("==================================================");
						}		
				}
				//Cancel
				else if(confirm1 == 'n' || confirm1 == 'N'){
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
			//Balance is above the maintaining balance
		else{
			System.out.println("==================================================");
			System.out.println("How much would you like to withdraw? ");
			System.out.println("==================================================");
				withdrawn2 = Integer.parseInt(br.readLine());
				withdrawn = withdrawn2;
				remainingBal = balance - withdrawn;
			System.out.println("==================================================");
			System.out.print("Confirm Withdraw? (Y/N): "); //Confirmation
				confirmW = (char)br.read();
				br.readLine();
				
			//Confirm
			if(confirmW=='y' || confirmW=='Y'){
				//Minimum Withdrawal is 100 PHP
				if(withdrawn<100){
						System.out.println("==================================================");
						System.out.println("The minimum amount for withdrawal is 100.00 PHP");
						System.out.println("==================================================");
					}
					//Withdraw amount is less than the balance
					else if(withdrawn < balance){
						balance = balance - withdrawn;
						System.out.println("==================================================");
						System.out.println("You have withdrawn " + withdrawn + " Php");
						System.out.println("==================================================");
						System.out.println("Your remaining balance is " + remainingBal + " PHP");
						System.out.println("==================================================");
					}
					/*Withdrawing all the remaining balance
					  Warning (continuing will result to account closure)*/
					else if(withdrawn == balance){
						System.out.println("==================================================");
						//Confirmation
						System.out.println("Are you sure to withdraw all the remaining balance of your account? (Y/N)");
						System.out.println("Warning: The action will result into closure of your account");
						System.out.println("==================================================");
						proceed = (char)br.read();
						br.readLine();
						//Confirm w/ Notice of account closure
						if(proceed=='y' || proceed=='Y'){
							balance = balance - withdrawn;
							System.out.println("==================================================");
							System.out.println("You have withdrawn " + withdrawn + " PHP");
							System.out.println("==================================================");
							System.out.println("Your remaining balance is " + remainingBal + " PHP");
							System.out.println("==================================================");
							System.out.println("Note: Your account will be closed in 3 days");
							System.out.println("To avoid the closure of your account, deposit an amount" 
												+ "\n equal or above the maintaining balance within 3 days");
							System.out.println("==================================================");
						}
						//Cancel
						else if(proceed=='n' || proceed=='N'){
							System.out.println("==================================================");
							System.out.println("The action has been cancelled");
							System.out.println("==================================================");
						}
						//Error
						else{
							System.out.println("Error!");
						}			
					}
					//Invalid Action (Entered amount exceeded the remaining balance) 
					else if (withdrawn > balance){
						System.out.println("==================================================");
						System.out.println("Invalid Action!");
						System.out.println("==================================================");
					}		
			}
			//Cancel
			else if(confirmW == 'n' || confirmW == 'N'){
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
