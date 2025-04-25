public class demoArray {
      public static void main(String[] args) {
        //assign int value 3 into int variable
          int x1 = 3;
          int x2 = 4;
          int x3 = -7;
      
          //array[]
          //right hand side -> creating an array with size 3.
          //left hand side -> assign int array object to int array type (variable)
          int[] arr = new int [3];//now, we got 3 int boxes able to store 3 int values.

          //write
          //First box (index)
          arr[0]=3;
          //.second box
          arr[1]=4;
          //thrid box
          arr[2] = -7;

          //!arr with arr2 will not show togehter
          //arr is building name
         
          //question: int array with size 5.args//10,7,4,-100,6
          int[] arr2= new int [5];
          arr2[0]=10;
          arr2[1]=7;
          arr2[2]=4;
          arr2[3]=-100;
          arr2[4]=6;
          System.out.println(arr2);

          //Question: double array with size 4.
          //assign 4 double values into the array

          double [] arr3 = new double[4];
          arr3[0] = 10.3;
          arr3 [1] = -4.2;
          arr3 [2] = 3.3;
          arr3 [3] = 7.8;
          
            System.out.println(arr[1]);
            System.out.println(arr2[2]);
            System.out.println(arr3[0]);

            double amount = 99.9;
            arr3 [0]=amount;//assign double value into a double variable
            System.out.println(arr3[0]);//99.9

            //String array
            //size 3, with 3 String value

            String [] arr4 = new String [3];
            arr4 [0]="hello";
            arr4 [1]="6122435";
            arr4 [2]="call";
            
            //double array, for loop +sysout print out value
             
            double [] amounts = new double[6];
            amounts [0]= 10.9;
            amounts [3] = 14.1;
            amounts [5] = 99.9;
            
            for (int i =0; i <amounts.length; i++){

            }
            System.out.println(amounts[i]);

            //add 1.5 to all array values
            for (int i=0; i < amounts.length; i++){
              //amounts[i] = amounts[i] +1.5;
              amounts[i] += 1.5;
              System.out.println(amounts[i]);

            }
            //for + if
            //print out those values > 100
            for (int i=0; i<amounts.length; i++){
            if(amounts [i]>100){
              System.out.println(amounts[i]);
            }
            
            for (int i=0 < amounts.length; i++);{
            }
              if (amounts[i] <= 100){
                continue;
              }
              System.out.println(amount[i]);
              
            
            //int array
            //Find even number, and then print out "Age=x"
            int [] age = x;
            int [] ages = new int [4];
            ages [0] = 19;
            age [1] = 14;
            ages [2] = 10;
            ages [3] = 65;
            for (int i = 0; i <ages.length; i++){
              if(ages[i]%2==0){
                System.out.println("Age=" + ages[i]);
              }
            }
          }
        }
      }
    

          

  


