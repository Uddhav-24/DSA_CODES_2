// PROBLEM: Maximum sum of non-adjacent elements


//PROBLEM LINK: https://www.codingninjas.com/studio/problems/maximum-sum-of-non-adjacent-elements_843261


// PLATFORM: Coding Ninjas


// DIFFICULTY: MEDIUM


//This is the MEMOMIZATION SOLUTION


//Memoization solution will give you TLE ERROR. Hence, we need to move towards Tabulation(Bottom-up Approach).


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 6, 9, 7, 10, 2));

        System.out.println(maximumNonAdjacentSum(nums));
    }
    private static int maxNonAdjacentSumHelper(ArrayList<Integer> nums, int index) {
        // BASE CASE
        if (index < 0) {
            return 0;
        }

        int optnA = maxNonAdjacentSumHelper(nums, index - 2) + nums.get(index);

        int optnB = maxNonAdjacentSumHelper(nums, index - 1);

        return Math.max(optnA, optnB);
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
        return maxNonAdjacentSumHelper(nums, n - 1);
    }
}