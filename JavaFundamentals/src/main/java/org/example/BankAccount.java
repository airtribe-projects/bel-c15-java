package org.example;

// DEFAULT - Packages
// PROTECTED - Inheritance
public class BankAccount {
  private String accountName;

  private int accountBalance;

  private BankAccount() {
    accountName = "test";
    accountBalance = 100;
  }

//  public static BankAccount generateObject() {
//    if (_bankAccount == null) {
//      _bankAccount = new BankAccount();
//    }
//
//    return _bankAccount;
//  }

  public void setAccountName(String providedAccountName) {
    accountName = providedAccountName;
  }

  public void printAccountBalance() {
    System.out.println("Account balance: " + accountBalance);
  }

  public void setAccountBalance(int providedBalance) {
    if (providedBalance >= 0) {
      accountBalance = providedBalance;
    } else {
      System.out.println("Invalid balance. Balance cannot be negative.");
    }
  }
}
