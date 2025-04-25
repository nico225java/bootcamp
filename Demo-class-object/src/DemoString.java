import java.math.BigDecimal;
import java.time.LocalDate;

public class DemoString {
  public static void main(String[] args) {
    //String -> Literal Pool
    String s = "hello";
    String s1 = "hello";
    //2個指針指住hello^

    //"abc";<- 都係create object
    //=42; 
    String s2 = "hello1";//different String -> new String object
    
    //so, at this moment, we got 2 String objects in memory (hello and hello1)
    //but we have 3 object references (s, s1 and s2)
    //String 無limitation -> 但相對會拉慢個system/或要好高配  10K also ok

    //Operations
    s = s + "world";//s->"helloworld" 
    //只可以建立新object, 但唔可以re-decarify 
    //so, at this moment, we got 3 String objects in memory( hello, hello1, helloworld)

    s1 = s1 + "???";//s1->"hello???"
    //so, at this moment, we got 3 String objects in memory(hello1, helloworld, hello????)
    //"hello" object will be collected by JVM (Auto -GC)
    //你要了解到你做緊係增加緊object 定驟減緊object
    //-> 所謂既算法/algorithm -> program(performance: runtime speed and memory usage)
    //Time compliexity and Space compliexity(講緊個速度，同使用既空間)

        //new is a must as a new object
    String s4 = new String("hello");
    System.out.println(s2 == s4);//false

    String s5= "hello???";
    System.out.println(s1 == s5);//false   點解s1 not equal to s5
    // "+" -> new String()
    String s6="hello???";
    System.out.println((s5 == s6));//true

    String s7 = "hello".concat("???");// source code -> new String()
    System.out.println(s7 == s5);//false

    String s8 = String.valueOf("hello???");
    System.out.println(s8 == s5);//true
    
    String s9 = new String("hello???");
    System.out.println(s8 == s9);//false,呢個係check 地址，唔係check s8 & s9 係唔係equal

    String s10 = new String("hello???").intern();
    System.out.println(s5 == s10);//true

    int[] arr = new int[3];//IN Java, array is one of the most raw structure.()=> 如果再落more than java level
    int x = 3; // Primitive is also the raw structure in Java.

    String s12 = "hello";
    System.out.println(s12.replace('h','x'));//slow -> for loop

    String s13 = s12.substring(1);//ellh (char Array)

    //s12.toCharArray();
    //method 可以用但唔好overuse
    //要好熟識功能原理

    s12.charAt(4);

    BigDecimal bd = BigDecimal.valueOf(0.0);//add, subtract, multiply, divide
    bd = bd.add(BigDecimal.valueOf(1.2));
    System.out.println(bd == bd2);//false (唔係同一個地址，我地唔係比較緊表面答案)

    LocalDate ld = LocalDate.of(2025,4,24);
    LocalDate ld2 = LocalDate.of(2025,4,24);
    System.out.println(ld == ld2);//false
    System.out.println(ld.equals(ld2));//true, check value




  }
}
