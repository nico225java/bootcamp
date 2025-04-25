import java.math.BigDecimal;
import java.time.LocalDate;

public class Week2Recap {
  private int age;
  private String name;

    //setter
  public void setAge(int age){
  this.age=age;
  }
   //getter
  public int getAge(){
    return this.age;
  }

  //compareTo
  public int compareTo(Week2Recap week2Recap){
    if(this.age == week2Recap.getAge()){
      return 0;
    }else if(this.age>week2Recap.getAge()){
      return 1;
    }else{
      return -1;
    }
  }
  
  public boolean isOlderThan(week2Recap week2Recap){
    if (this.age>week2Recap.getAge()){
    return true;
  }
return false;
  }

   public static void main(String[] args) {
    //8 Primitives, String
    //BigDecimal
    //LocalDate

    //Store a set of values -> array
    LocalDate[] dates = new LocalDate[3];
    BigDecimal[] number = new BigDecimal[4];

    //Wrapper Class
    //Interger, Short, long, Byte
    //Double, Float
    //Character
    //Boolean 
    //autobox(from primitive to Warpper), unbox(from Warpper Class to Primitive)

    //Primitives - upcast, Downcast
    //byte ->short -> int -> long -> float -> double
    //char ->int
    long x = k; //upcast

    //During compile time, "unsafe" on type convrtsion->Exlicit conversion
    // During runtime, JVM find 4L is safe for this conversion
    int h = (int) 4L;

    ///!overflow****
    byte b =(byte)138L;
    System.out.println(b);//-118

    //Math (pow,round,sqrt,max, min)*****
    //BigDecimal(esp.->subtract,multiply,divide)

    //String 
    String s1 = "hello";// Assign the object address of "hello" object into s1.
    String s2 = new String("hello");
    //when you use double quote"" to create String object, Java checks if the "hello" object exits
    //So, in this case, Java assign the same object address of s1 into s3.
    String s3 = "hello";
    System.out.println(s1.equals(s2));//true (check pw 岩唔岩係用equals 去read，== 就錯concept)
    System.out.println(s1.equals(s2));//true
    System.out.println(s1 == s2);//false, "==" checks if they are with same object address
    System.out.println(s2 == s3);//false
    System.out.println(s1 == s3);//true

    //The above theory applies to all objects
    BigDecimal bd1  = BigDecimal.valueOf(3);
    BigDecimal bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1 == bd2);//true

    //The above theory applies to all objects
    BigDecimal bd3

    Week2Recap w1 = new Week2Recap();
    w1.setAge(12)


    

  }
  }
