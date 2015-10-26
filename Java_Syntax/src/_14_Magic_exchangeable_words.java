import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _14_Magic_exchangeable_words {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String fWord = read.next();
        String secWord = read.next();

        boolean exchangeble = isValidExchange(fWord, secWord);
        System.out.println(exchangeble);
    }

    private static boolean isValidExchange(String fWord, String secWord) {

        boolean exchangeble = true;

        Map<Character, Character> comb = new HashMap<>();
        for (int i = 0; i < fWord.length(); i++) {
            if (!comb.containsKey(fWord.charAt(i))) {
                comb.put(fWord.charAt(i), secWord.charAt(i));
            } else if ((comb.get(fWord.charAt(i)) != secWord.charAt(i))) {
                exchangeble = false;
                break;
            }
        }
        return exchangeble;
    }
}
