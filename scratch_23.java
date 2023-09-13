// PROBLEM: Candy


//PROBLEM LINK: https://leetcode.com/problems/candy/


// PLATFORM: LEETCODE


// DIFFICULTY: HARD


import java.util.Arrays;

class Scratch {


    //Change the CLASS NAME


    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy2 = new int[n];
        Arrays.fill(candy2, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy2[i] = candy2[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy2[i] = Math.max(candy2[i], candy2[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candy2) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}