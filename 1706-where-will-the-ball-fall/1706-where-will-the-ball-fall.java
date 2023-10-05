class Solution {
    public int[] findBall(int[][] grid) {
        
        int[] ans = new int[grid[0].length];
        
        for (int i = 0; i < grid[0].length; i++){
            ans[i] = findBallDropColumn(0, i, grid);
        }
        
        return ans;
    }
    
    public int findBallDropColumn(int row, int col, int[][] grid) {
        
        if (row == grid.length){
            return col;
        }
        
        int nextColumn = col + grid[row][col];
        if (nextColumn < 0 ||
                nextColumn > grid[0].length - 1 ||
                grid[row][col] != grid[row][nextColumn]) {
            
            return -1;
        }
        
        return findBallDropColumn(row + 1, nextColumn, grid);
        
    }
}

