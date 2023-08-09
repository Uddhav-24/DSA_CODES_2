// PROBLEM: Subset Sum


//PROBLEM LINK: https://www.codingninjas.com/studio/problems/subset-sum_3843086?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0


// PLATFORM: CODING NINJAS


// DIFFICULTY: EASY


import java.util.ArrayList;
import java.util.Collections;

class Scratch {
    public static void main(String[] args) {
        int[] num = {1, 2};
        ArrayList<Integer> result = subsetSum(num);
        System.out.println(result);
    }
    public static ArrayList<Integer> ans;

    private static void subset(int i, int sum, int[] num){
        if(i == num.length){
            ans.add(sum);
            return;
        }
        subset(i + 1, sum + num[i], num);

        subset(i + 1, sum, num);
    }
    public static ArrayList<Integer> subsetSum(int[] num) {
        ans = new ArrayList<Integer>();
        subset(0, 0, num);

        Collections.sort(ans);
        return ans;
    }
}