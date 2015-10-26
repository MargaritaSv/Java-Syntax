import java.util.Scanner;

public class _02_Triangle_Area {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double aX,aY,bX,bY,cX,cY;

        aX =read.nextDouble();
        aY = read.nextDouble();

        bX =read.nextDouble();
        bY = read.nextDouble();

        cX =read.nextDouble();
        cY = read.nextDouble();

        double area = Math.abs(aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY))/2;

        System.out.println(Math.round(area));
    }
}
