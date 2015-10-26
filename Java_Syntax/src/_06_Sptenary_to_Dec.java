import java.util.Scanner;

public class _06_Sptenary_to_Dec {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String base7 = read.nextLine();

        for (int i = 1; i < 3000; i++) {

            int scount = i;
            String temp = Integer.toString(scount, 7);

            if (temp.equals(base7)) {
                System.out.println(scount);
                break;
            }
        }
    }
}
