import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class ForloopEx {
    public static void main(String[] args) {

       // 1. Print 6 times hello
    // Use: for loop
    String x = "hello";
    for (int i=0 ; i < 6;i++){
      System.out.println(x);//點解我無定義到 (x)with (i)既關係都出到？

    }
      // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    //Use: Array
    int[] num = new int[]{0,1,2,3,4};
    System.out.println(Arrays.toString(num)); //點解用String 都print 到丫係唔係concept 錯丫？
  

        // 3. Print even numbers between 2 and 20 //!!餘數
    // Use: for loop + if
      for (int i = 2; i<=20; i++){
        if (i % 2 == 0){ 
          System.out.println(i);
        }
      }
 // 4. Print the numbers between 1 and 100, which can be divided by 3 or 5
    // Use: for loop + if
    for (int j=1; j<=100; j++){
      if(j%3==0 || j%5 ==0){
        System.out.println(j);
      }}
 // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int total=0;
    for (int k = 0;k<15; k++){ //k<=15?
      if(k>=0 && k<=15){//sum +=i;
        total +=k;
        System.out.println("vs1."+total);
      }
      
       // int sum=0;
       // for (int k1 = 0; k1<=15;k1++){
        //  sum +=k1;

        
       // System.out.println("vs2." +"The sum of numbers between 0 and 15 is:"+sum);

      }

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if

    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i<11; i++){
      if(i<10){
        if(i%2==1){
          evenSum +=i;
        }
      }else{
        for (int j = 0; j<11; j++){
        if(j<10){
          if(j%2==0){
            oddSum +=j;
      }
      }
      }
      }
      }
      System.out.println("The sum up of all odd numbers btw 0 - 10:"+evenSum);
      System.out.println("The sum up of all even numbers between 0-10:" +oddSum);
     
      // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    if(str7.contains("d")){
      System.out.println("d is found.");
    }else{
      System.out.println("d is not found.");
    }
    //-->係邊個位丫？

    // 8. Check if the string s8b is a substring of s8a //!!唔識 但知我聽過
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean found =false;
    for(int i=0; i<=s8a.length()-s8b.length();i++){
      if(s8a.substring(i, i+s8b.length()).equals(s8b)){
        found = true;
        break;
      }
    }
    if(found){
      System.out.println("s8b is a substring.");
    }else{
      System.out.println("s8b is not a substring.");
    }
 // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';

    int count = 0;
      for (int i = 0; i<s9.length();i++){
        if(s9.charAt(i) ==c9){
          count++;
        }
      }
System.out.println("count="+count);

// 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method

    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
      for (int i=0; i<arr10.length; i++){
        arr10[i] = arr10[i].replace('x','k');
      }
      //唔明點解用"\""& ",";
      System.out.print("arr10:[");
      for(int i=0; i<arr10.length; i++){
        System.out.print("\"" +arr10[i]+"\"");
        if(i<arr10.length -1){
          System.out.println(",");
        }
      }
      System.out.println(("]"));

      // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int countUppercase = 0;

    for(int i=0; i<s11.length();i++){
      char ch = s11.charAt(i);
      if (ch>='A' && ch<= 'z'){
        countUppercase++;
      }
    }
System.out.println("count uppercase="+ countUppercase);

 // 12. Print the following pattern of * value
    // *****
    // *****
    // *****

      for (int i=0; i<3; i++){
        for (int j = 0;j <5;j++){     
          System.out.print("*");  
        }
        System.out.println();
      }
 // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score

    String s13 = "lrlaudbucp"; //1+3+1-1+4+2-1+4-1-1
    int totalScore = 0;

    for (int i=0, i< s13.length(); i++){
      char ch = s13.charAt(i);
      switch (ch) {
        case '1':
        totalScore +=1;
        break;
      }

    }

     // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
     long[] arr14 = new long[4];
            arr14[0]=1l;
            arr14[1]=4l;
            arr14[2]=9l;
            arr14[3]=-4l;

      // 15. Find the max value and min value in arr14
    // Use One Loop + if
        long max =arr14[0];
        long min = arr14[0];

        for(int i=1; i<arr14.length; i++){
          if (arr14[i] >max){
            max = arr14[i];
          }else if (arr14[i] < min){
            min = arr14[i];
          }
        }
        System.out.println("Max value: " +max);
        System.out.println("Min values: " +min);

        // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
        float[] arr16= new float[3];
                arr16[0] = 0.2f;
                arr16[1] = 0.3f;
                arr16[2] = 0.6f;

        // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    BigDecimal addValue = new BigDecimal("0.1"); //<- addValue
    BigDecimal[] result = new BigDecimal[arr16.length];

for (int i=0; i<arr16.length; i++){
  BigDecimal bd = new BigDecimal (Float.toString(arr16[i]));
  bd = bd.add(addValue);
  bd = bd.setScale(1,RoundingMode.HALF_UP);
  result[i] = bd;

}
System.out.println(Arrays.toString(result));

// 18. Count the number of target strings in the String[]
String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
String target = "Tommy";
// Print "count name=2"
  int count1 = 0;
  for (String name:arr18){
    if(name.equals(target)){
      count++;
    }
  }
System.out.println("count name=" +count);

// 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";

  }
}