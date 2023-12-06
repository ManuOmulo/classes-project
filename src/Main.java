public class Main {
  public static  void main(String[] args) {
    BankAccount acc1 = new BankAccount(
        128282929,
        140_000,
        "Emmanuel Omulo",
        "eomulo@protonmail.com",
        "+254 705 994281"
    );

    acc1.getAccountDetails();

    acc1.deposit(50_000);
    acc1.withdraw(22_000);
    acc1.withdraw(30_000.57);
    acc1.withdraw(197999.43);

    acc1.getAccountDetails();
  }
}
