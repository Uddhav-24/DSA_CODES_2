// PROBLEM: Reverse Pairs


//PROBLEM LINK: https://leetcode.com/problems/reverse-pairs/description/


// PLATFORM: LEETCODE


// DIFFICULTY: HARD


class Solution {


    // Change the CLASS NAME


    int mergeSort(int nums[], int low, int high){
        //if it is a single element then return 0
        if(low>=high)
            return 0;
        int mid=(low+high)/2;
        //left half
        int inv=mergeSort(nums,low,mid);
        //right half
        inv+=mergeSort(nums,mid+1,high);
        //call the merge function to compute the no of reverse pairs
        inv+=merge(nums,low,mid,high);
        return inv;
    }

    static int merge(int nums[],int low,int mid,int high){
        int c=0;
        //keep j at the starting position in the right half of the array
        int j=mid+1;
        //iterate in the left part of the array and check if the right half of the array is exhausted and also check if the required condition is true
        for(int i=low;i<=mid;i++){
            while(j<=high &&  nums[i]> (2* (long) nums[j])){
                j++;
            }
            //count the no of left elements
            c+=(j-(mid+1));
        }

        ArrayList<Integer> temp= new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right <=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }
        }
        //copy the left part and the right part to the ArrayList
        while(left<=mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        for(int i = low; i<=high;i++) {
            nums[i] = temp.get(i - low);
        }
        return c;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}
