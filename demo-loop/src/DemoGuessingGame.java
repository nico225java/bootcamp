public class DemoGuessingGame {
  public static void main(String[]args){
    //1-100
    //Bomb=67

    //User A:93 (1-100)
    //User B:49(1-92)
    //User A:66(50-92)
    //User B:68(67-92)
    //User A:67(67-67) ->User B win.

     //random number
     // loop
    //Scanner (Collect user input)
    //!User A and B?
    //Adjust the range of numbers
    //Prompt Question: "Please input a number:"
    //continue condition

    //!"for loop" is you know how many time searching then using for loop,0-100 reading once time
    //!"while loop" is you dont know find out how many time, unknown the numbers of searching the bomb 

    int bomb=67;
    boolean found = false;
    int i = 0;
    while ( i<100){
      if( i == bomb){
           System.out.println("Bomb found at number " +1 + "!");
             found = true;
             break;

      }
      i++;
    }
    if (!found){
      System.out.println("Bomb not found!");

    }
    }
    

  }

