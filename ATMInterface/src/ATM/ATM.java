package ATM;

public class ATM {
	private double Balance;
	private double DepositAmount;
	private double WithdrawAmount;
	
	public ATM() {
		
		super();
	}
	
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		DepositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return WithdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		WithdrawAmount = withdrawAmount;
	}
	@Override
	public String toString() {
		return "ATM [Balance=" + Balance + ", DepositAmount=" + DepositAmount + ", WithdrawAmount=" + WithdrawAmount
				+ "]";
	}

}
