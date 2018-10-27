
public class BankAccount {

	private  String accountName;
	private   String accountNum;
	private   double balance; 
	private boolean isOverDraftAllowed;
	private  double overDraftSum;
	
	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftSum) {
		super();
		this.accountName = "Account";
		this.accountNum = "000001";
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
		this.balance = 0;
		
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}
	
	public void deposit (double amount) {
		if (amount>0)
		{
			balance+=amount;
			System.out.println("the deposit amount is " + amount + "balance is"+ balance);
		}
		else System.out.println("the amount for deposit is negetive");

	}
	public void withdrawal (double amount) {
		if (balance-amount>=0) {balance-=amount;}
		else if (isOverDraftAllowed=true) {
			if (balance-amount>=overDraftSum) {balance-=amount;}
			else System.out.println("the withdrawal is over the limit");
		}
	}

	
	

	

	
	
	
}
