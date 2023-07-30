// PROBLEM: Reverse Words in a String


//PROBLEM LINK: https://leetcode.com/problems/reverse-words-in-a-string/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public String reverseWords(String s) {
        String ans="";
        int n=s.length(),i=n-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
                continue;
            }
            int j=i+1;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(ans.equals(""))   ans=ans+s.substring(i+1,j);
            else    ans=ans+" "+s.substring(i+1,j);
        }
        return ans;
    }
}
