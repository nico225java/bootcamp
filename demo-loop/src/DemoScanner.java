import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please input a number:");
      int input = scanner.nextInt();

      System.out.println("input="+ input);

      //Determine if the input is odd or even number
      //its odd number.
      //its even number.
    if(input % 2 == 1){
      System.out.println("its odd number.");
    }else{
      System.out.println("Its even number.");
      
    }
    }
  }
  

