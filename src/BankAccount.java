public class BankAccount {

  private int accountNumber;
  private double accountBalance;
  private String customerName;
  private String email;
  private String phoneNumber;


//  ---------- CONSTRUCTOR ---------------
  public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }


// --------------- Getters ----------------
  public int getAccountNumber() {
    return accountNumber;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }


// --------------- Setters -----------------
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public void getAccountDetails() {
    System.out.println(
        "Acc. Number: " + this.accountNumber + "\n" +
        "Customer Name: " + this.customerName + "\n" +
        "Acc. Balance: " + this.accountBalance + "\n" +
        "Phone No.: " + this.phoneNumber + "\n" +
        "Email: " + this.email
    );
  }

  public void deposit(double amount) {
    double newBalance = this.accountBalance + amount;
    this.accountBalance = newBalance;
    System.out.println("Deposited Ksh." + amount + ". New Account Balance is Ksh." + newBalance);
  };

  public void withdraw(double amount) {
    double newBalance = this.accountBalance - amount;

    if (newBalance < 0) {
      System.out.println("Cannot withdraw Ksh." + amount + ". Current balance of " + this.accountBalance + " is insufficient.");
    } else if (newBalance >= 0) {
      this.accountBalance = newBalance;
      System.out.println("Ksh." + amount + " has been withdrawn. Current balance is Ksh." + newBalance);
    }
  };
}
