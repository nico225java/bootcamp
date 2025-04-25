import java.util.Random;

public class DemoMath {
    public static void main(String[] args) {
        //abc-> absolute value絕對值
        //pow ->power 指數

        Math.abs(-3.0);
        // int -> double (safe-> auto-conversion)
        double result = Math.pow(2.0,3.0);
        System.out.println(result);//8.0
        
        
          // square root 開方
          System.err.println(Math.sqrt(81));//9.0

        System.err.println(Math.abs(-3.0));//3.0
        double value = -3.0;
        double result2 = 0.0;

        //0-48
        //1-49
        System.out.println(new Random().nextInt(49)+1);

          //Generate 6 different numbers between 1-49
          int[]marksix = new int [6];
          int k = 0;
          while (k < 6) { 
              marksix[k] = new Random().nextInt(49) + 1;
              k++;
          }
          
//!! *case review (improntant)
            // Generate 6 different numbers btw 1-49
            int[] marksix2 = new int[6];
            int unique = 0;
            boolean isDuplicated=false;
            while (unique < 6){
              int generatedValue = new Random().nextInt (49)+1;
              
                //Check if generated value is already in the array ->isDuplicated
                //code.. for loop +if ->用2次for loop 去做
                // for loop 一個結果，再用多一個
                found=false;
                for (int i=0; i<marksix2.length ; i++);
                if(marksix2 [i] == generatedValue){
                  found = true;
                  break;
                  isDuplicated = true;
                  break;
                
                }
              
                
              if (!isDuplicated) {
                  unique++;
              }
            }
        }
    }

