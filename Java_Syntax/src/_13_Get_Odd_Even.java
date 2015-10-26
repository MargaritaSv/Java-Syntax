import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Margarita on 18-Oct-15.
 */
public class _13_Get_Odd_Even {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] nums = read.nextLine().split(" ");
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
                countEven++;
            } else {
                odd.add(arr[i]);
                countOdd++;
            }
        }

        if (countOdd < countEven) {
            System.out.println(even);
            System.out.format("Get %d even.", countEven);
        } else {
            System.out.println(odd);
            System.out.format("Get %d odd.", countOdd);
        }
    }
}
