import java.math.BigDecimal;

public class Customer { // blueprint 藍圖
  // ! Class content

  // Attributes
  // private -> by default, this object is not readable & not writable
  private String name;
  private String email;
  private double totalAmount;
  private boolean VIP;
  // ...

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isVIP(){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (int i=0; i<this.order.length; i++){
      total = total.add(BigDecimal.valueOf(this.orders[i].amount()));

      }
      return total.doubleValue() >=10000;

    }
  

  // Getter
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  // main method is NOT a must for a class file
  public static void main(String[] args) {
    String s = "hello";

    BigDecimal bd = new BigDecimal("1.3");

    // ! Create Object (new ...)
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");

    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());

    Order order1 = new Order();
    order1.add(new Item(15.3,9));
    order1.add(new Item(2.5,3));
    john.add(order1);

    Order order2 = new Order();
    order2.add(new Item(1000.3,9));
    System.out.println(mary.isVIP());//false

    Order order3 = new Order();
    order3.add(new Item(200.5,10));
    mary.add(order3);
    System.out.println(mary.isVIP());//true

    

  }
}