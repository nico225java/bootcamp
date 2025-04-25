import java.util.Scanner;

public class Demoif{
    public static void main(String[] args) {
        String s = "goodbye";
        if (s.equals("hello")){
          System.out.println("this is hello");
        }else if (s.equals("Hello")){
        System.out.println("this is Hello");
          }

          Scanner scanner = new Scanner(System.in);
      System.out.println("Please input a number:");
      int input = scanner.nextInt();

          //based premium = 120

          //Female 40 or above , premium 8% more
          // Male 16 or above, premium 3% more
          // Smoker -> 7% more
          // age 70 or above -> 20% more
          //->using if and else if 

          //1.felmale 40 NS(nonsmoker) ->8
          //2.Felmale 40 S-> 8 + 7
          //3. Male 16NS ->3
          //4.Male 16 S ->3 + 7
          //....
          boolean isFemale = true;// 2 cases(2conditions)
          boolean isSmoker = true;//2 cases (2conditions)
          int age = 80;
          double premium = 120.0;
          double extraRate = 0.0;
          if(isFemale){
             if(age>=70){
              extraRate += 0.2;
             }else if (age >=16){
              extraRate +=0.03;
              
             }

             }

          }else{//male

          }

          System.out.println(premium);//

        }
    }

