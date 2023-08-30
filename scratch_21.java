// PROBLEM: Unique Paths


//PROBLEM LINK: https://leetcode.com/problems/unique-paths/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


//This is the top-down(MEMOIZATION) Approach


//Change the CLASS NAME


import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }
    static int countways(int i, int j, int[][]dp){

        if(i == 0 && j == 0)
            return 1;

        if(i < 0 || j < 0)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        int u = countways(i - 1, j, dp);

        int l = countways(i, j - 1, dp);

        return dp[i][j] = u + l;
    }

    public static int uniquePaths(int m, int n) {

        int[][]dp = new int[m][n];

        for(int[] row:dp)
            Arrays.fill(row, -1);

        return countways(m - 1, n - 1, dp);
    }
}