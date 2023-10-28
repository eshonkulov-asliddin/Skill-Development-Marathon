class NumMatrix {

    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int row = row1; row <= row2; row++){
            for (int col = col1; col <= col2; col++){
                sum += this.matrix[row][col];
            }
        }

        return sum;
    }
}

/**
    [[[[3, 0, 1, 4, 2], 
        [5, 6, 3, 2, 1], 
        [1, 2, 0, 1, 5], 
        [4, 1, 0, 1, 7], 
        [1, 0, 3, 0, 5]]], 

        [2, 1, 4, 3], 
        [1, 1, 2, 2], 
        [1, 2, 2, 4]]
 */

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */