// 2ND APPROACH TO REVERSING THE WORDS IN THE STRINGS QUESTION ON LEETCODE

//I HAVE ALREADY UPLOADED 1st solution to this on this repo, filename: reverseWords.java  


public class test {
    static private String result(String x){
        int left = 0;
        int right = x.length() - 1;

        String temp = "";
        String ans = "";

        while(left < right){
             char ch = x.charAt(left);
             if(ch!= ''){
                 temp += ch;
             }
             else if(ch == ''){
                 if(!ans.equals("")){
                     ans = temp + " " + ans;
                 }
                 else{
                     ans = temp;
                 }
                 temp = "";
             }
             left++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp + " " + ans;
            }
            else{
                ans = temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String st = "The sky is blue";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.println(result(st));
    }
}
