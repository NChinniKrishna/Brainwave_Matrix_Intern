package ATM;

import java.util.Scanner;

public class UserInterface {
	
	private static int Status;
	public static void main(String[] args) {
		
		ATMOperationImpl impl =new  ATMOperationImpl();
		Scanner scan = new Scanner(System.in);
		int ATMNumber=939034;
		int ATMPin = 1412;
		System.out.println("------WELCOME TO ATM MACHINE------");
		System.out.println("ENTER YOUR ATM NUMBER: ");
		int ATMNumber2=scan.nextInt();
		System.out.println("ENTER YOUR ATM PIN: ");
		int ATMPin2=scan.nextInt();
		
		if(ATMNumber==ATMNumber2 && ATMPin==ATMPin2) {
			while(true) {
				System.out.println(" 1.Balance Enquiry \n 2.WithdrawAmount \n 3.DepositAmount \n 4.MiniStatement \n 5.Exit");
				System.out.println("ENTER YYOUR CHOICE: ");
				int ch=scan.nextInt();
				if(ch==1) {
					impl.ViewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter The Amount To Withdraw: ");
					double WithdrawAmount =scan.nextDouble();
					impl.WithdrawAmount(WithdrawAmount);
				}
				else if(ch==3) {
					System.out.println("Enter The Amount To Deposit: ");
					double DepositAmount =scan.nextDouble();
					impl.DepositAmount(DepositAmount);
				}
				else if(ch==4) {
					impl.MiniStatement();
				}
				else if(ch==5) {
					System.out.println("COLLECT YOUR ATM CARD \n THANK YOU ");
					System.exit(Status);
				}
			}
		}
	
		else {
			System.out.println(" INCORRECT ATM NUMBER OR PIN");
			System.out.println(" Type correct pin again");
			System.out.println("ENTER YOUR ATM NUMBER: ");
			int ATMNumber3=scan.nextInt();
			System.out.println("ENTER YOUR ATM PIN: ");
			int ATMPin3=scan.nextInt();
			
			
			if(ATMNumber==ATMNumber3 && ATMPin==ATMPin3) {
				while(true) {
					System.out.println(" 1.Balance Enquiry \n 2.WithdrawAmount \n 3.DepositAmount \n 4.MiniStatement \n 5.Exit");
					System.out.println("ENTER YYOUR CHOICE: ");
					int ch=scan.nextInt();
					if(ch==1) {
						impl.ViewBalance();
					}
					else if(ch==2) {
						System.out.println("Enter The Amount To Withdraw: ");
						double WithdrawAmount =scan.nextDouble();
						impl.WithdrawAmount(WithdrawAmount);
					}
					else if(ch==3) {
						System.out.println("Enter The Amount To Deposit: ");
						double DepositAmount =scan.nextDouble();
						impl.DepositAmount(DepositAmount);
					}
					else if(ch==4) {
						impl.MiniStatement();
					}
					else if(ch==5) {
						System.out.println("COLLECT YOUR ATM CARD \n THANK YOU ");
						System.exit(Status);
					}
				} 
			}else {
				System.out.print("account number or pin is wrong----->please restart the program");
			}
		}
	  }


}
