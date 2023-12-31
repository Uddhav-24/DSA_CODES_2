// PROBLEM: Next Permutation


//PROBLEM LINK: https://leetcode.com/problems/next-permutation/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


public class nextPermutation {

    // Change the CLASS NAME

    public void nextPermutation(int[] nums) {
        int n = nums.length, k = n - 2, l = n - 1;
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }
        if (k < 0) {
            reverse(nums, 0, n - 1);
        } else {
            while (l > k && nums[l] <= nums[k]) {
                l--;
            }
            swap(nums, k, l);
            reverse(nums, k + 1, n - 1);
        }
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
