// PROBLEM: Maximum Subarray


//PROBLEM LINK: https://leetcode.com/problems/maximum-subarray/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


public class maxSubArray {


    // Change the CLASS NAME


    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            if(sum>maxi)
                maxi = sum;
            if(sum<0)
                sum = 0;
        }
        return maxi;
    }
}
