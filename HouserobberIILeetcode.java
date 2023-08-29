// PROBLEM: HOUSE ROBBER II


//PROBLEM LINK: https://leetcode.com/problems/house-robber-ii/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


//Change the CLASS NAME


class Scratch {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 8, 9, 5, 9};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return nums[0];
        }

        return Math.max(robHelper(nums, 0, n - 2), robHelper(nums, 1, n - 1));
    }

    public static int robHelper(int[] nums, int start, int end) {
        int n = end - start + 1;
        int[] dp = new int[n];

        dp[0] = nums[start];

        if (n > 1) {
            dp[1] = Math.max(nums[start], nums[start + 1]);
        }

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
