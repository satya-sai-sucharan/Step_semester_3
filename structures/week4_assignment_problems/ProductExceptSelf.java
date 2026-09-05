package structures.week4_assignment_problems;

import java.util.Arrays;

public class ProductExceptSelf {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;

        // Forward pass
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;

        // Backward pass
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] answer = productExceptSelf(nums);

        System.out.println(Arrays.toString(answer));
    }
}
