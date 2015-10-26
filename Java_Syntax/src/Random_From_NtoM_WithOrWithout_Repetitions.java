import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Margarita on 26-Oct-15.
 */
public class Random_From_NtoM_WithOrWithout_Repetitions {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        int min= Math.min(num1,num2);
        int max =Math.max(num1,num2);

        Random rnd = new Random();

        for (int i = min; i <=max ; i++) {
            System.out.print((rnd.nextInt(max-min+1)+min)+" ");
        }


        System.out.print("\nwitout repetions\n");

        ArrayList randomized = new ArrayList<>();
        int border = max - min + 1;

        for (int i = 0; i < border; i++) {
            int rndNum = rnd.nextInt(border) + min;

            while (randomized.contains(rndNum)) {
                rndNum = rnd.nextInt(border) + min;
            }
            randomized.add(rndNum);
        }

        System.out.println(randomized);

    }
}
