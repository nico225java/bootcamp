import java.util.Scanner;

public class DemoWhileloop {
  public static void main(String[] args) {
      int x = 2;
      x = x *2;
      x = x *2;
      x = x *2;
      System.out.println(x);//16

      //!!!For Loop(int,continue condition, modifier)**
      //!!!While Loop(countinue condition)**

        //Do While Loop
        //!No entry condition()
         int bomb = 67;// random number
         //while loop
         //Scanner (Collect user input)
         //!User A and B?
         //Adjust the range of numbers
         //Prompt Question:"Please input a number:"
         //continue condition

         int input=-1;
         int min = -1;
         int max = 100;
         int round=10;

         while ( input !=bomb){ 
         if (round % 2 == 0){
          user='A';
         }else{
          user='B';
         }
         }
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please input a number between " + min + "-" + max);
          input = scanner.nextInt();
          //Validate input if it is vaild
          //Adjust the range of numbers
          if(input>=min && input <=max){
            if(input>bomb){
              max = input -1;
            }else{
              min=input+1;

            }
            }
            round++;
            System.out.println("Game end. User" + user +"win.");
            scanner.close();

            //continue
            for(int i=0;i < 3; i++){
              if (i % 2 == 1) {
                continue; //skip the rest 
              }
            }

            //break 
            for( int i=0; i <3; i++){
              if (i)
            }
          }
     
         }


        //!how about 3 users?
      


