package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ATMOperationImpl implements ATMInterface {

	ATM atm = new ATM();
	Map<Double,String> ministmt =new HashMap<>();
	
	public void ViewBalance() {
		System.out.println("AvailableBalance:"+atm.getBalance());
	}

	public void WithdrawAmount(double WithdrawAmount) {
		
		if(WithdrawAmount%500==0) {
			if(WithdrawAmount<atm.getBalance()) {
				
				System.out.println("Collect the Cash: "+WithdrawAmount);
				atm.setBalance(atm.getBalance()-WithdrawAmount);
				ministmt.put(WithdrawAmount, "Amount Withdrawn");
				ViewBalance();
			}
			else {
				System.out.println("Insufficent Balance");
			}
		}
		else {
			System.out.println("Enter The Amount In Terms Of 500");
		}
	}
	public void DepositAmount(double DepositAmount) {
		System.out.println("DepositAmount:"+DepositAmount);
		atm.setBalance(atm.getBalance()+DepositAmount);
		ministmt.put(DepositAmount,"Deposited SuccessFully");
		ViewBalance();
	}

	public void MiniStatement() {
		Set<Double> set = ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
	 }

}
