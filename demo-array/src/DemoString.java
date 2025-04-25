
public class DemoString {
  public static void main(String[] args) {
      //week 1:equals(),length(),charAt()工具
      //week 2:Other String methods 方法
      //1.replace()
      System.out.println("bootcamp".replace('o','x'));//bxxtcamp
      //2個參數 原因右'x'取代右'o'
      System.err.println("bootcamoop".replace("oo","lll"));//bllltcamlllp

      //2.indexOf()重點/ charAt oppsite
      System.out.println("hello".indexOf('o'));//4
      System.out.println("hello".indexOf('a'));//-1
      System.out.println("hello".indexOf(' '));//-1

      //3.concat()
      String s11 = "hello" +"world";
      System.out.println(s11);
      //"+" -> slow performance
      String s2 = "hello".concat("world");
      System.out.println(s2);

      //4. lastIndexOf()
      System.out.println(","+"hello".indexOf('l'));//2, indexOf() -> firstIndexOf
      System.out.println("x"+"hello".lastIndexOf('l'));
      System.out.println("q"+"hello world".lastIndexOf('l'));

      //5. isEmpty()
      boolean result="".isEmpty();
      System.out.println(result);//true
      System.out.println("hello".isEmpty());//false

      //6.trim()-> space 去除所有space
      System.out.println("hello world !!!".trim());
      System.out.println("hello world !!!".trim().length());
      //chain methods: coding style
      System.out.println("hello".replace('e','a').trim().charAt(1));//a
      //charAt->primriate 無野架啦,String methods return different types
      System.out.println("hello".replace('L','x'));

      //7.substring 尋字串中既字
      //!!end index -1 : 'l' -> index 2
      //'e' -> index 1,..'l'-> index 2
      //
      System.out.println("*" + "www.yahoo.com".substring(4,9));//el
      //(i,i+1)出一個字,(i,i+2)出2個字,(i,i+3)出3個字 i代表starting point
      
      System.out.println("hello".substring(0));//hello, from index 0, to the end of string

      String unknown = "hello world";
      //extract the second & third characters
      //if the string not long enough, extract as much  as possible 

      //"h"->""
      System.out.println("hello".substring(0,1));
      //"he" -> "e"
      System.out.println("hello".substring(0,2));//(1,3)
      //"hell"->"el"
      //System.out.println("hello".substring(3,));

      //"hello world"->"el"
          //System.out.println(unknown.substring(startIndex, endIndex +1));
        //8. toLowerCase()
        System.out.println("HELLO!!!".toLowerCase());//hello!!!
        System.out.println("heLLo!!!".toLowerCase());//hello!!!
        System.out.println("hello!!!".toUpperCase());//HELLO!!!
        System.out.println("heLLo!!!".toUpperCase());//HELLO!!!

        //!!!9. contains()
        System.out.println("hello".contains("ll"));//true
        String name =  "Steven";
        if (name.contains("t")){
          System.out.println("Yes.Your name contains t charcater.");
//scanner?
          String name1 = "Nicole";
          if(name1.contains("i")){
            System.out.println("Yes.Your name contains i charcater.");
          }
        }
      System.out.println("陳大明".contains("陳"));//true
      System.out.println("陳大明".contains("小"));//false

        //10. startsWith(), endsWith()
        System.out.println("hello".startsWith("he"));//true
        System.out.println("hello".startsWith("helll"));//false
        System.out.println("hello".startsWith("lo"));//true
        System.out.println("hello".startsWith("oo "));//false
        

  }
}
