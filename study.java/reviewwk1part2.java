public class reviewwk1part2 {
  public static void main(String[] args) {
    int number = 42;
    String message1 = "The answer is: " +number;

    char a = 'A';
    String message2 = "The answer is: "+ a;

    int age =25;
    String message3 = "I am " + age + "year old.";
    
    double price =9.99;
    String item = "Book";
    String descripition = "The " + item + "costs $" +price;

    boolean isJavaFun = true;
    String message4 = "Is Java fun" + isJavaFun;

    char grade = 'A';
    String result = "Your grade is " +grade;

    String name = null;
    String message5 = "Hello, " + name;

    //Length()
    String str = "Hello";
    int length = str.length(); //returns the length of the number of characters

    //equals() 對比及對應boolean!?
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "World";

    boolean isEqual1 = str1.equals(str2);
    boolean isEqual2 = str1.equals(str3);
    System.out.println(isEqual1);
    System.out.println(isEqual2);



  }
}
