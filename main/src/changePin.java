import java.io.*;
class changePin extends main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void changePin()throws IOException{
	
		int newPin, newPin1;
		char answer, answer1;
		System.out.println("==================================================");
		
		
		/*
		 *Anti-Typographical Error Change Pin
		 *Asks The user to Enter new PIN number
		 */
		System.out.print("Enter your new PIN number: ");
		newPin = Integer.parseInt(br.readLine());
		System.out.println("==================================================");
		//asks the user to re-enter PIN number
		System.out.print("Re-enter your new PIN number: ");
		newPin1 = Integer.parseInt(br.readLine());
		System.out.println("==================================================");
		
		//If the 2 PIN Number MATCHES
		if (newPin==newPin1){
			System.out.print("Confirm Change PIN Number? (Y/N):  "); //Confirmation
			answer = (char)br.read();
			br.readLine();
			//Confirm
			if(answer=='y' || answer=='Y'){
				main m = new main();
				m.pin = newPin;
				System.out.println("==================================================");
				System.out.println("Your PIN number has been successfully changed!");
				System.out.println("==================================================");
			}
			//Cancel
			else if(answer == 'n' || answer== 'N'){
				System.out.println("==================================================");
				System.out.println("The action has been cancelled");
				System.out.println("==================================================");
			}
			//Error
			else{
				System.out.println("Error!");
			}
		}
		//If the 2 PIN Number DO NOT MATCH
		else{
			//Confirmation
			System.out.print("PIN number do not match" + "\n" +"Do you want to try again? (Y/N):");
				answer1 = (char)br.read();
				br.readLine();
				System.out.println("================================================== \n");
				//Confirm
				if(answer1=='y' || answer1=='Y'){
					changePin();
				}
				//Cancel
				else if(answer1 == 'n' || answer1 == 'N'){
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
