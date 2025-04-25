import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
    public static void main(String[] args) {
        // double + double
        System.out.println(0.1 + 0.2);// 0.30000000004

        // !!BigDecimal 只有2種方法入面creation

        // Solution
        BigDecimal bd1 = new BigDecimal("0.1");// approach
        BigDecimal bd2 = BigDecimal.valueOf(0.2);// approach 2(prefer)
        System.out.println(bd1);
        System.out.println(bd2);

        // bd1 + bd2->0.3
        // ! add()

        // BigDecimal bd3 = bd1.add(bd2);
        System.err.println(bd3);
        System.err.println(bd1);
        System.err.println(bd2);

        // !subtract() -數
        BigDecimal bd4 = bd1.subtract(bd2);
        // !multiply() x數
        BigDecimal bd5 = bd1.multiply(bd2);
        // !divide() /數
        BigDecimal bd6 = bd1.divide(bd2);
        // BigDecimal divide BigDecimal
        // Big

        BigDecimal bd7 =
                BigDecimal.valueOf(10.0).divide(BigDecimal.valueOf(3.0));
        BigDecimal bd8 = new BigDecimal("10.0").divide(BigDecimal.valueOf(3.0));

        BigDecimal bd9 = BigDecimal.valueOf(10.0)
                .divide(BigDecimal.valueOf(3.0), 1, RoundingMode.FLOOR);
        System.out.println(bd9);
        // HALF_UP 8.5/2 ->4.25 (half up)->4.3
        BigDecimal bd10 = BigDecimal.valueOf(8.5)
                .divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_UP);
        System.out.println(bd10);

        // 8.5/2 -> 4.25 (half down) ->4.2
        BigDecimal bd11 = BigDecimal.valueOf(8.5)
                .divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_DOWN);
        System.out.println(bd11);// 4.2

        BigDecimal bd12 = new BigDecimal("5").divide(BigDecimal.valueOf(2));
        System.out.println(BigDecimal.valueOf(-2).abs());// 2

        System.err.println(BigDecimal.valueOf(2).pow(3));// 8

        BIgDecimal scource = BigDecimal.valueOf(2);
        String lan = "Java";
        System.out.println("Java".equals(lan));// true

        bd11.abs();

        // 10/3
        // roubnding? 3.45 -> 3.4 (HALF_DOWN)?3.45->(HALF_UP)?


    }
}
