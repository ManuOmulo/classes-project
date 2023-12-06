public class Customer {

  private String name;
  private double creditLimit;
  private String email;


//  -------------- CONSTRUCTORS -----------
  public Customer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public Customer(String name, String email) {
    this(name, 100_000, email);
  }

  public Customer() {
    this("John Doe", "example@example.com");
  }


  //  ---------------- Getters ----------------
  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
