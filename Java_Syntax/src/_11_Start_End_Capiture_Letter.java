import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11_Start_End_Capiture_Letter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();

        Pattern pat = Pattern.compile("\\b[A-Z][A-z]*[A-Z]\\b");
        Matcher mt = pat.matcher(text);

        while (mt.find()) {
            System.out.print(mt.group() + " ");
        }
    }
}
