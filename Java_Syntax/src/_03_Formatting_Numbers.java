import java.util.Locale;
import java.util.Scanner;

public class _03_Formatting_Numbers {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);

        int num1 = read.nextInt();
        double num2 = read.nextDouble();
        double num3 = read.nextDouble();

        String hexStr = Integer.toHexString(num1).toUpperCase();
        int binaryInt = Integer.parseInt(Integer.toBinaryString(num1));

        String format;

        if (num3 % 1 == 1) {
            format = "|%-10s|%010d|%10.2f|%-10.0f|";
        } else {
            format = "|%-10s|%010d|%10.2f|%-10.3f|";
        }

        System.out.printf(format, hexStr, binaryInt, num2, num3);
        //read.nextInt();
    }
}
