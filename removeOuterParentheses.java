// PROBLEM: Remove Outermost Parentheses


//PROBLEM LINK: https://leetcode.com/problems/remove-outermost-parentheses/


// PLATFORM: LEETCODE


// DIFFICULTY: EASY


class Solution {


    //Change the CLASS NAME


    public String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        int openLeft = 0;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }
}