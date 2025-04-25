public class DemoOperator {
    public static void main(String[] args) {
        int x=0;
        x++;
        System.out.println(x);//5

        ++x;
        System.err.println(x);//7

        x = x++ + 1; // 7+1
        System.out.println(x);//8

        //!!!


        int y = 2;
        x = ++y +1;
        System.err.println(x); //4

        x = y++ +1;
        System.out.println(x);

        int k = 0;
        while (++k <4){
          System.out.println("hello");

        }
        
        y = 8;
        x = ++y + ++y =2;
        //Step1: first ++y ->9
        //Step2: second ++y ->10
        //Step3: 9+10+2 
        System.out.println(x);//21

    }
}
