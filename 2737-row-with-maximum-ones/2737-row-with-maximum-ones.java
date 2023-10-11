class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int maxOnes = 0;
        int rowId = 0;

        for (int row = 0; row < mat.length; row++) {
            int countOnes = 0;
            for (int col = 0; col < mat[0].length; col++){
                if (mat[row][col] == 1){
                    countOnes++;
                }
            }

            if (countOnes > maxOnes){
                maxOnes = countOnes;
                rowId = row;
            }

        }

        return new int[]{rowId, maxOnes};
    }
}

/*
    Time Complexity: O(n*m)
    Space Complexity: O(1)
 */