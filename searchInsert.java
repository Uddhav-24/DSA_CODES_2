// PROBLEM: Search Insert Position


//PROBLEM LINK: https://leetcode.com/problems/search-insert-position/description/


// PLATFORM: LEETCODE


// DIFFICULTY: EASY



class Solution {


    //Change the CLASS NAME

    
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high){
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}