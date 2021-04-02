package APComputerScience;

public class BankAccount {
 private String password;
 private double balance;
 private static double intRate;
 public BankAccount(){
	 password = "";
	 balance = 0.0;
 }
 /
 }
 public BankAccount(String pass, double bal) {
	 password = pass;
	 balance = bal;
 }
  public String getPassword(){
	return password;
}
public double getBalance() {
	return balance;
}
public void setPassword(String mutatedpass) {
	password = mutatedpass;
}
public void setBalance(double mutatedbalance) {
	balance = mutatedbalance;
}
public double withdraw(double withdrawamount, String pass) {
	if(pass==password) {
		return balance-withdrawamount;
	}else {
		System.out.println("Stop it you thief get out");
		return 0.0 ;
	}
	
	
}
public double deposit(double depositamount, String pass) {
	if(pass==password) {
		return balance + depositamount;
	}else {
		System.out.println("Thank you kind soul but I am a billionare");
		return 0.0;
	}
	
}
}
