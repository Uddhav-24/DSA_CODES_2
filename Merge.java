// PROBLEM: Merge Intervals


//PROBLEM LINK: https://leetcode.com/problems/merge-intervals/description/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


import java.util.ArrayList;
import java.util.Arrays;


//Change the CLASS NAME


class Solution {
        public int[][] merge(int[][] intervals) {
            ArrayList<int[]> results = new ArrayList<>();
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            for (int i = 0 ; i < intervals.length ; i++){
                if (results.size() == 0 || results.get(results.size()-1)[1] < intervals[i][0])
                    results.add(intervals[i]);
                else
                    results.get(results.size()-1)[1] = Math.max(results.get(results.size()-1)[1], intervals[i][1]);
            }

            return results.toArray(new int[results.size()][]);
        }
    }

