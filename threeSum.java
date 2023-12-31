// PROBLEM: 3Sum


//PROBLEM LINK: https://leetcode.com/problems/3sum/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


// Change the CLASS NAME


class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 ||(i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=nums.length-1;
                int sum=0-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low]==nums[low+1])    low++;
                        while(low<high && nums[high]==nums[high-1])  high--;
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]<sum){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return result;
    }
}