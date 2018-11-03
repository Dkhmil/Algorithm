package khmil;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8};
        int target = 6;
        twoSum(nums, target);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] fin = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            for (int j = nums.length - 1; j >= 0; j--) {
                if (i == j) continue;
                if (nums[j] == c) {
                    fin[0] = j;
                    fin[1] = i;
                    break;
                }
            }
        }
        return fin;
    }
}

