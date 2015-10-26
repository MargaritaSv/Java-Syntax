import java.util.Scanner;

/**
 * Created by Margarita on 25-Oct-15.
 */
public class _06_1_Base7ToBase10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num7 = Integer.parseInt(read.next(),7);
        String num10 = Integer.toString(num7,10);

        System.out.println(num10);
    }
}