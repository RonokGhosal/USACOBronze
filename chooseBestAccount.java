package APComputerScience;

public class chooseBestAccount {
	public static void chooseBankAccount(BankAccount better, BankAccount b1, BankAccount b2)
	{
		if(b1.getBalance()>b2.getBalance())
			better = b1;
		else
			better = b2;
	}
	public static void main(String[] args) {
		BankAccount briansFund = new BankAccount("BrianL", 10000);
		BankAccount paulsFund = new BankAccount("PaulM", 90000);
		BankAccount betterFund = null;
		
		chooseBankAccount(betterFund, briansFund, paulsFund);
	}
	}

