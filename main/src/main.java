import java.io.*;
public class main extends checkBal {
        public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //current PIN Number / Default Password
        public static int pin = 102183; 
    	public static void main(String[] args) throws IOException {
    		userLogin();
    }
    public static void userLogin() throws IOException{
    	//new input PIN number
    	int enteredPin; 
    		
    	//3 max attempts
    	int totalAttempts = 3;
    	
    	while(totalAttempts != 0){
	    	System.out.print("Enter your PIN number: ");
	    	enteredPin = Integer.parseInt(br.readLine());
	    	if (enteredPin == pin){
	    		System.out.println("Welcome! Choose the operation you want to perform:");
	    		transaction();
	    		return;
	    	}else{
	    		System.out.println("Incorrect Pin " + "(" + totalAttempts + ") \n");
	    		totalAttempts--;
	    	}
	    }if(totalAttempts == 0){
	    	System.out.println("Maximum number of attempts exceeded");
	    }
    }
    //Main
    static void transaction()throws IOException{
    	int number;
    	do{
    		System.out.println("\n1. Check Balance"+ "\n"
    							+ "2. Deposit" + "\n"
    							+ "3. Withdraw" + "\n"
    							+ "4. Change Pin" + "\n"	
    							+ "5. Exit" + "\n");
    		System.out.print("Enter Choice: ");
    		number = Integer.parseInt(br.readLine());
    		if(number <= 5){
    		
    		switch(number){
    			case 1:
    				checkBal.checkBal();
    				newTransaction();
    				break;
    			case 2:
    				deposit.dep();
    				newTransaction();
    				break;
    			case 3:
    				withdraw.getWithdraw();
    				newTransaction();
    				break;
    			case 4:
    				changePin.changePin();
    				newTransaction();	
    				}
    		}else{
    		System.out.println("Invalid Choice! \n");
    		}
    	}while (number!=5);
    		System.out.println("Thank You!");
    		System.exit(0);
    }
    
    //Asks the user if the user want to new transaction
    static void newTransaction()throws IOException{
    	char confirmation;
    	//Confirmation
    	System.out.print("\nDo you have another transaction? (Y/N): ");
			confirmation = (char)br.read();
			br.readLine();
		//Confirm
    	if(confirmation=='y' || confirmation=='Y'){
			transaction();	
		}
		//Cancel
		else if(confirmation == 'n' || confirmation== 'N'){
			System.out.println("Thank you!");
			System.exit(0);
		}
		//Error
		else{
			System.out.println("Error!");
			newTransaction();
			}
    }
}

