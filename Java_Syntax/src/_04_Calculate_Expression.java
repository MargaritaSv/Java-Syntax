import java.util.Scanner;

public class _04_Calculate_Expression {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();

        double f1 = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / Math.sqrt(c));
        double f2 = Math.pow((a * a + b * b - c * c * c), a - b);

        double sum = (a + b + c) / 3 - (f1 + f2) / 2;

        System.out.printf("F1 = %.2f; F2 = %.2f; Diff = %.2f\n", f1, f2, Math.abs(sum));

        //********************************************

        double stepen = Math.sqrt(c);

        double sum1 = Math.pow(((Math.pow(a, 2)) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)),(a + b + c) / stepen);

        double sum2 =Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3),a-b );

        Double diff1 = Math.abs(((a + b + c) / 3) - ((sum1 + sum2) / 2));

        System.out.printf("F1 = %.2f; F2 = %.2f; Diff = %.2f\n", sum1, sum2, diff1);
    }
}
