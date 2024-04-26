package Lab6;

public class CheckingAccount extends BankAccount
{
	final private static double FEE = 0.15;
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		if((amount + FEE) > getBalance())
		{
			return false;
		}
		return super.withdraw(amount + (FEE));
	}
}
