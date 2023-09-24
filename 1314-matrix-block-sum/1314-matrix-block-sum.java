class Solution {

    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int row = mat.length;
        int col = mat[0].length;
        
        int[][] ans = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            
            
            for (int j = 0; j < col; j++) {
                
                int rowStart = i-k >= 0 ? i-k : 0;
                int rowEnd = i+k < row ? i+k : row - 1;
                
                int colStart = j-k >= 0 ? j-k : 0;
                int colEnd = j+k < col ? j+k : col - 1;
                
                int curSum = calculateSum(rowStart, rowEnd, colStart, colEnd, mat);
                
                ans[i][j] = curSum;
            }
        }
        return ans;
        
    }
    
    public int calculateSum(int rowStart, int rowEnd, int colStart, int colEnd, int[][] mat) {
        int sum = 0;
        for(int i = rowStart; i <= rowEnd; i++){
            
            for (int j=colStart; j <= colEnd; j++) {
                
                sum += mat[i][j];
                
            }
        }
        
        return sum;
        
    }
    
}

/*
    Time Complexity: O(n**2 * m**2) 
    Space Complexity: O(1)
*/