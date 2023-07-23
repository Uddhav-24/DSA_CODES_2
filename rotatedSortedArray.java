// PROBLEM: Search in Rotated Sorted Array


//PROBLEM LINK: https://leetcode.com/problems/search-in-rotated-sorted-array/description/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            if(nums[start] == target) return start;
            if(nums[end] == target) return end;
            start ++;
            end--;
        }
        return -1;
    }

}
