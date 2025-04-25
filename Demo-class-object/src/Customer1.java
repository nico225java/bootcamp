import java.math.BigDecimal;

public class Customer1 { //blueprint 藍圖
  //!Class content

  //Attributes
  //private -> by default, this object is not readable & not writable
  private String name;
  private String email;
  //...

  //Setter
     public void setName(String name){
    this.name = name;

      public void setEmail(String email){
      this.email = email;

      //Getter
    public String getName(){
     return this.name;

     public String getEmail(){
      return this.email;
     }
}

  }
  }

    //main method is NOT a must for a class file
    //只係其中一個引擎
    //
  
    //public static void main(String[] args) {
      // String s="hello";

      //BigDecimal bd= new BigDecimal("1.3");
      //!Create Object(new...)
      Customer1 john = new Customer1();
      john.setName("John Chan");
      john.setEmail("");

      String name = John.getName();
      String email = John.getEmail();

      System.out.println(name);
      System.out.println(email);

      
      
    }
