// PROBLEM: Search a 2D Matrix


//PROBLEM LINK: https://leetcode.com/problems/search-a-2d-matrix/


// PLATFORM: LEETCODE


// DIFFICULTY: MEDIUM


class Solution {


    //Change the CLASS NAME


    public boolean searchMatrix(int[][] matrix, int target) {
        
        int low = 0;
        
        if(matrix.length == 0)
            return false;
        
        int n = matrix.length;
        
        int m = matrix[0].length;
        
        int high = (n*m) - 1;

        while(low <= high){
            int mid = (low + (high - low)/2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
