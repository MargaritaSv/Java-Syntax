import java.util.Scanner;

public class _12_Character_Multiplier {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String letter1 = read.nextLine();
        String letter2 = read.nextLine();

        int sum = 0;
        if (letter2.length() == letter1.length()) {
            int index = 0;
            while (letter1.length() > index) {
                int pos1 = letter1.charAt(index);
                int pos2 = letter2.charAt(index);
                index++;
                int mult = pos1 * pos2;
                sum += mult;
            }
        } else if (letter2.length() > letter1.length()) {
            for (int i = 0; i < letter1.length(); i++) {
                sum += letter1.charAt(i) * letter2.charAt(i);
            }
            for (int i = letter1.length(); i < letter2.length(); i++) {
                sum += letter2.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
