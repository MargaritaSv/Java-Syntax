import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _10_Extract_words {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();

        String rg = "([a-zA-z]+)";  //"[a-zA-Z]{2,}"
        Pattern pat = Pattern.compile(rg);
        Matcher mt = pat.matcher(text);

        while (mt.find()) {
           System.out.print(mt.group()+" ");
        }

    }
}
