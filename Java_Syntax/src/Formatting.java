import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

public class Formatting {
    public static void main(String[] args) {
            long num =461012;
        System.out.format("1.   %d%n",num);
        System.out.format("2.   %09d%n",num);
        System.out.format("3.   %+d%n",num);
        System.out.format("4.   %,8d%n",num);
        System.out.format("5.   %+,8d%n%n",num);

        double pi = Math.PI;

        System.out.format("6.  %f%n",pi);
        System.out.format("7.  %.3f%n",pi);
        System.out.format("8.  |%10.3f|%n",pi); //kato koordinatnata sistema
        System.out.format("9.  |%-10.3f|%n",pi);
        System.out.format(Locale.GERMANY,"10. %-10.4f%n%n", pi);

        Calendar cal= Calendar.getInstance();

        System.out.printf("%tB %te, %tY%n", cal, cal, cal);
        System.out.format("%tl:%tM %tp%n",cal,cal,cal);
        System.out.format("%tD%n",cal);

        System.out.println("Decimal format:");
customFormat("###,###.###",123456.789);
        customFormat("###.##",123456.789);
        customFormat("00000000.000",123.789);
        customFormat("$###,###.###",12345.67);

        int num5 = 2;
        double r = Math.sqrt(num5);

        System.out.format("The square root of %d is %f . %n",num5,r );

        System.out.format("%f,%1$+020.10f %n",Math.PI,Math.PI);
        System.out.format("%f,%<+020.10f %n", Math.PI);
    }

    static  public void customFormat(String pattern,double value){
        DecimalFormat dF = new DecimalFormat(pattern);
        String output = dF.format(value);
        System.out.println(value+"  "+pattern+"  "+output);
    }
}
