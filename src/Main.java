public class Main {
  public static  void main(String[] args) {
    BankAccount acc1 = new BankAccount();

    acc1.setAccountNumber(12220229);
    acc1.setAccountBalance(200_000);
    acc1.setCustomerName("Emmanuel Omulo");
    acc1.setPhoneNumber("+254 705 994281");
    acc1.setEmail("eomulo@protonmail.com");

    acc1.getAccountDetails();

    acc1.deposit(50_000);
    acc1.withdraw(22_000);
    acc1.withdraw(30_000.57);
    acc1.withdraw(197999.43);

    acc1.getAccountDetails();
  }
}
