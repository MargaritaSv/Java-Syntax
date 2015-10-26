import java.util.Random;

/**
 * Created by Margarita on 17-Oct-15.
 */
public class Random_Razni {
    public static void main(String[] args) {
            System.out.println("Random numbers between 0.0 and 1.0 are,");
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number [" + (i+1)+"]: "+Math.random());
        }

        System.out.println("Random numbers between 1 and 100");
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number [" +(i+1)+"]:" +(int)(Math.random()*100));
        }

        Random rnd = new Random();
        int rndNum = 1+rnd.nextInt(100);
        System.out.println("random between[1...99]" +rndNum);
    }
}
