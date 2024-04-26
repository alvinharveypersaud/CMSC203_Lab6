package Lab6;

public class SavingsAccount extends BankAccount
{
	private double rate = 0.0025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	
	public SavingsAccount(BankAccount account, double amount)
	{
		super(account, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	
	public void postInterest()
	{
		setBalance((getBalance()*rate)+getBalance());
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}

}
