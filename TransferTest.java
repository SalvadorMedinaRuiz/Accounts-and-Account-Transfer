import java.util.Scanner;
public class TransferTest {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	Account acct1= new Account(); //referring to default constructor in Account class
	Account acct2= new Account(	1, "Sal", 200.00);//referring to mutated constructor in Account class
	
	acct1.changeName("Salvador"); //calling the account class method changename
	acct1.deposit(200.00); //deposits 200 dollars to acct 1
	
	String done= "Placeholder";
	
	int fromAcct;
	double amount;
	
	//acct2.transfer(acct1, 100); //transfers 100 dollars from acct2 to acct1
	
	do {
		System.out.println("Enter Account Number to trasnfer FROM:"); //if user chooses account 0(1), then we can assume account 1(2) is second option
		fromAcct=keyboard.nextInt();
		System.out.println("Enter Amount:");
		amount=keyboard.nextDouble();
		
		switch(fromAcct) {
		case 0:
			Account.transfer(acct1, acct2, amount);
			break;
		case 1:
			Account.transfer(acct2, acct1, amount); //gets transfer method in account class
		}
		
		keyboard.nextLine();//throws away last carriage return
		System.out.println("Enter \"quit\" if you are done or press the \"enter key\" to continue");
		done= keyboard.nextLine();
	} while(!done.equalsIgnoreCase("quit"));
	System.out.println(acct1);
	System.out.println(acct2);
	}

}
