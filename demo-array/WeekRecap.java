public class WeekRecap {
  public static void main(String[] args) {
    //Data Type: Primitives
    byte b1 = -128;
    byte b2 = 127;
    // byte b3 =128

     //short s1 = 33000;
     short s2 = 32000;
     short s3 = -32000;

     int i = 0; //唔好養成用i/j/k 因為其他"for loop 個類會用i/j/k as 代數
     int i1 = 2_100_000_000;
     int i2 = -2_100_000_000;

     //int to long (auto-convert)
     long l1 = 10L;

     float f1 =3.3f;
     double d1 = 10.9d;//要對mernory有理解

     char c1 = 'a'; ///!!!死記
     //int - int
     System.out.println('a' - 'a');//0

     //boolean -> are you a boy? yes, i am a boy.
     //isEldery->formula/definition
     int age = 65;
     int isEldery = age>=65;

     if (isEldery){
     System.out.println("I am not an elderly.");

     }

       if (age<65){
        System.out.println(" I am not an elderly.");

        boolean result = b2 > 1|| b2 > 10;//!! **
        boolean result2 = true || false;



        System.out.println(true && false); //false
        //true && true
        //true && false => false
        //true || false => true

        // +,-,*,/,%
        int x = 10;
        boolean isOdd = 10 % 2 ==1;//用reminder 一定係餘數1
        int a1 = 0;
        a1++;
        ++a1;
        System.out.println(a1++);//2
        System.out.println(a1);//3

        //if, else if, else
        int y=4;
        int u = 3;
        if (y>2){

        }else if (y > 1 && u > 1){

        }


       }
  }
}
