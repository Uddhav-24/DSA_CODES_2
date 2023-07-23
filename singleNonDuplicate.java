// PROBLEM: Single Element in a Sorted Array


//PROBLEM LINK: https://leetcode.com/problems/single-element-in-a-sorted-array/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) ||(mid%2 == 1 && nums[mid] == nums[mid - 1])){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
    }
}
