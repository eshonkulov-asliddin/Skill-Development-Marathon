class Pair {

    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }

}
class Solution {

    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;

        boolean[][] visited = new boolean[ROWS][COLS];

        int count = 0;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++){
                // condition
                if (grid[r][c] == '1' && !visited[r][c]){
                    DFS(grid, r, c, visited);
                    count++;
                }

            }
        }

        return count;
        
    }


    public void DFS(char[][] grid, int r, int c, boolean[][] visited) {

        int ROWS = grid.length;
        int COLS = grid[0].length;

        if (r < 0 || r >= ROWS || c < 0 || c >= COLS || grid[r][c] == '0' || visited[r][c]){
            return;
        }

        visited[r][c] = true;

        DFS(grid, r - 1, c, visited);
        DFS(grid, r + 1, c, visited);
        DFS(grid, r, c - 1, visited);
        DFS(grid, r, c + 1, visited);

    }

}