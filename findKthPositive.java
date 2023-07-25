// PROBLEM: Kth Missing Positive Number


//PROBLEM LINK: https://leetcode.com/problems/kth-missing-positive-number/


// PLATFORM: LEETCODE


// DIFFICULTY: EASY


class Solution {


    //Change the CLASS NAME


    public int findKthPositive(int[] arr, int k) {

        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] <= k){
                k++;
            }
            else break;
        }
        return k;
    }
}
