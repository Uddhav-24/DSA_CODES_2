// PROBLEM: Find the Smallest Divisor Given a Threshold


//PROBLEM LINK: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int num : nums) high = Math.max(num,high);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int total = 0;
            for(int num : nums) {
                total += (num + mid - 1) / mid;
            }
            if(total > threshold) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}
