import java.util.Scanner;

/**
 * Created by Margarita on 20-Oct-15.
 */
public class _09_Hit_The_Target {
    public static void main(String[] args) {

        int target = new Scanner(System.in).nextInt();

        for (int i=0;i<=20;i++){
            for (int j = 0; j <=20 ; j++) {
                if(i+j!=target){
                    continue;
                }
                System.out.printf("%d + %d = %d\n",i,j,target);
            }
        }

        for (int i=0;i<=20;i++){
            for (int j = 0; j <=20 ; j++) {
                if(i-j!=target){
                    continue;
                }
                System.out.printf("%d - %d = %d\n",i,j,target);
            }
        }
    }
}
