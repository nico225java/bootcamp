public class DemoInteger {
  public static void main(String[] args){
    Integer x = 3;//autobox
    Integer y =128; //autobox

//check if y >x?
    System.out.println(y.compareTo(x)>0);//true
    System.out.println(y>x);//true

    Integer y2 = 128;
    System.out.println(y2);//0
    System.out.println(y==y2);//false, because y and y2 are different objects

    Integer x2 = 3;
    System.out.println(x == x2);//false, because y and y2 are different objects?? -> //true

    Integer x3 = new Integer(3);//強行開呢個object 開多個3
    System.out.println(x == x3);//false

    Integer x4 = Integer.valueOf(3);
    System.out.println(x == x4);//true

    
  }
}
