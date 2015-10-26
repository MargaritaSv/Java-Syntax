import java.util.Scanner;

public class _08_Odd_Even_Pairs {
    public static void main(String[] args) {
        String[] nums = new Scanner(System.in).nextLine().split(" ");

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        if (nums.length % 2 == 0) {

            for (int i = 0; i < arr.length; i += 2) {

                if ((arr[i] % 2 == 0) && arr[i + 1] % 2 == 0) {
                    System.out.format("%d, %d -> both are even\n", arr[i], arr[i + 1]);
                } else if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0)) {
                    System.out.format("%d, %d -> both are odd\n", arr[i], arr[i + 1]);
                } else {
                    System.out.printf("%d, %d -> diffent\n", arr[i], arr[i + 1]);
                }
            }

        } else {
            System.out.println("Invalid length.");
        }
    }
}
