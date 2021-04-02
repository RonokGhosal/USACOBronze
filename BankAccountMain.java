package APComputerScience;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String BankAccount = "Ronok Bank";
        BankAccount bank = new BankAccount("MAMA", 100000.00);
         if(bank.getBalance()>=100000.00) {
        	double b = bank.withdraw(5000.00,"MAMA");
        	System.out.println("You withdrew 5000.00, so your balance is " + b);
         }else {
        	 double d = bank.deposit(5000.00,"MAMA");
        	 System.out.println("You deposited 5000.00, so your balance is" + d);
         }
	}

}
