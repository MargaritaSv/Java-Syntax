import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Margarita on 17-Oct-15.
 */
public class Regex {
    public static void main(String[] args) {
        //1
        //  Pattern p = Pattern.compile("^[a-zA-Z]+([0-9]+).*"); ñ òîçè regex ñàìî âåäíúæ ñå ìà÷âà
        Pattern p = Pattern.compile("\\d+");
        Matcher mt = p.matcher("Testing123Cat365Dog5");

        while (mt.find()) {
            System.out.println(mt.group());
        }

        //2
        String text = "I lost my wallet\"\t\tmatches\n" +
                "\"I lost my wallets\"\t\tmatches\t\tthe ‘s’ is not needed, is ignored\n" +
                "\"I lost my: car\"\t\tmatches\n" +
                "\"I lost my- car\"\t\tdoesn’t match\t‘-‘ is not allowed in our pattern\n" +
                "\"I lost my: cell\"\t\tdoesn’t match\tall of ‘cell phone’ is needed\n" +
                "\"I lost my: cell phone\"\tmatches\n" +
                "\"I lost my cell phone\"\t\tmatches\n" +
                "\"I lost my marbles\"\t";

        Pattern pat = Pattern.compile("I lost my:? (wallet|car|cell phone|marbles)");
        Matcher mt2 = pat.matcher(text);

        while (mt2.find()) {
            System.out.println(mt2.group());
        }


        //3
        List<String> number = new ArrayList<>();

        number.add("788-7678-76898");
        number.add("9876-5-4321");
        number.add("987-65-4321 (attack)");
        number.add("987-65-4321 ");
        number.add("192-83-7465");

        for (String ssn : number) {

            if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
                System.out.println("Found good SSn: " + ssn);
            }
        }


        //4
        String input = "I have a cat, but i love my dog more.I don't have a tiger.Elephant i s just fine.WTF??? :D";
        Pattern p1 = Pattern.compile("(dog|cat|elephant|tiger|snake|wolf|bear)");
        Matcher mt3 = p1.matcher(input);
        List<String> animals = new ArrayList<>();

        while (mt3.find()) {
            System.out.println("Found a " + mt3.group() + ".");
            animals.add(mt3.group());
        }

//5
        String input3 = "User clientId=23421. Some more text clientId=33432. This clientNum=100";
        Pattern pt3 = Pattern.compile("(clientId=)(\\d+)");
        Matcher m = pt3.matcher(input3);

        StringBuffer result = new StringBuffer();
        while (m.find()) {

            System.out.println("Masking: " + m.group(2));
            m.appendReplacement(result, m.group(1) + "privete");
        }

        m.appendTail(result);
        System.out.println(result);

        //6
        String str ="Elvis Aaron Presley (January 8, 1935 – August 16, 1977) " +
                "was one of first and most famous American rock and roll’s superstars. " +
                "His fame lasted long after his death. He was also an actor who starred in many movie";

        Pattern pat1 = Pattern.compile("(January|February|March|April|May|June|July|August|September|October|November|December)" +
                "\\s([1-9]|[1-2]\\d|3[0-1]),\\s(\\d{3,4})");

        Matcher mat = pat1.matcher(str);

        while(mat.find()){
            System.out.println("Only months: "+mat.group(1));
            System.out.println("Dates -> "+mat.group());
        }


    }
}
