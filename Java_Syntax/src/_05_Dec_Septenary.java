import java.util.Scanner;

/**
 * Created by Margarita on 17-Oct-15.
 */
public class _05_Dec_Septenary {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num = read.nextInt();
        String sept = Integer.toString(num, 7);
        System.out.print(sept);
    }
}
