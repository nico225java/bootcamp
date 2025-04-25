import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a name:");
    String name = scanner.nextLine();   //**nextLine */
      System.out.println(name);
      if (name.contains("t")){
        System.out.println("Yes.Your name contains t charcater.");
      }else{
        System.out.println("No. Your name not contains t charcater.");
      }

    // System.out.println("input=" + input);

    // Determine if the input is odd or even number
    // its odd number.
    // its even number.
    //if (input % 2 == 1) {
    //  System.out.println("Its odd number.");
    //} else {
     // System.out.println("Its even number.");
   // }
  }
}