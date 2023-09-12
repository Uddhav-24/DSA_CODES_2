// PROBLEM: Longest Substring Without Repeating Characters


//PROBLEM LINK: https://leetcode.com/problems/longest-substring-without-repeating-characters/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


import java.util.HashSet;
import java.util.Set;


//Change the CLASS NAME


class Scratch{
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;

        Set<Character> charSet = new HashSet<>();

        int left = 0;

        for(int right = 0; right < n; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxlen = Math.max(maxlen, right - left + 1);
            }
            else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxlen;
    }
}
