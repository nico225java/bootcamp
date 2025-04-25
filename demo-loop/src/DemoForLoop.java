public class DemoForLoop {
    public static void main(String[] args) {
        //Question: sum up 5 -15 ->result
        //the product of 16 - 20->result 2
        //Single for loop 

        int sum = 0;
        for (int i = 1; i <= 15; i++){
          sum +=i;
          System.out.println("Sum: " + sum);
          
        }
        int total=0;
        int product=1;
      for(int i=0; i<21;i++){
        if (i>=5 && i<=15){
          total +=i;
          continue;
        }
        if (i>=16 && i<=20){
          product *=i;
        }
      }
       System.out.println("total:" +total);
       System.out.println("product:" +product);

       for(int i = 10; i>=0; i--){
        System.out.println(i);
       }

       //! Nested Loop
       //i=0 ,j=0,1
       //i=1,j=0,1
       //i=2,j=0,1
       for( int i= 1; i<=3; i++){
          for(int j = 1; j<=3; j++){
            System.out.println("i=" + i +,",j=" + j);//?

          }
       }

        int z=5;
        z++;//6
        ++z;//7


        }

       }
