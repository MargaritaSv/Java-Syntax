import java.text.DecimalFormat;

/**
 * Created by Margarita on 17-Oct-15.
 */
public class Convert {
    public static void main(String[] args) {

        long num = -786;
        String numAsStr = Long.toString(num);

        System.out.println(numAsStr);
        //or
        String numAsStr1 = "-765";
        System.out.println(numAsStr1);

        //more effective because a new instance of Long is created before conversion is performed

        long num2 = -321;
        Long longInstance = new Long(num2);
        String numAsStr2 = longInstance.toString();
        //short
        long num3 = -321;
        String numAsstr3 = new Long(num3).toString();
        //one line
        String num4 = new Long(-321).toString();

        System.out.println(num4);
//converting a long to String object
        long num5 = -721;
        String numAsStr5 = String.format("%d", num5);
        System.out.println(num5);

        //Decimal Format

        long number = 1234567809;

        DecimalFormat dF = new DecimalFormat("#,##0");
        String numStr = dF.format(number);
        System.out.println(numStr);

        DecimalFormat dF1 = new DecimalFormat("#");
        String n = dF1.format(number);
        System.out.println(n);

        //StringBuffer is a class that is used to concatenate multiple values into a
        // String. StringBuilder works similarly but not thread safe like StringBuffer.
        // These two classes can be used to convert a Java Long to String.

        long number1 = -956;
        StringBuffer buffer = new StringBuffer();
        buffer.append(number1);
        String numAsStr6 = buffer.toString();

        //short

        String voala = new StringBuilder().append(-65654).toString();
        System.out.println(voala);

        //quick solution
        String nbnb = "" + number1;

        long pos = 84;
        String binStr = Long.toBinaryString(pos);
        String octalStr = Long.toOctalString(pos);
        String hex = Long.toHexString(pos);

        System.out.println(binStr + " " + octalStr + " " + hex);

        //custom Base/Radix
        String conv = Long.toString(pos, 7);
        System.out.println(pos + " -> " + conv);

        int remainder = 100 % 9;
        System.out.println(remainder);

        int result = 100;
        result %= 9;
        System.out.println(result);

    }
}
