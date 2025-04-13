

public class reviewwk1 {
  public static void main(String[] args) {
      int age;// define an integer variable
      age = 25;// Initialization of 'age' = value 25
      // -> int age =25; 
      double salary; //define a double variable name salary,
      salary = 50000.0;//storage number with 0.01/0.0002,
      //-> double salary = 500000.0;
      String name; 
      name = " John";
      //-> String name = "John";
      double salary2 = 5000.0;
      salary = salary +salary2; // variable reassignment
      System.out.println(name + "has increases salary $"+ salary2);
      System.out.println("total monthly salary:" +salary);
      System.out.println(salary);

      // !!->fundamental step of declaring and intializing variable 
      //!!起屋仔!!
      //-> appropriate data type and assign an intial value
      //!!if not declared and intialized, it will result in compilation error.
      //!起好屋仔既重要性
      //Question1: How do we declare and intilize variables?
      //-> using Primitives to declare and 
      //Question2:what are the differences between them?
      System.out.println(salary);
   //!Primitive data type -> basic data type not an objects =>simple values 
      //boolean -> for true //false;default is false,size 1bit
      //byte ->[-128,127]// default is "0",size 8bits
      //short->[-32768-32767]//default is "0", size 16 bits
      //char->[\u0000',\uffff] or [0.65535]//default '\u0000'
      //int-> [-2147,483,648 to 2,147,483,647]//default is 0 32bits
      //long->-2^63,2^63,-1;//default is 0.
      //float ->0.000 //?都係點數，有講過點解，但唔記得
      //double->0.000 //代表點數
      boolean 元 = true;///?? 都係自己assign true/false into 元?
      System.out.println("元is："+元);
      byte num = 10; // 最大數值只去到 127；
      //byte num1 = 128;=>error
      short count = 1000;//最大數值只去到 32767；
      //short count1 = 32768;=>error
      int number = 20;//記存整數,最大數值可到 2147483647,
      //int number1 = 2147483648;=>error
      long mobile = 91912343;//store large whole no.
      double salary3 = 30000.5;//記存有小數點之數值,記圓周率
      float temperature = 36.5f;//?加f 既意思係？？ //!比JAVA知係float既意思唔係double<-精度控制
      char dog = 'd';//store a single character,
      char d = '你';//->表達字要加''',表達數字不用加上
      boolean isPassed = true;
      boolean isGenius = false;
      int number3;
      number3 = num + number;
      System.out.println(number3);
      double decimal2 = 10.0d;
      float floatValue = 0.0f;
      long bignumber = 100000000000L;
      











}
  //System.out.println(salary);//!if out of the {}scope is no longer accessible!!
}

