public class demoArray2 {
  public static void main(String[] args) {
      // array + for + if
      // find the max value in the array
      int box = Integer.MIN_VALUE;
      int [] numbers = new int [6];
      numbers [0] = -1;
      numbers [1] = -10;
      numbers [2] = -2;
      numbers [3] = -3;
      numbers [4] = -10;
      numbers [5] =-100;

      for (int i = 0; i < numbers.length;i++){
        if(numbers[i]> box);
        box = numbers[i];

      }
      System.out.println(" Max value = "+ box);

      //find min.salary
      int min = Integer.MAX_VALUE;
      int[] salaries = new int[4];
      salaries [0] = 14000;
      salaries [1] = 19000;
      salaries [2] = 21000;
      salaries [3] = 34000;
      for (int i = 0; i< salaries.length; i++){
        if(salaries [i]< min){
          min = salaries [i];
        }
        

      }
      System.out.println("Min. value=" +min);

    //John, Steven, Eric
    String [] name = new String[3];
    name [0] = "John";
    name [1] = "Steven";
    name [2] = "Eric";
    
    // Find the longest name in the array
    String longestName = "";// 無內容既empty code
    for (int i = 0; i < name.length; i++){
      if (name [i].length() >longestName.length()){//!! ^^
        longestName =name[i];

      }

    }
    System.out.println("the longest name:" +longestName);

    int[] nums = new int [4];
    nums[0] = 9;
    nums[1] = 8;
    nums[2] = 7;
    nums[3] = 10;
    // Print out the first even number -> break
    int firstEven = 0;
    for (int i=0; i < nums.length; i++){
      if (nums[i]%2 == 0){
        firstEven = nums[i];
        //break; // exit for loop
      }
    }
      System.out.println("First even number is " + firstEven);

      char[] directions = new char[7]; //^死記
      //l->left
      //r->right
      directions[0] = 'l';
      directions[1] = 'l';
      directions[2] = 'r';
      directions[3] = 'l';
      directions[4] = 'r';
      // l-> score +3
      //r -> score -2
      int score =0;
      for (int i = 0; i< directions.length; i++){
        if (directions[i]=='l'){//==問是否等於, =assign a=b
          score +=3;
        }else{
          score-=2;
        }
      }
      System.out.println("Total score=" +score);

      //Swapping 
      int w1 =2;
      int w2 =3;

      int backup =w1;
      w1 = w2;
      w2 = backup;
      System.out.println("w1="+w1);
      System.out.println("w2=" +w2);

      int [] marksix = new int [6];
      marksix[0]=5;
      marksix[1]=20;
      marksix[2]=2;
      marksix[3]=43;
      marksix[4]=39;
      marksix[5]=2;

       //>算法
      //Bubble sort 係搬石頭 /step by step

      //insertion Sort （自己再研究，note 有）
      //!! searching, counting basic 要識既野

      //counting
      char[] chs = new char[]{'1','p','a','p'};
      //count the numbewr of 'p'
      int countP=0;
      for (int i=0 ; i<chs.length; i++){
       if(chs[i]== 'p'){
        countP++;

       }
         


      }
      System.out.println("the no.1 chartacter: "+chs[0]);
   System.out.println("total how many p inside:" +countP);   
   char[] chs2 = new char [] {'a','b','a','b','z'};
   //有多少character, which 數量>1 ->o and p?
   //2
        // review 重點！ 
   int[] counts= new int[26]; //0-25
   for(int i=0; i<chs2.length;i++){
    int index = chs2[i] -'a';
    counts[index]++;
    //counts[chs2[i] - 'a']++;
    }
    int result = 0;
    for (int i=0; i <counts.length;i++){
      if (counts[i] > 1){
        result++;
      }
    }
System.out.println(result);//2

      //**homework **/
      //0 9 1 9 2 0 9 9
      // is ther any number appear 3 times or more?
      // true 
   }
     //int[] count2= new int[10]; //0-10

     //String [] lastNames = new String[] {"lau","Wong","Chan"};
     // 8 primitives + String

     String[] Surname= new String[]{"Lau, "Wong","Chan"}; 
     for(String i=0; i<Surname.length;i++){

      int index = chs2[i] -'a';
      counts[index]++;
      //counts[chs2[i] - 'a']++;
      }
      int result = 0;
      for (int i=0; i <counts.length;i++){
        if (counts[i] > 1){
          result++;



  }

