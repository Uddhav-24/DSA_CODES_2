// PROBLEM: Find Minimum in Rotated Sorted Array


//PROBLEM LINK: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public int findMin(int[] nums) {

        int n = nums.length;
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            mini = Math.min(mini, nums[i]);
        }
        return mini;
    }
}
