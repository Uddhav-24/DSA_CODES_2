// PROBLEM: Count Good Numbers


//PROBLEM LINK: https://leetcode.com/problems/count-good-numbers/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {
    public int countGoodNumbers(long n) {
        // for n length digit there are n/2 odd indices
        long oddInds = n>>1;
        // for n length digit there are (n+1)/2 even indices
        long evenInds = (n+1)>>1;

        int mod = 1000000007;

        // the digits at odd indices are prime (2,3,5,7)
        // that mean in total 4 choices for each (n/2) places {i.e. 4^(n/2)}
        long oddPow = pow(4,oddInds, mod);
        // the digits (0-indexed) at even indices are even (0, 2, 4, 6, 8)
        // that mean in total 5 choices for each (n+1)/2 places {i.e. 5^((n+1)/2)}
        long evePow = pow(5, evenInds, mod);

        // overall combinations will be product of all even & odd places combinations
        long ans = (oddPow*evePow) %mod;
        return (int)ans;
    }

    // this method is known as binary exponentiation to get pow(a,b) in TC : O(logn)
    public long pow(int x, long p, int m) {
        if(p == 0)
            return 1L;

        long ans = pow(x, p>>1, m);

        if((p&1)==1)         // same as p%2 == 1
            return (ans * ans * x) % m;
        return (ans * ans) % m;
    }

}
