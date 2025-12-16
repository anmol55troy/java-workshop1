package week3tut;

public class BankAccount {
  private String accountNumber;
  private double balance;
  
  
  public BankAccount(String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      }
  
  //getter and setter for accountNumber
  public String getaccountNumber() {
	return accountNumber;  
  }
  
  public void setaccountnumber (String accountNumber) {
	  this.accountNumber = accountNumber;
  }
  
  
  public double getBalance() {
	  return balance;
  }
  
  
  public void getbalance(double balance) {
	  this.balance = balance;
  }
  
   void deposit(double amount ) {
	  if (amount > 0) {
		  balance += amount;
		  System.out.println("Deposited: " + amount);
	  }else {
		  System.out.println("Deposit amount must be positive.");
	  }
  }
   
   public void withdraw(double amount) {
       if (amount > 0) {
           if (balance >= amount) {
               balance -= amount;
               System.out.println("Withdrawn: " + amount);
           } else {
               System.out.println("Insufficient funds. Withdrawal denied.");
           }
       } else {
           System.out.println("Withdrawal amount must be positive.");
       }
   }
   
   
   
   @Override
public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
}

   public static void main(String[] args) {
	   BankAccount account = new BankAccount("123456789", 1000.0);
	   System.out.println(account);
	   
	   account.deposit(500.0);
	   System.out.println("Balance after deposit: " + account.getBalance());
	   
	   account.withdraw(200.0);
	   System.out.println("Balance after withdrawal: " + account.getBalance());
	   
	   account.withdraw(2000.0); // Attempt to withdraw more than the balance
	   
		
   }
}


