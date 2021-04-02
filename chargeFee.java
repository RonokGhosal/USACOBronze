package APComputerScience;

public class chargeFee {
public static void chargeFee(BankAccount b, String password, double fee){ 
	
}
	final double MIN_BALANCE = 10.00;
		if(b.getBalance() < MIN_BALANCE)
			b.withdraw(password,fee);

	}
	public static void main( String[] args){
		BankAccount andysAccount = new BankAccount("AndyS", 7.00);
		chargeFee( andysAccount, "AndyS", FEE);
		
}
