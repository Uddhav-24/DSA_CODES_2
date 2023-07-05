// PROBLEM: Pascal's Triangle


//PROBLEM LINK: https://leetcode.com/problems/pascals-triangle/


// PLATFORM: LEETCODE


// DIFFICULTY: EASY


import java.util.ArrayList;
import java.util.List;

public class Generate {


    // Change the CLASS NAME

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1);
            ans.add(Arrays.asList(temp));
        }

        for (int i = 2; i < numRows; ++i)
            for (int j = 1; j < ans.get(i).size() - 1; ++j)
                ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

        return ans;
    }
}
