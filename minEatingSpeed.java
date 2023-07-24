// PROBLEM: Koko Eating Bananas


//PROBLEM LINK: https://leetcode.com/problems/koko-eating-bananas/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public int minEatingSpeed(int[] arr, int h) {

        int end=-1;
        int fin=0;
        for(int i=0;i<arr.length;i++){
            end=end>arr[i]?end:arr[i];
        }
        int start=0;
        int ans=start+(end-start)/2;
        while(start<=end){
            ans=start+(end-start)/2;
            if(!check(arr,h,ans)){
                start=ans+1;
            }
            else{
                fin=ans;
                end=ans-1;
            }
        }
        return fin;
    }
    static boolean check(int []arr,int h,int ans){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double)ans);

            if(sum>h){
                return false;
            }
        }
        return true;
    }
}
