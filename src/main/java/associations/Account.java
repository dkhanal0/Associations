package associations;

public class Account{

  // Add instance variables
   private String accountNum;

   private double balance;
   private Customer customer;

  // A constructor that initializes the account number and Customer, and sets the balance to zero.
  public Account(String accountNum, Customer customer){
   this.accountNum= accountNum;
   this.balance=0;
   this.customer= customer;
 }

    // getAccountNumber() - Returns a String representing the account number.
  public String getAccountNumber(){
      return accountNum;
  }

  // getCustomer() - Returns a reference to the Customer object associated with this account
public Customer getCustomer(){

      return (customer);
}

  // getBalance() - Returns the available balance (may be a decimal value)
public double getBalance(){
      return balance;
}


    }

