
import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    // array + for loop
    // find max
    int max = Integer.MIN_VALUE;
    int[] arr = new int[] {100, -20, 90, 17, 200};
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];

      }
    }
    System.out.println("Max value= " + max);

    // approach 2
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);

    }
    System.out.println("Max value = " + max);

    int temp = -1;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;

        }
      }
    }
    // for (int i = 0; i<arr.length; i++){
    System.out.println("The result :" + Arrays.toString(arr));
    // }
    // equals(), length(), charAt()

    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs));// [h,e,l,l,o]

    // convert l to x
    // "hello" -> "hexxo"
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'l') {
        chs[i] = 'x';
      } else if (chs[i] == 'a') {
        chs[i] = 'b';
      }

    }

    System.out.println(Arrays.toString(chs));// h,e,x,x,o

    // convert from char[] to String
    System.out.println(String.valueOf(chs));
    // second method;
    System.out.println("hello".replace('l', 'x'));// hexxo

    // equals

    System.out.println("hello".equals("Hello"));// false -> 因為 hello to Hello;大細階既問題
    // 所以hello not = Hello
    System.err.println("hello".equalsIgnoreCase("Hello"));// true ->用左 equalsIgnoreCase tool!

    double[] values = new double[] {0.2, 0.5, 1.9};
    // add 0.1
    // [0.3,0.6,2.0]
    BigDecimal do1 = BigDecimal.valueOf(0.1);

    for (int i = 0; i < values.length; i++) {

      values[i] = BigDecimal.valueOf(values[i]).add(do1).doubleValue();

    }
    System.err.println(Arrays.toString(values));

    // Approach 2
    for (int i = 0; i < values.length; i++) {
      // values[i] = BigDecimal.valueOf(values[i]);
      // .add(BigDecimal.valueOf(0.1))
      // .doubleValue();
      // Sys
    }
    BigDecimal[] bigDecimals = new BigDecimal[3];
    bigDecimals[0] = BigDecimal.valueOf(10.34);
    bigDecimals[1] = new BigDecimal("2.45");
    bigDecimals[2] = BigDecimal.valueOf(9.99);

    System.out.println(Arrays.toString(bigDecimals));// [10.3,2.4,9.9]


    float[] fArr = new float[bigDecimals.length];
    // do1=0.1
    // for loop:bigDecimals ->fArr
    do1 = BigDecimal.valueOf(0.1);
    for (int i = 0; i < bigDecimals.length; i++) {
      fArr[i] = bigDecimals[i].add(do1).floatValue();
      // fArr[i] = bigDecimals[i].floatValue();
    }

    System.out.println(Arrays.toString(fArr));



  }
}
