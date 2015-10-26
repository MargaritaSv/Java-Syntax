import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Margarita on 17-Oct-15.
 */
public class _07_Random_From_N_to_M {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int start = read.nextInt();
        int end = read.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            numbers.add(i);
        }

        Random rnd = new Random();
        int lengthNums = numbers.size();
        while (lengthNums > 0) {
            int num = rnd.nextInt(lengthNums);
            System.out.print(numbers.remove(num) + " ");
            lengthNums--;
        }
    }
}
